package com.isis.login.infraestructura.entidad;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class ProductoEntidad {

    @Id
    @Column
    @GeneratedValue(
            strategy= GenerationType.AUTO

    )
    private Long idProducto;

    @Column(name = "nombre_producto", nullable = false, length = 100)
    private String nombre;

    @Column(name = "precio_producto", nullable=false, length =10)
    private float precio;

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
