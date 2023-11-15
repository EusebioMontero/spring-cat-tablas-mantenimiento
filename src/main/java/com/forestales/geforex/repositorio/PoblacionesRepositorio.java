package com.forestales.geforex.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.forestales.geforex.modelo.For000Poblaciones;

public interface PoblacionesRepositorio extends JpaRepository<For000Poblaciones, Long> {

    @Query("select pob " +
            "from For000Provincias pro " +
            "INNER JOIN For000Poblaciones pob ON (pro.proProvinciaid=pob.for000Provincias.proProvinciaid) " +
            "where pro.proProvinciaid=?1")
    List<For000Poblaciones> getPobByCodProvincia(Long idProvincia);

}
