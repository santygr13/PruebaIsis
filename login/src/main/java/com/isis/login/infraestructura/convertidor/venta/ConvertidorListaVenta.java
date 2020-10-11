package com.isis.login.infraestructura.convertidor.venta;

import com.isis.login.dominio.modelo.dto.VentaDto;
import com.isis.login.infraestructura.entidad.VentaEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertidorListaVenta {

    ModelMapper modelMapper= new ModelMapper();

    public List<VentaDto> convertirListaVentaEntidadAListaVenta(List<VentaEntidad> listaVentaEntidad, List<VentaDto> listaVentaDto){

        for(VentaEntidad ventaEntidad : listaVentaEntidad){
            VentaDto ventaDto = modelMapper.map(ventaEntidad,VentaDto.class);
            listaVentaDto.add(ventaDto);
        }
        return listaVentaDto;
    }
}
