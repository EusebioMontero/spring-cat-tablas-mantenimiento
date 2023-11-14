package com.forestales.geforex.controlador;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.forestales.geforex.security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.forestales.geforex.modelo.For000Expedientesestado;
import com.forestales.geforex.repositorio.ExpedientesEstadosRepositorio;
import com.forestales.geforex.excepciones.ResourceNotFoundException;

@RestController
@RequestMapping("/tablas/exe")
public class ExpedientesEstadosControlador {

    @Autowired
    ExpedientesEstadosRepositorio repository;
    @Autowired
    JwtProvider jwtProvider;
    @GetMapping("/listar")
    public ResponseEntity<List<For000Expedientesestado>> getAll() {
        try {
            List<For000Expedientesestado> items = new ArrayList<For000Expedientesestado>();

            repository.findAll(Sort.by(Sort.Direction.ASC, "exeExpedienteestadoid")).forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/recuperar/{id}")
    public ResponseEntity<For000Expedientesestado> getById(@PathVariable("id") Long id) {
        Optional<For000Expedientesestado> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<For000Expedientesestado> create(@RequestBody For000Expedientesestado item, @RequestHeader String Authorization) {
        try {

            String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
            Integer operacion = 2;
            Timestamp fecha = new Timestamp(System.currentTimeMillis());

            item.setExeUsuario(usuario);
            item.setExeOperacion(operacion);
            item.setExeFecha(fecha);

            For000Expedientesestado savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<For000Expedientesestado> update(@PathVariable("id") Long id,
            @RequestBody For000Expedientesestado expedientesEstados, @RequestHeader String Authorization) {
        // se recuperará del servicio de login
        String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
        Integer operacion = 2;
        Timestamp fecha = new Timestamp(System.currentTimeMillis());
        Optional<For000Expedientesestado> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            For000Expedientesestado existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            existingItem = expedientesEstados;
            existingItem.setExeUsuario(usuario);
            existingItem.setExeOperacion(operacion);
            existingItem.setExeFecha(fecha);

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