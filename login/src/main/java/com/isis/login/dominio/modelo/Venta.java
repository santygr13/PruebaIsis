package com.isis.login.dominio.modelo;

import com.isis.login.dominio.validador.ValidadorArgumento;

import java.time.LocalDate;

public class Venta {

    private static final String ERROR_FECHA_RESERVA="La fecha de la compra no es valida";

    private Long idVenta;
    private Long idCliente;
    private LocalDate fecha;

    public Venta(LocalDate fecha,Long idCliente) {
        ValidadorArgumento.validadorFechaValida(fecha,ERROR_FECHA_RESERVA);
        this.fecha = fecha;
        this.idCliente=idCliente;
    }

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
