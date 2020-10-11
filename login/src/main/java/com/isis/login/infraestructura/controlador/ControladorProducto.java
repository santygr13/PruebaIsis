package com.isis.login.infraestructura.controlador;

import com.isis.login.aplicacion.comando.ComandoProducto;
import com.isis.login.aplicacion.consulta.manejador.producto.ManejadorListarProducto;
import com.isis.login.aplicacion.manejador.ManejadorProducto;
import com.isis.login.dominio.modelo.dto.ProductoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/producto")
public class ControladorProducto {

    private final ManejadorProducto manejadorProducto;
    private final ManejadorListarProducto manejadorListarProducto;

    public ControladorProducto(ManejadorProducto manejadorProducto, ManejadorListarProducto manejadorListarProducto) {
        this.manejadorProducto = manejadorProducto;
        this.manejadorListarProducto = manejadorListarProducto;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void guardarProdcuto(@RequestBody ComandoProducto comandoProducto){
        manejadorProducto.ejecutar(comandoProducto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoDto> listarProductoDto(){
        return this.manejadorListarProducto.ejecutar();
    }
}
