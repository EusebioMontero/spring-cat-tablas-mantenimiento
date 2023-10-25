package com.forestales.geforex.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.forestales.geforex.modelo.For000Expedientesfincas;

@Repository
public interface ExpedientesFincasRepositorio extends JpaRepository<For000Expedientesfincas, Long> {
}