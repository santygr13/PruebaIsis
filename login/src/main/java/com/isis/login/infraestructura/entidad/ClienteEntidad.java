package com.isis.login.infraestructura.entidad;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class ClienteEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(name = "nombre_cliente", nullable = false, length = 30)
    private String nombre;

    @Column(name = "apellido_cliente", nullable = false, length = 20)
    private String apellido;

    @Column(name = "dni_cliente", nullable = false, length = 30)
    private String dni;

    @Column(name = "telefono_cliente", nullable = false, length = 30)
    private String telefono;

    @Column(name = "email_cliente", nullable = false, length = 40)
    private String email;


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
