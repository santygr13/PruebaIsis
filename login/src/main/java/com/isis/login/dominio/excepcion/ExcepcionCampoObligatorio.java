package com.isis.login.dominio.excepcion;

public class ExcepcionCampoObligatorio extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionCampoObligatorio(String mensaje) {
        super(mensaje);
    }

}
