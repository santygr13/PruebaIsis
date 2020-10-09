package com.isis.login.dominio.modelo.dto;

import java.time.LocalDate;

public class VentaDto {

    private Long idVenta;
    private Long idCliente;
    private LocalDate fecha;

    public VentaDto() {

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
