package com.isis.login.infraestructura.repositorioJpa;

import com.isis.login.infraestructura.entidad.ClienteEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioClienteJpa extends JpaRepository<ClienteEntidad, Serializable> {
}
