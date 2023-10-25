package com.forestales.geforex.controlador;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Sort;

import com.forestales.geforex.modelo.For000Serviciosterritoriales;
import com.forestales.geforex.repositorio.ServiciosTerritorialesRepositorio;
import com.forestales.geforex.excepciones.ResourceNotFoundException;

@RestController
@RequestMapping("/set/")
@CrossOrigin(origins = "http://localhost:4201")
public class ServiciosTerritorialesControlador {
    @Autowired
    ServiciosTerritorialesRepositorio repository;

    @GetMapping("/listar")
    public ResponseEntity<List<For000Serviciosterritoriales>> getAll() {
        try {
            List<For000Serviciosterritoriales> items = new ArrayList<For000Serviciosterritoriales>();

            repository.findAll(Sort.by(Sort.Direction.ASC, "setServicioterritorialid"))
                    .forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/recuperar/{id}")
    public ResponseEntity<For000Serviciosterritoriales> getById(@PathVariable("id") Long id) {
        Optional<For000Serviciosterritoriales> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<For000Serviciosterritoriales> create(@RequestBody For000Serviciosterritoriales item) {
        try {

            String usuario = "usuarioAct";
            BigDecimal operacion = new BigDecimal("2.0");
            Timestamp fecha = new Timestamp(System.currentTimeMillis());

            item.setSetUsuario(usuario);
            item.setSetOperacion(operacion);
            item.setSetFecha(fecha);

            For000Serviciosterritoriales savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<For000Serviciosterritoriales> update(@PathVariable("id") Long id,
            @RequestBody For000Serviciosterritoriales expedientesEstados) {
        // se recuperará del servicio de login
        String usuario = "usuarioAct";
        BigDecimal operacion = new BigDecimal("2.0");
        Timestamp fecha = new Timestamp(System.currentTimeMillis());
        Optional<For000Serviciosterritoriales> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            For000Serviciosterritoriales existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            existingItem = expedientesEstados;
            existingItem.setSetUsuario(usuario);
            existingItem.setSetOperacion(operacion);
            existingItem.setSetFecha(fecha);

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
