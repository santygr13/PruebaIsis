package com.isis.login.infraestructura.entidad;

import com.isis.login.dominio.modelo.Producto;
import com.isis.login.dominio.modelo.Venta;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
@Table(name="detalle_venta")
public class DetalleVentaEntidad {

    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    private Long idDetalleVenta;

    @JoinColumn
    @ManyToOne
    private VentaEntidad idVenta;

    @JoinColumn
    @ManyToOne
    private ProductoEntidad idProducto;


    public Long getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Long idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public VentaEntidad getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(VentaEntidad idVenta) {
        this.idVenta = idVenta;
    }

    public ProductoEntidad getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(ProductoEntidad idProducto) {
        this.idProducto = idProducto;
    }
}
