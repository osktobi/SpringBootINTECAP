
package com.intecap.clase05.model;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 *
 * @author oskto
 */
public class hotelModel {
        @NotBlank(message = "El nombre del huésped es obligatorio")
    @Size(min = 3, max = 60, message = "El nombre debe tener entre 3 y 60 caracteres")
    private String nombreHuesped;

    @NotBlank(message = "El método de pago es obligatorio")
    @Pattern(
        regexp = "^(TARJETA|EFECTIVO|TRANSFERENCIA)$",
        message = "Método de pago no válido (usar: TARJETA, EFECTIVO o TRANSFERENCIA)"
    )
    private String metodoPago;
    
    @NotNull(message = "El total a pagar es obligatorio")
    @DecimalMin(value = "0.0", inclusive = false, message = "El monto debe ser mayor a 0")

    private Double montoTotal;

    public hotelModel(String nombreHuesped, String metodoPago, Double montoTotal) {
        this.nombreHuesped = nombreHuesped;
        this.metodoPago = metodoPago;
        this.montoTotal = montoTotal;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }
            
    
}
