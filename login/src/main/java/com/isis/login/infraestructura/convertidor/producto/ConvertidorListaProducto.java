package com.isis.login.infraestructura.convertidor.producto;

import com.isis.login.dominio.modelo.dto.ProductoDto;
import com.isis.login.infraestructura.entidad.ProductoEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertidorListaProducto {

    public ConvertidorListaProducto() {
    }

    public static List<ProductoDto> convertidorListaProductoEntidadAListaProducto(List<ProductoEntidad> listaProductoEntidad , List<ProductoDto> listaProductoDto){
        ModelMapper modelMapper= new ModelMapper();
        listaProductoEntidad.forEach(temporal ->{
            ProductoDto productoDto = modelMapper.map(temporal,ProductoDto.class);
            listaProductoDto.add(productoDto);
        });
        return listaProductoDto;
    }

}
