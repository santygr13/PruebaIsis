package com.isis.login.testdatabuilder.dominio.modelo;

import com.isis.login.dominio.modelo.Producto;

public class ProductoTestDataBuilder {

    private static final Long ID_PRODUCTO =1L;
    private static final String NOMBRE= "azucar";
    private static final float PRECIO= 2000;

    private Long idProducto;
    private String nombre;
    private float precio;

    public ProductoTestDataBuilder() {
        this.idProducto = ID_PRODUCTO;
        this.nombre = NOMBRE;
        this.precio = PRECIO;
    }

    public ProductoTestDataBuilder conIdProducto( Long id){
        this.idProducto=id;
        return this;
    }

    public ProductoTestDataBuilder conNombreProducto(String nombreProducto){
        this.nombre=nombreProducto;
        return this;
    }

    public ProductoTestDataBuilder conPrecioProdcuto(float precio){
        this.precio=precio;
        return this;
    }

    public Producto build(){
        return new Producto(this.nombre,this.precio,this.idProducto);
    }
}
