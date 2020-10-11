package com.isis.login.dominio.modelo.servicio.venta;

import com.isis.login.aplicacion.fabrica.FabricaVenta;
import com.isis.login.dominio.modelo.Venta;
import com.isis.login.dominio.puerto.repositorio.RepositorioVenta;
import org.springframework.stereotype.Service;

@Service
public class ServicioRegistrarVenta {

   private RepositorioVenta repositorioVenta;

    public ServicioRegistrarVenta(RepositorioVenta repositorioVenta) {
        this.repositorioVenta = repositorioVenta;
    }

    public void ejecutar(Venta venta){
        repositorioVenta.guardar(venta);
    }
}
