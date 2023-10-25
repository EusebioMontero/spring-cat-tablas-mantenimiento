package com.forestales.geforex.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forestales.geforex.modelo.For000Especies;

public interface EspeciesRepositorio extends JpaRepository<For000Especies, Long> {

}
