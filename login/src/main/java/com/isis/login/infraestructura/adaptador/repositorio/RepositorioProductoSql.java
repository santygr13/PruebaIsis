package com.isis.login.infraestructura.adaptador.repositorio;

import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.modelo.dto.ProductoDto;
import com.isis.login.dominio.puerto.repositorio.RepositorioProducto;
import com.isis.login.infraestructura.convertidor.producto.ConvertidorListaProducto;
import com.isis.login.infraestructura.entidad.ProductoEntidad;
import com.isis.login.infraestructura.repositorioJpa.RepositorioProductoJpa;
import org.springframework.stereotype.Repository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioProductoSql implements RepositorioProducto {

    private RepositorioProductoJpa repositorioProductoJpa;
    private ModelMapper modelMapper= new ModelMapper();
    ConvertidorListaProducto convertidorListaProducto = new ConvertidorListaProducto();

    public RepositorioProductoSql(RepositorioProductoJpa repositorioProductoJpa) {
        this.repositorioProductoJpa = repositorioProductoJpa;
    }

    @Override
    public void guardar(Producto producto){
        ProductoEntidad productoEntidad = modelMapper.map(producto,ProductoEntidad.class);
        repositorioProductoJpa.save(productoEntidad);
    }

    @Override
    public List<ProductoDto> listar() {
        List<ProductoEntidad> listaProductoEntidad = repositorioProductoJpa.findAll();
        List<ProductoDto> listaProductoDto = new ArrayList<>();
        return convertidorListaProducto.convertidorListaProductoEntidadAListaProducto(listaProductoEntidad,listaProductoDto);
    }

    @Override
    public boolean productoExistente(Producto producto) {
       String nombreProducto = producto.getNombre();
       return(repositorioProductoJpa.filtroPorNombrePorducto(nombreProducto)) !=null;
    }

}
