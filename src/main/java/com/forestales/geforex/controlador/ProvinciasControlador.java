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
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.forestales.geforex.modelo.For000Provincias;
import com.forestales.geforex.repositorio.ProvinciasRepositorio;
import com.forestales.geforex.excepciones.ResourceNotFoundException;

@RestController
@RequestMapping("tablas/pro")
//@CrossOrigin(origins = "http://localhost:4201")
public class ProvinciasControlador {
    @Autowired
    ProvinciasRepositorio repository;
    @Autowired
    JwtProvider jwtProvider;
    @GetMapping("/listar")
    public ResponseEntity<List<For000Provincias>> getAll() {
        try {
            List<For000Provincias> items = new ArrayList<For000Provincias>();

            repository.findAll(Sort.by(Sort.Direction.ASC, "proProvinciaid")).forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/recuperar/{id}")
    public ResponseEntity<For000Provincias> getById(@PathVariable("id") Long id) {
        Optional<For000Provincias> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<For000Provincias> create(@RequestBody For000Provincias item , @RequestHeader String Authorization) {
        try {

            String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
            BigDecimal operacion = new BigDecimal("2.0");
            Timestamp fecha = new Timestamp(System.currentTimeMillis());

            item.setProUsuario(usuario);
            item.setProOperacion(operacion);
            item.setProFecha(fecha);

            For000Provincias savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<For000Provincias> update(@PathVariable("id") Long id,
            @RequestBody For000Provincias for000Actividades, @RequestHeader String Authorization) {
        // se recuperará del servicio de login
        String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
        BigDecimal operacion = new BigDecimal("2.0");
        Timestamp fecha = new Timestamp(System.currentTimeMillis());
        Optional<For000Provincias> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            For000Provincias existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            existingItem = for000Actividades;
            existingItem.setProUsuario(usuario);
            existingItem.setProOperacion(operacion);
            existingItem.setProFecha(fecha);

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
