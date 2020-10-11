package com.isis.login.dominio.puerto.repositorio;

import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.modelo.dto.ProductoDto;

import java.util.List;

public interface RepositorioProducto {

    void guardar(Producto producto);
    List<ProductoDto> listar();

}
