package com.isis.login.dominio.modelo;

import com.isis.login.dominio.validador.ValidadorArgumento;

import java.time.LocalDate;

public class Venta {

    private static final String ERROR_FECHA_COMPRA="La fecha de la compra no es válida";
    private static final String ESTE_CAMPO_ES_OBLIGATORIO="El campo es obligatorio";


    private Long idVenta;
    private Cliente idCliente;
    private LocalDate fecha;

    public Venta(Long idVenta, Cliente idCliente, LocalDate fecha) {
        ValidadorArgumento.validadorFechaValida(fecha,ERROR_FECHA_COMPRA);
        ValidadorArgumento.validarCampoVacio(fecha,ESTE_CAMPO_ES_OBLIGATORIO);
        ValidadorArgumento.validarCampoObligatorio(fecha,ESTE_CAMPO_ES_OBLIGATORIO);

        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.fecha = fecha;
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
