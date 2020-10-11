package com.isis.login.infraestructura.convertidor.producto;

import com.isis.login.dominio.modelo.dto.ProductoDto;
import com.isis.login.infraestructura.entidad.ProductoEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertidorListaProducto {

    ModelMapper modelMapper= new ModelMapper();

    public List<ProductoDto> convertidorListaProductoEntidadAListaProdcuto(List<ProductoEntidad> listaProductoEntidad , List<ProductoDto> listaProductoDto){
        for(ProductoEntidad productoEntidad: listaProductoEntidad){
            ProductoDto productoDto = modelMapper.map(productoEntidad,ProductoDto.class);
            listaProductoDto.add(productoDto);
        }
       return listaProductoDto;
    }
}
