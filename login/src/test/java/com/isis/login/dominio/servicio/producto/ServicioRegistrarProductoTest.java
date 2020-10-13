package com.isis.login.dominio.servicio.producto;

import com.isis.login.dominio.excepcion.ExcepcionDuplicidad;
import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.modelo.servicio.producto.ServicioRegistrarProducto;
import com.isis.login.dominio.puerto.repositorio.RepositorioProducto;
import com.isis.login.testdatabuilder.dominio.modelo.ProductoTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioRegistrarProductoTest {

    private static final String EL_PRODUCTO_YA_EXISTE="El producto ya se encuentra registrado";

    ServicioRegistrarProducto servicioRegistrarProducto;
    RepositorioProducto repositorioProducto;

    @BeforeEach
    public void init(){
        servicioRegistrarProducto= Mockito.mock(ServicioRegistrarProducto.class);
        repositorioProducto=Mockito.mock(RepositorioProducto.class);
    }

    @Test
    public void validarExistenciaProductoTest(){

        Producto producto= new ProductoTestDataBuilder().conNombreProducto("azucar").build();
        Mockito.when(repositorioProducto.productoExistente(Mockito.any())).thenReturn(true);
        Mockito.doNothing().when(repositorioProducto).guardar(producto);
        try{
            servicioRegistrarProducto.ejecutar(producto);

        }catch (ExcepcionDuplicidad e){
            Assertions.assertEquals(EL_PRODUCTO_YA_EXISTE, e.getMessage());
        }
    }
}
