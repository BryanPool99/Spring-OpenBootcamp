package com.example.Ejercicio6.Controller;

import com.example.Ejercicio6.Entities.Laptop;
import com.example.Ejercicio6.Repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    //atributos
    private LaptopRepository laptopRepository;
    //constructor
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }
    //obtener la lista de laptops
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }
    //obtener una laptop segun su ID
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
        Optional<Laptop> laptopOptional=laptopRepository.findById(id);
        if(laptopOptional.isPresent()){
            return ResponseEntity.ok(laptopOptional.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    //insertar una nueva laptop
    @PostMapping("api/laptops")
    public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return laptopRepository.save(laptop);
    }
}
