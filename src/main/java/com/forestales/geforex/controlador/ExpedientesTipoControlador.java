package com.forestales.geforex.controlador;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;

import com.forestales.geforex.security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Sort;

import com.forestales.geforex.modelo.For000Expedientestipo;
import com.forestales.geforex.repositorio.ExpedientesTipoRepositorio;
import com.forestales.geforex.excepciones.ResourceNotFoundException;

@RestController
@RequestMapping("/tablas/ext")
public class ExpedientesTipoControlador {
    @Autowired
    ExpedientesTipoRepositorio repository;
    @Autowired
    JwtProvider jwtProvider;
    @GetMapping("/listar")
    public ResponseEntity<List<For000Expedientestipo>> getAll() {
        try {
            List<For000Expedientestipo> items = new ArrayList<For000Expedientestipo>();

            repository
                    .findAll(
                            Sort.by(Sort.Direction.ASC, "extExpedientetipoid"))
                    .forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/recuperar/{id}")
    public ResponseEntity<For000Expedientestipo> getById(@PathVariable("id") Long id) {
        Optional<For000Expedientestipo> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<For000Expedientestipo> create(@RequestBody For000Expedientestipo item, @RequestHeader String Authorization) {
        try {

            String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
            Integer operacion = 2;
            Timestamp fecha = new Timestamp(System.currentTimeMillis());

            item.setExtUsuario(usuario);
            item.setExtOperacion(operacion);
            item.setExtFecha(fecha);

            For000Expedientestipo savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<For000Expedientestipo> update(@PathVariable("id") Long id,
            @RequestBody For000Expedientestipo expedientesEstados, @RequestHeader String Authorization) {
        // se recuperará del servicio de login
        String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
        Integer operacion = 2;
        Timestamp fecha = new Timestamp(System.currentTimeMillis());
        Optional<For000Expedientestipo> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            For000Expedientestipo existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            existingItem = expedientesEstados;
            existingItem.setExtUsuario(usuario);
            existingItem.setExtOperacion(operacion);
            existingItem.setExtFecha(fecha);

            return new ResponseEntity<>(repository.save(existingItem), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        try {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

}
