package com.example.Ejercicio5.Controller;

import com.example.Ejercicio5.Entities.Laptop;
import com.example.Ejercicio5.Repository.LaptopRepository;
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
}
