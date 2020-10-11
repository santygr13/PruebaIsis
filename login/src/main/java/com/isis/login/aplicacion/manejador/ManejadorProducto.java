package com.isis.login.aplicacion.manejador;

import com.isis.login.aplicacion.comando.ComandoProducto;
import com.isis.login.aplicacion.fabrica.FabricaProducto;
import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.modelo.servicio.producto.ServicioRegistrarProducto;
import org.springframework.stereotype.Component;

@Component
public class ManejadorProducto {

    private final ServicioRegistrarProducto servicioRegistrarProducto;
    private final FabricaProducto fabricaProducto;

    public ManejadorProducto(ServicioRegistrarProducto servicioRegistrarProducto, FabricaProducto fabricaProducto) {
        this.servicioRegistrarProducto = servicioRegistrarProducto;
        this.fabricaProducto = fabricaProducto;
    }

    public void ejecutar(ComandoProducto comandoProducto){
        Producto producto= this.fabricaProducto.crear(comandoProducto);
        this.servicioRegistrarProducto.ejecutar(producto);
    }
}
