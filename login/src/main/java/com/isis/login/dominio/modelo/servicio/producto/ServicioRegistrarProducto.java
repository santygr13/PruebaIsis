package com.isis.login.dominio.modelo.servicio.producto;

import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.puerto.repositorio.RepositorioProducto;
import org.springframework.stereotype.Service;

@Service
public class ServicioRegistrarProducto {

    private RepositorioProducto repositorioProducto;

    public ServicioRegistrarProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public void ejecutar (Producto producto){
        this.repositorioProducto.guardar(producto);
    }

}
