package com.isis.login.infraestructura.repositorioJpa;


import com.isis.login.infraestructura.entidad.ProductoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioProductoJpa extends JpaRepository<ProductoEntidad, Serializable> {

    @Query(value="select * from producto where producto.nombre_producto = :nombreProducto", nativeQuery = true)
    ProductoEntidad filtroPorNombrePorducto(@Param("nombreProducto") String nombreProducto);

}
