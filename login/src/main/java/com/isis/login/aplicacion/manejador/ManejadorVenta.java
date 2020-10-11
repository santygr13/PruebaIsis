package com.isis.login.aplicacion.manejador;

import com.isis.login.aplicacion.comando.ComandoVenta;
import com.isis.login.aplicacion.fabrica.FabricaVenta;
import com.isis.login.dominio.modelo.Venta;
import com.isis.login.dominio.modelo.servicio.venta.ServicioRegistrarVenta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorVenta {

    private final ServicioRegistrarVenta servicioRegistrarVenta;
    private final FabricaVenta fabricaVenta;

    public ManejadorVenta(ServicioRegistrarVenta servicioRegistrarVenta, FabricaVenta fabricaVenta) {
        this.servicioRegistrarVenta = servicioRegistrarVenta;
        this.fabricaVenta = fabricaVenta;
    }

    public void ejecutar(ComandoVenta comandoVenta){
        Venta venta = fabricaVenta.crear(comandoVenta);
        servicioRegistrarVenta.ejecutar(venta);
    }
}
