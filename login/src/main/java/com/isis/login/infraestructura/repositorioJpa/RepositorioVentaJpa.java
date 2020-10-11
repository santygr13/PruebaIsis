package com.isis.login.infraestructura.repositorioJpa;

import com.isis.login.infraestructura.entidad.VentaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioVentaJpa extends JpaRepository<VentaEntidad, Serializable> {
}
