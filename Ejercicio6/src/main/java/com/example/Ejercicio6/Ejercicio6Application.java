package com.example.Ejercicio6;
/*
	Crear un método en LaptopController que reciba un objeto Laptop enviado
	en formato JSON desde Postman y persistirlo en la base de datos.

	Comprobar que al obtener de nuevo los laptops aparece el nuevo ordenador creado.
*/
import com.example.Ejercicio6.Entities.Laptop;
import com.example.Ejercicio6.Repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio6Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Ejercicio6Application.class, args);
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
