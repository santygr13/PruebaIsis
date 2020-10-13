package com.isis.login.infraestructura.entidad;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="venta")
public class VentaEntidad {

    @Id
    @Column
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    private Long idVenta;

    @JoinColumn
    @ManyToOne
    private ClienteEntidad idCliente;

    @Column(name = "fecha_venta", nullable = false , length = 20)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private LocalDate fecha;


    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public ClienteEntidad getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ClienteEntidad idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
