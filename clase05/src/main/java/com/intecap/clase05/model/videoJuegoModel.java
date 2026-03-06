package com.intecap.clase05.model;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class videoJuegoModel {
    @NotBlank(message = "El titulo es obligatorio")
    @Size(min = 3, max = 50, message = "El nombre debe de tener entre 3 a 50 caracteres")
    private String titulo;
    @NotBlank(message = "El genero es obligatorio")
    private String genero;
    @Min(value = 1, message = "El año debe ser mayor a 0")
    private int anioLanzamiento;
    @DecimalMin(value = "0.0", message = "El precio no debe de ser negativo")
    private double precio;


    public videoJuegoModel(String titulo, String genero, int anioLanzamiento, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.anioLanzamiento = anioLanzamiento;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
