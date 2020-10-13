package com.isis.login.dominio.excepcion;

public class ExcepcionClienteNulo extends RuntimeException{

    public ExcepcionClienteNulo(String message) {
        super(message);
    }
}
