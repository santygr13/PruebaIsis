package com.isis.login.aplicacion.fabrica;

import com.isis.login.aplicacion.comando.ComandoCliente;
import com.isis.login.dominio.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class FabricaCliente {

    public Cliente crear(ComandoCliente comandoCliente){
        return new Cliente(comandoCliente.getNombre(),comandoCliente.getApellido(),comandoCliente.getDni(),comandoCliente.getTelefono(),comandoCliente.getEmail(),comandoCliente.getIdCliente());
    }

}
