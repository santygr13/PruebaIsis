package com.isis.login.aplicacion.comando;

public class ComandoProducto {

    private Long idProducto;
    private String nombre;
    private float precio;

    public ComandoProducto(String nombre, float precio,Long idProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto=idProducto;
    }

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
