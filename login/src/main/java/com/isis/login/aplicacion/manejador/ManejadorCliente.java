package com.isis.login.aplicacion.manejador;

import com.isis.login.aplicacion.comando.ComandoCliente;
import com.isis.login.aplicacion.fabrica.FabricaCliente;
import com.isis.login.dominio.modelo.Cliente;
import com.isis.login.dominio.modelo.servicio.cliente.ServicioRegistrarCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCliente {

    ServicioRegistrarCliente servicioRegistrarCliente;
    FabricaCliente fabricaCliente;

    public ManejadorCliente(ServicioRegistrarCliente servicioRegistrarCliente, FabricaCliente fabricaCliente) {
        this.servicioRegistrarCliente = servicioRegistrarCliente;
        this.fabricaCliente = fabricaCliente;
    }

    public void ejecutar(ComandoCliente comandoCliente){
        Cliente cliente = fabricaCliente.crear(comandoCliente);
        servicioRegistrarCliente.ejecutar(cliente);
    }
}
