package com.isis.login.dominio.validador;

import com.isis.login.dominio.excepcion.ExcepcionFechaInvalida;

import java.time.LocalDate;

public class ValidadorArgumento {

    private ValidadorArgumento() {
    }

    public static void validadorFechaValida(LocalDate fechaReservaPelicula, String mensaje){
        if(fechaReservaPelicula.isBefore(LocalDate.now())){
            throw new ExcepcionFechaInvalida(mensaje);
        }
    }

}
