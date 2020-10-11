package com.isis.login.infraestructura.adaptador.repositorio;

import com.isis.login.dominio.modelo.Venta;
import com.isis.login.dominio.modelo.dto.VentaDto;
import com.isis.login.dominio.puerto.repositorio.RepositorioVenta;
import com.isis.login.infraestructura.convertidor.venta.ConvertidorListaVenta;
import com.isis.login.infraestructura.entidad.VentaEntidad;
import com.isis.login.infraestructura.repositorioJpa.RepositorioVentaJpa;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioVentaSql implements RepositorioVenta {

    private RepositorioVentaJpa repositorioVentaJpa;
    ConvertidorListaVenta convertidorListaVenta= new ConvertidorListaVenta();
    ModelMapper modelMapper= new ModelMapper();

    public RepositorioVentaSql(RepositorioVentaJpa repositorioVentaJpa) {
        this.repositorioVentaJpa = repositorioVentaJpa;
    }

    @Override
    public void guardar(Venta venta) {
        VentaEntidad ventaEntidad= modelMapper.map(venta,VentaEntidad.class);
        repositorioVentaJpa.save(ventaEntidad);
    }

    @Override
    public List<VentaDto> listar() {
        List<VentaEntidad> listaVentaEntidad= repositorioVentaJpa.findAll();
        List<VentaDto> listaVentaDto= new ArrayList<>();
        return convertidorListaVenta.convertirListaVentaEntidadAListaVenta(listaVentaEntidad,listaVentaDto);
    }


}
