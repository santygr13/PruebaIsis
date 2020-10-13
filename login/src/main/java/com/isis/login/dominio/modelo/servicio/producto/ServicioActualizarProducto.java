package com.isis.login.dominio.modelo.servicio.producto;

import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.puerto.repositorio.RepositorioProducto;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarProducto {

    private RepositorioProducto repositorioProducto;

    public ServicioActualizarProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public void actualizarYGuardarProducto(Producto producto){
        this.repositorioProducto.guardar(producto);
    }

}
