package com.isis.login.infraestructura.controlador;

import com.isis.login.aplicacion.comando.ComandoVenta;
import com.isis.login.aplicacion.consulta.manejador.venta.ManejadorListarVenta;
import com.isis.login.aplicacion.manejador.ManejadorVenta;
import com.isis.login.dominio.modelo.dto.VentaDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/venta")
public class ControladorVenta {

    private  final ManejadorVenta manejadorVenta;
    private final ManejadorListarVenta manejadorListarVenta;

    public ControladorVenta(ManejadorVenta manejadorVenta, ManejadorListarVenta manejadorListarVenta) {
        this.manejadorVenta = manejadorVenta;
        this.manejadorListarVenta = manejadorListarVenta;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void ejecutar(@RequestBody ComandoVenta comandoVenta){
        manejadorVenta.ejecutar(comandoVenta);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<VentaDto> ejecutar(){
        return this.manejadorListarVenta.ejecutar();
    }
}
