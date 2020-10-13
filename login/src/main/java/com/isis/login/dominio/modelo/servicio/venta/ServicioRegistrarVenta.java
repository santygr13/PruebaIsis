package com.isis.login.dominio.modelo.servicio.venta;

import com.isis.login.dominio.excepcion.ExcepcionClienteNulo;
import com.isis.login.dominio.modelo.Venta;
import com.isis.login.dominio.puerto.repositorio.RepositorioVenta;
import org.springframework.stereotype.Service;

@Service
public class ServicioRegistrarVenta {

    private static final String CLIENTE_NULO="El cliente no puede ser nulo";
    private RepositorioVenta repositorioVenta;

    public ServicioRegistrarVenta(RepositorioVenta repositorioVenta) {
        this.repositorioVenta = repositorioVenta;
    }

    public static void validarClienteEnVentaNoNulo(Venta venta){
        if(venta.getIdCliente()== null){
            throw new ExcepcionClienteNulo(CLIENTE_NULO);
        }
    }

    public void ejecutar(Venta venta){
        validarClienteEnVentaNoNulo(venta);
        repositorioVenta.guardar(venta);
    }

}
