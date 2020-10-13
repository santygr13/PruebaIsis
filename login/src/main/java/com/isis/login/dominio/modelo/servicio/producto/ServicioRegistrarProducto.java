package com.isis.login.dominio.modelo.servicio.producto;

import com.isis.login.dominio.excepcion.ExcepcionDuplicidad;
import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.puerto.repositorio.RepositorioProducto;
import org.springframework.stereotype.Service;

@Service
public class ServicioRegistrarProducto {

    private static final String EL_PRODUCTO_YA_EXISTE="El producto ya se encuentra registrado";

    private RepositorioProducto repositorioProducto;

    public ServicioRegistrarProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public void validarExistenciaProducto(Producto producto){
        boolean existe = this.repositorioProducto.productoExistente(producto);
        if(existe){
            throw new ExcepcionDuplicidad(EL_PRODUCTO_YA_EXISTE);
        }
    }

    public void ejecutar (Producto producto){
        this.validarExistenciaProducto(producto);
        this.repositorioProducto.guardar(producto);
    }

}
