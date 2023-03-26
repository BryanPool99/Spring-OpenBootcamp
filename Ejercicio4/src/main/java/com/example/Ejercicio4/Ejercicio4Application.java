package com.example.Ejercicio4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
	Ejercicio 1

	Crear un proyecto Spring Boot con las dependencias:

	H2
	Spring Data JPA
	Spring Web
	Spring Boot dev tools

	Crear una clase HelloController que sea un controlador REST.
	Dentro de la clase crear un método que retorne un saludo.
	Probar que retorna el saludo desde el navegador y desde Postman.
*/
@SpringBootApplication
public class Ejercicio4Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Ejercicio4Application.class, args);
	}

}
