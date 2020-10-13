package com.isis.login.dominio.validador;

import com.isis.login.dominio.excepcion.ExcepcionCampoObligatorio;
import com.isis.login.dominio.excepcion.ExcepcionCampoVacio;
import com.isis.login.dominio.excepcion.ExcepcionCantidadPositiva;
import com.isis.login.dominio.excepcion.ExcepcionFechaInvalida;

import java.time.LocalDate;

public class ValidadorArgumento {

    private ValidadorArgumento() {
    }

    public static void validadorFechaValida(LocalDate fechaCompra, String mensaje){
        if(fechaCompra.isBefore(LocalDate.now())){
            throw new ExcepcionFechaInvalida(mensaje);
        }
    }

    public static void validarCampoVacio(Object valor , String mensaje){
        if(valor==""){
            throw new ExcepcionCampoVacio(mensaje);

        }
    }

    public static void validarCampoObligatorio(Object valor , String mensaje){
        if(valor==null){
            throw new ExcepcionCampoObligatorio(mensaje);

        }
    }

    public static void validadorArgumentoCantidadPositiva(float precio, String mensaje){
        if(precio<=0){
            throw new ExcepcionCantidadPositiva(mensaje);
        }
    }
}
