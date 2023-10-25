package com.forestales.geforex.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.forestales.geforex.modelo.For000Expedientesestado;

@Repository
public interface ExpedientesEstadosRepositorio extends JpaRepository<For000Expedientesestado, Long> {
}