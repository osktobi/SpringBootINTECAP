package com.intecap.clase05.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class farmaciaModel {
    @NotBlank(message = "El producto debe de tener nombre")
    private String nombreProducto;
    @Min(value = 0, message = "El valor del producto no debe de ser 0")
    private double precioProducto;
    @NotBlank(message = "Debe de haber detalle de productos")
    private String detalleVenta;
    @NotBlank(message = "No debe de ir en blanco el nombre del Empleado")
    private String nombreEmpleado;

    public farmaciaModel(String nombreProducto, double precioProducto, String detalleVenta, String nombreEmpleado) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.detalleVenta = detalleVenta;
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(String detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
}
