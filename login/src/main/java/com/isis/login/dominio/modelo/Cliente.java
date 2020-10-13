package com.isis.login.dominio.modelo;

import com.isis.login.dominio.validador.ValidadorArgumento;

public class Cliente {

    private static final String ESTE_CAMPO_ES_OBLIGATORIO="El campo es obligatorio";

    private Long idCliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;

    public Cliente(String nombre, String apellido, String dni, String telefono, String email,Long idCliente) {
        ValidadorArgumento.validarCampoObligatorio(nombre,ESTE_CAMPO_ES_OBLIGATORIO);
        ValidadorArgumento.validarCampoObligatorio(telefono,ESTE_CAMPO_ES_OBLIGATORIO);
        ValidadorArgumento.validarCampoVacio(nombre,ESTE_CAMPO_ES_OBLIGATORIO);
        ValidadorArgumento.validarCampoVacio(telefono,ESTE_CAMPO_ES_OBLIGATORIO);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.idCliente=idCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
