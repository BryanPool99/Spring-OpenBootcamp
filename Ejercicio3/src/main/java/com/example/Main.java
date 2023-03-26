package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);
		PersonRepository personRepository=context.getBean(PersonRepository.class);
		System.out.println("El num de coches en base de datos es: " + personRepository.count());
		//creando un objeto
		Person bryan=new Person(null,"Bryan",23);
		personRepository.save(bryan);
		System.out.println("El num de coches en base de datos es: " + personRepository.count());

		// recuperar todos
		System.out.println(personRepository.findAll());
	}

}
