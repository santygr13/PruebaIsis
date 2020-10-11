package com.isis.login.aplicacion.consulta.manejador.venta;

import com.isis.login.dominio.modelo.dto.VentaDto;
import com.isis.login.dominio.puerto.repositorio.RepositorioVenta;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarVenta {

    private RepositorioVenta repositorioVenta;

    public ManejadorListarVenta(RepositorioVenta repositorioVenta) {
        this.repositorioVenta = repositorioVenta;
    }

    public List<VentaDto> ejecutar(){
        return this.repositorioVenta.listar();
    }
}
