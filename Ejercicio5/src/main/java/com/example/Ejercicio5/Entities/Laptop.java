package com.example.Ejercicio5.Entities;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String procesador;
    private Double ram;
    private Double precio;
    //constructor
    public Laptop() {
    }
    public Laptop(String marca, String procesador, Double ram, Double precio) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.precio = precio;
    }
    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Double getRam() {
        return ram;
    }

    public void setRam(Double ram) {
        this.ram = ram;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Laptop{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", procesador='").append(procesador).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
