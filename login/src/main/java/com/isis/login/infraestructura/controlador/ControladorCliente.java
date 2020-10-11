package com.isis.login.infraestructura.controlador;

import com.isis.login.aplicacion.comando.ComandoCliente;
import com.isis.login.aplicacion.manejador.ManejadorCliente;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/cliente")
public class ControladorCliente {

    private final ManejadorCliente manejadorCliente;

    public ControladorCliente(ManejadorCliente manejadorCliente) {
        this.manejadorCliente = manejadorCliente;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void guardarCliente(@RequestBody ComandoCliente comandoCliente){
        manejadorCliente.ejecutar(comandoCliente);
    }
}
