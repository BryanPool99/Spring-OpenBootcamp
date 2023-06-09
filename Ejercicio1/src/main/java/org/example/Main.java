package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Crear proyecto maven con la dependencia spring-context y crear una clase Saludo
    con un método imprimirSaludo que imprima un texto por consola.

    Crear el archivo beans.xml con un bean para la clase Saludo.

    Obtener el bean desde el método main y ejecutar el método imprimirSaludo.
*/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludar=(Saludo) context.getBean("saludo");
        saludar.imprimirSaludo();
    }
}