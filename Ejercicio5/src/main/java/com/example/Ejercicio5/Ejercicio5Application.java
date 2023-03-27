package com.example.Ejercicio5;
/*
	Dentro de la misma app crear las clases necesarias para trabajar con "ordenadores":

	Laptop (entidad)

	LaptopRepository (repositorio)

	LaptopController (controlador)

	Desde LaptopController crear un método que devuelva una lista de objetos Laptop.

	Probar que funciona desde Postman.

	Los objetos Laptop se pueden insertar desde el método main de la clase principal.
*/
import com.example.Ejercicio5.Entities.Laptop;
import com.example.Ejercicio5.Repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio5Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Ejercicio5Application.class, args);
		LaptopRepository repository=context.getBean(LaptopRepository.class);
		//insertar laptop
		Laptop l1=new Laptop("ACER","AMD",8.2,1895.66);
		Laptop l2=new Laptop("HP","INTEL",16.0,3200.10);
		System.out.println("Num laptops en base de datos: " + repository.findAll().size());
		repository.save(l1);
		repository.save(l2);
		System.out.println("Num laptops en base de datos: " + repository.findAll().size());
	}

}
