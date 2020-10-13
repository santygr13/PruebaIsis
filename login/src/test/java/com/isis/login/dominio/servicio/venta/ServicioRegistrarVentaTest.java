package com.isis.login.dominio.servicio.venta;

import com.isis.login.dominio.excepcion.ExcepcionClienteNulo;
import com.isis.login.dominio.modelo.Venta;
import com.isis.login.dominio.modelo.servicio.venta.ServicioRegistrarVenta;
import com.isis.login.dominio.puerto.repositorio.RepositorioVenta;
import com.isis.login.testdatabuilder.dominio.modelo.VentaTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioRegistrarVentaTest {

    private static final String CLIENTE_NULO="El cliente no puede ser nulo";

    ServicioRegistrarVenta servicioRegistrarVenta;
    RepositorioVenta repositorioVenta;

    @BeforeEach
    public void init(){
        repositorioVenta= Mockito.mock(RepositorioVenta.class);
        servicioRegistrarVenta= Mockito.mock(ServicioRegistrarVenta.class);
    }

    @Test
    public void validarVentaConClienteNuloTest(){
        Venta venta = new VentaTestDataBuilder().conClienteVenta(null).build();
        Assertions.assertThrows(ExcepcionClienteNulo.class,() -> ServicioRegistrarVenta.validarClienteEnVentaNoNulo(venta),CLIENTE_NULO);
    }
}
