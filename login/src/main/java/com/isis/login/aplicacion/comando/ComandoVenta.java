package com.isis.login.aplicacion.comando;

import com.isis.login.dominio.modelo.Cliente;

import java.time.LocalDate;

public class ComandoVenta {

    private Long idVenta;
    private Cliente idCliente;
    private LocalDate fecha;

    public ComandoVenta(LocalDate fecha,Cliente idCliente) {
        this.fecha = fecha;
        this.idCliente=idCliente;
    }

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
