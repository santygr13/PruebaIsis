package com.isis.login.aplicacion.fabrica;

import com.isis.login.aplicacion.comando.ComandoProducto;
import com.isis.login.dominio.modelo.Producto;
import org.springframework.stereotype.Component;

@Component
public class FabricaProducto {

    public Producto crear(ComandoProducto comandoProducto){
        return new Producto(comandoProducto.getNombre(),comandoProducto.getPrecio());
    }
}
