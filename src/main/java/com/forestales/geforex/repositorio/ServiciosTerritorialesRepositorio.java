package com.forestales.geforex.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.forestales.geforex.modelo.For000Serviciosterritoriales;

@Repository
public interface ServiciosTerritorialesRepositorio extends JpaRepository<For000Serviciosterritoriales, Long> {
}