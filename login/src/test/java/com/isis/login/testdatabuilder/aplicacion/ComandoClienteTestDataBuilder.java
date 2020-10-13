package com.isis.login.testdatabuilder.aplicacion;

import com.isis.login.aplicacion.comando.ComandoCliente;
import com.isis.login.dominio.modelo.Cliente;
import com.isis.login.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;

public class ComandoClienteTestDataBuilder {
    private static final Long ID_CLIENTE=1L;
    private static final String NOMBRE ="santiago";
    private static final String APELLIDO ="García";
    private static final String DNI ="cedula";
    private static final String TELEFONO ="999999999";
    private static final String EMAIL ="santiago@gmail.com";

    private Long idCliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;

    public ComandoClienteTestDataBuilder() {
        this.idCliente = ID_CLIENTE;
        this.nombre = NOMBRE;
        this.apellido = APELLIDO;
        this.dni = DNI;
        this.telefono = TELEFONO;
        this.email = EMAIL;
    }

    public ComandoClienteTestDataBuilder conIdCliente(Long idCliente){
        this.idCliente=idCliente;
        return this;
    }

    public ComandoClienteTestDataBuilder conNombreCliente(String nombreCliente){
        this.nombre=nombreCliente;
        return this;
    }

    public ComandoClienteTestDataBuilder conApellidoCliente(String apellidoCliente){
        this.apellido=apellidoCliente;
        return this;
    }

    public ComandoClienteTestDataBuilder conDniCliente(String dniCliente){
        this.dni=dniCliente;
        return this;
    }

    public ComandoClienteTestDataBuilder conTelefonoCliente(String telefonoCliente){
        this.telefono=telefonoCliente;
        return this;
    }

    public ComandoClienteTestDataBuilder conEmailCliente(String emailCliente){
        this.email=emailCliente;
        return this;
    }

    public ComandoCliente build(){
        return new ComandoCliente(this.nombre,this.apellido,this.dni,this.telefono,this.email,this.idCliente);
    }
}
