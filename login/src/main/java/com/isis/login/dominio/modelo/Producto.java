package com.isis.login.dominio.modelo;

import com.isis.login.dominio.validador.ValidadorArgumento;

public class Producto {

    private static final String LA_CANTIDAD_NO_PUEDE_SER_NEGATIVA="El precio debe ser mayor a $0";
    private static final String ESTE_CAMPO_ES_OBLIGATORIO="El campo es obligatorio";

    private Long idProducto;
    private String nombre;
    private float precio;

    public Producto(String nombre, float precio,Long idProducto) {
        ValidadorArgumento.validarCampoObligatorio(nombre,ESTE_CAMPO_ES_OBLIGATORIO);
        ValidadorArgumento.validadorArgumentoCantidadPositiva(precio,LA_CANTIDAD_NO_PUEDE_SER_NEGATIVA);
        ValidadorArgumento.validarCampoVacio(nombre,ESTE_CAMPO_ES_OBLIGATORIO);
        ValidadorArgumento.validarCampoVacio(precio,ESTE_CAMPO_ES_OBLIGATORIO);
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto= idProducto;
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
