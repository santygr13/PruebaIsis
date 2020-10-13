package com.isis.login.dominio.servicio.cliente;

import com.isis.login.dominio.modelo.Cliente;
import com.isis.login.dominio.modelo.servicio.cliente.ServicioRegistrarCliente;
import com.isis.login.dominio.puerto.repositorio.RepositorioCliente;
import com.isis.login.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServicioRegistrarClienteTest {

    ServicioRegistrarCliente servicioRegistrarCliente;
    RepositorioCliente repositorioCliente;

    @BeforeEach
    public void init(){
        repositorioCliente= Mockito.mock(RepositorioCliente.class);
        servicioRegistrarCliente=Mockito.mock(ServicioRegistrarCliente.class);
        servicioRegistrarCliente= new ServicioRegistrarCliente(repositorioCliente);
    }

    @Test
    public void ejecutarTest(){
        Cliente cliente= new ClienteTestDataBuilder().build();
        servicioRegistrarCliente.ejecutar(cliente);
    }

}
