package com.isis.login.infraestructura.repositorioJpa;

import com.isis.login.infraestructura.entidad.DetalleVentaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface RepositorioDetalleVentaJpa extends JpaRepository<DetalleVentaEntidad, Serializable> {
}
