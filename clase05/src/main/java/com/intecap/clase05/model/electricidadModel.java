package com.intecap.clase05.model;

import jakarta.validation.constraints.*;

public class electricidadModel {
    @NotBlank(message = "El nombre de la empresa es obligatorio")
    private String nombreEmpresa;
    @Min(value = 0, message = "No estás midiendo voltaje")
    private double voltajeMedido;
    @Max(value = 1000, message = "La corriente excede el equipo")
    private double corrienteElectrica;
    @Size(min = 2, max = 100, message = "Excediste el numero de palabras")
    private String equipoMedido;
    @NotBlank(message = "El codigo de medidor es obligatorio")
    @Pattern(regexp = "[A-Z]{10}", message = "Debe de tener 10 caracteres")
    private String codigoMedidor;

    public electricidadModel(String nombreEmpresa, double voltajeMedido, double corrienteElectrica, String equipoMedido, String codigoMedidor) {
        this.nombreEmpresa = nombreEmpresa;
        this.voltajeMedido = voltajeMedido;
        this.corrienteElectrica = corrienteElectrica;
        this.equipoMedido = equipoMedido;
        this.codigoMedidor = codigoMedidor;
    }

    public String getCodigoMedidor() {
        return codigoMedidor;
    }

    public void setCodigoMedidor(String codigoMedidor) {
        this.codigoMedidor = codigoMedidor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public double getVoltajeMedido() {
        return voltajeMedido;
    }

    public void setVoltajeMedido(double voltajeMedido) {
        this.voltajeMedido = voltajeMedido;
    }

    public double getCorrienteElectrica() {
        return corrienteElectrica;
    }

    public void setCorrienteElectrica(double corrienteElectrica) {
        this.corrienteElectrica = corrienteElectrica;
    }

    public String getEquipoMedido() {
        return equipoMedido;
    }

    public void setEquipoMedido(String equipoMedido) {
        this.equipoMedido = equipoMedido;
    }
}
