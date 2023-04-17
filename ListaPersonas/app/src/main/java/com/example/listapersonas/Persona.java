package com.example.listapersonas;

public class Persona {
    private String nombre;
    private char genero;
    public Persona(String nombre, char genero) {
        this.nombre=nombre;
        this.genero=genero;
    }
    public String getNombres() {
        return nombre;
    }
    public char getGenero() {
        return genero;
    }
}
