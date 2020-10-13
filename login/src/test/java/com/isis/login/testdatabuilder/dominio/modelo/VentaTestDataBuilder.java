package com.isis.login.testdatabuilder.dominio.modelo;

import com.isis.login.aplicacion.comando.ComandoVenta;
import com.isis.login.dominio.modelo.Cliente;
import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.modelo.Venta;

import java.time.LocalDate;

public class VentaTestDataBuilder {

    private static final Long ID_VENTA= 1L;
    private static final Cliente CLIENTE= new Cliente("santiago","garcia","cedula","123124","santy@gmail.com",1L);
    private static final LocalDate FECHA_VENTA = LocalDate.of(2024,03,28);

    private Long idVenta;
    private Cliente idCliente;
    private LocalDate fecha;

    public VentaTestDataBuilder() {
        this.idVenta = ID_VENTA;
        this.idCliente = CLIENTE;
        this.fecha = FECHA_VENTA;
    }

    public VentaTestDataBuilder condIdVenta(Long id){
        this.idVenta=id;
        return this;
    }

    public VentaTestDataBuilder conClienteVenta(Cliente id){
        this.idCliente=id;
        return this;
    }

    public VentaTestDataBuilder conFechaVenta(LocalDate fechaVenta){
        this.fecha=fechaVenta;
        return this;
    }

    public Venta build(){
        return new Venta(this.idVenta,this.idCliente,this.fecha);
    }
}
