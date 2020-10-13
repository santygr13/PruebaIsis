package com.isis.login.testdatabuilder.dominio.modelo;

import com.isis.login.dominio.modelo.Cliente;

public class ClienteTestDataBuilder {

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

    public ClienteTestDataBuilder() {
        this.idCliente = ID_CLIENTE;
        this.nombre = NOMBRE;
        this.apellido = APELLIDO;
        this.dni = DNI;
        this.telefono = TELEFONO;
        this.email = EMAIL;
    }

    public ClienteTestDataBuilder conIdCliente(Long idCliente){
        this.idCliente=idCliente;
        return this;
    }

    public ClienteTestDataBuilder conNombreCliente(String nombreCliente){
        this.nombre=nombreCliente;
        return this;
    }

    public ClienteTestDataBuilder conApellidoCliente(String apellidoCliente){
        this.apellido=apellidoCliente;
        return this;
    }

    public ClienteTestDataBuilder conDniCliente(String dniCliente){
        this.dni=dniCliente;
        return this;
    }

    public ClienteTestDataBuilder conTelefonoCliente(String telefonoCliente){
        this.telefono=telefonoCliente;
        return this;
    }

    public ClienteTestDataBuilder conEmailCliente(String emailCliente){
        this.email=emailCliente;
        return this;
    }

    public Cliente build(){
        return new Cliente(this.nombre,this.apellido,this.dni,this.telefono,this.email,this.idCliente);
    }
}
