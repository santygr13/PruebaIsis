package com.isis.login.aplicacion.consulta.manejador.producto;

import com.isis.login.aplicacion.comando.ComandoProducto;
import com.isis.login.aplicacion.fabrica.FabricaProducto;
import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.modelo.servicio.producto.ServicioActualizarProducto;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarProducto {

    private final FabricaProducto fabricaProducto;
    private final ServicioActualizarProducto servicioActualizarProducto;

    public ManejadorActualizarProducto(FabricaProducto fabricaProducto, ServicioActualizarProducto servicioActualizarProducto) {
        this.fabricaProducto = fabricaProducto;
        this.servicioActualizarProducto = servicioActualizarProducto;
    }

    public void ejecutar (ComandoProducto comandoProducto, long idProducto){
        comandoProducto.setNombre(comandoProducto.getNombre());
        comandoProducto.setPrecio(comandoProducto.getPrecio());
        comandoProducto.setIdProducto(idProducto);
        Producto producto= this.fabricaProducto.crear(comandoProducto);
        this.servicioActualizarProducto.actualizarYGuardarProducto(producto);
    }
}
