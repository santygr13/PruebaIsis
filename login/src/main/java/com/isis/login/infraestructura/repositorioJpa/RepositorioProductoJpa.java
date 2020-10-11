package com.isis.login.infraestructura.repositorioJpa;


import com.isis.login.infraestructura.entidad.ProductoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioProductoJpa extends JpaRepository<ProductoEntidad, Serializable> {


}
