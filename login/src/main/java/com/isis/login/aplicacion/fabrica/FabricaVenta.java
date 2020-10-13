package com.isis.login.aplicacion.fabrica;

import com.isis.login.aplicacion.comando.ComandoVenta;
import com.isis.login.dominio.modelo.Venta;
import org.springframework.stereotype.Component;

@Component
public class FabricaVenta {

    public Venta crear(ComandoVenta comandoVenta){
        return new Venta(comandoVenta.getIdVenta(),comandoVenta.getIdCliente(),comandoVenta.getFecha());
    }
}
