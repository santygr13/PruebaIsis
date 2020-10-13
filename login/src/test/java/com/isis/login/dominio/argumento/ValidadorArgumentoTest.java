package com.isis.login.dominio.argumento;

import com.isis.login.dominio.excepcion.ExcepcionCampoObligatorio;
import com.isis.login.dominio.excepcion.ExcepcionCampoVacio;
import com.isis.login.dominio.excepcion.ExcepcionCantidadPositiva;
import com.isis.login.dominio.excepcion.ExcepcionFechaInvalida;
import com.isis.login.dominio.validador.ValidadorArgumento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ValidadorArgumentoTest {

    private static final String ESTE_CAMPO_ES_OBLIGATORIO="El campo es obligatorio";
    private static final LocalDate FECHA_COMPRA=LocalDate.of(2020,10,11);
    private static final String ERROR_FECHA_COMPRA="La fecha de reserva no es valida";
    private static final String LA_CANTIDAD_NO_PUEDE_SER_NEGATIVA="la cantidad debe de ser positiva";
    private static final int CANTIDAD=-3;
    private static final String CAMPO_VACIO ="";



    @Test
    public void validarCampoObligatrioTest(){
        try {
            ValidadorArgumento.validarCampoObligatorio(null,ESTE_CAMPO_ES_OBLIGATORIO);
        }catch (ExcepcionCampoObligatorio e){
            Assertions.assertEquals(ESTE_CAMPO_ES_OBLIGATORIO,e.getMessage());
        }
    }


    @Test
    public void validarCampoVacioTest(){
        try {
            ValidadorArgumento.validarCampoVacio(null,CAMPO_VACIO);
        }catch (ExcepcionCampoVacio e){
            Assertions.assertEquals(CAMPO_VACIO,e.getMessage());
        }
    }


    @Test
    public void validarFechaValidaTest(){
        try {
            ValidadorArgumento.validadorFechaValida(FECHA_COMPRA,ERROR_FECHA_COMPRA);
        }catch (ExcepcionFechaInvalida e){
            Assertions.assertEquals(ERROR_FECHA_COMPRA,e.getMessage());
        }
    }

    @Test
    public void validadorArgumentoCantidadPositivaTest(){
        try{
            ValidadorArgumento.validadorArgumentoCantidadPositiva(CANTIDAD,LA_CANTIDAD_NO_PUEDE_SER_NEGATIVA);

        }catch (ExcepcionCantidadPositiva e){
            Assertions.assertEquals(LA_CANTIDAD_NO_PUEDE_SER_NEGATIVA,e.getMessage());
        }
    }

}
