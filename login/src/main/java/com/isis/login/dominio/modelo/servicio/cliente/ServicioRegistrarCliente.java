package com.isis.login.dominio.modelo.servicio.cliente;

import com.isis.login.dominio.modelo.Cliente;
import com.isis.login.dominio.puerto.repositorio.RepositorioCliente;
import org.springframework.stereotype.Service;

@Service
public class ServicioRegistrarCliente {

    RepositorioCliente repositorioCliente;

    public ServicioRegistrarCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente){
        repositorioCliente.guardar(cliente);
    }

}
