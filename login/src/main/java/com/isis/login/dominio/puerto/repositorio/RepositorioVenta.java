package com.isis.login.dominio.puerto.repositorio;


import com.isis.login.dominio.modelo.Venta;
import com.isis.login.dominio.modelo.dto.VentaDto;

import java.util.List;

public interface RepositorioVenta {

    void guardar(Venta venta);
    List<VentaDto> listar();
}
