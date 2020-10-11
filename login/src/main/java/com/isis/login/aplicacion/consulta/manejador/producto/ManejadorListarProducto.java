package com.isis.login.aplicacion.consulta.manejador.producto;

import com.isis.login.dominio.modelo.dto.ProductoDto;
import com.isis.login.dominio.puerto.repositorio.RepositorioProducto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarProducto {

    private RepositorioProducto repositorioProducto;

    public ManejadorListarProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public List<ProductoDto> ejecutar(){
        return this.repositorioProducto.listar();
    }
}
