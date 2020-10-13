package com.isis.login.infraestructura.controlador;

import com.isis.login.aplicacion.comando.ComandoProducto;
import com.isis.login.aplicacion.consulta.manejador.producto.ManejadorActualizarProducto;
import com.isis.login.aplicacion.consulta.manejador.producto.ManejadorListarProducto;
import com.isis.login.aplicacion.manejador.ManejadorProducto;
import com.isis.login.dominio.modelo.dto.ProductoDto;
import com.isis.login.dominio.puerto.repositorio.RepositorioProducto;
import com.isis.login.infraestructura.repositorioJpa.RepositorioProductoJpa;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/producto")
public class ControladorProducto {

    private final ManejadorProducto manejadorProducto;
    private final ManejadorListarProducto manejadorListarProducto;
    private final ManejadorActualizarProducto manejadorActualizarProducto;
    private final RepositorioProductoJpa repositorioProductoJpa;

    public ControladorProducto(ManejadorProducto manejadorProducto, ManejadorListarProducto manejadorListarProducto, ManejadorActualizarProducto manejadorActualizarProducto, RepositorioProductoJpa repositorioProductoJpa) {
        this.manejadorProducto = manejadorProducto;
        this.manejadorListarProducto = manejadorListarProducto;
        this.manejadorActualizarProducto = manejadorActualizarProducto;
        this.repositorioProductoJpa = repositorioProductoJpa;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void guardarProdcuto(@RequestBody ComandoProducto comandoProducto){
        manejadorProducto.ejecutar(comandoProducto);
    }

    @PutMapping(value= "/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizarProducto(@PathVariable long idProducto,@RequestBody ComandoProducto comandoProducto){
        this.manejadorActualizarProducto.ejecutar(comandoProducto,idProducto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoDto> listarProductoDto(){
        return this.manejadorListarProducto.ejecutar();
    }

    @DeleteMapping(value= "/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void eliminarProductoPorId(@PathVariable long idProducto){
        repositorioProductoJpa.deleteById(idProducto);
    }
}
