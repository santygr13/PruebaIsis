package com.isis.login.infraestructura.adaptador.repositorio;

import com.isis.login.dominio.modelo.Cliente;
import com.isis.login.dominio.puerto.repositorio.RepositorioCliente;
import com.isis.login.infraestructura.entidad.ClienteEntidad;
import com.isis.login.infraestructura.repositorioJpa.RepositorioClienteJpa;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioClienteSql implements RepositorioCliente {

    private RepositorioClienteJpa repositorioClienteJpa;
    private ModelMapper modelMapper= new ModelMapper();

    public RepositorioClienteSql(RepositorioClienteJpa repositorioClienteJpa) {
        this.repositorioClienteJpa = repositorioClienteJpa;
    }

    @Override
    public void guardar(Cliente cliente) {
        ClienteEntidad clienteEntidad = modelMapper.map(cliente,ClienteEntidad.class);
        repositorioClienteJpa.save(clienteEntidad);
    }

}
