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

import com.forestales.geforex.modelo.For000Municipiossigpac;
import com.forestales.geforex.modelo.For000Poblaciones;
import com.forestales.geforex.repositorio.PoblacionesRepositorio;
import com.forestales.geforex.excepciones.ResourceNotFoundException;

@RestController
@RequestMapping("tablas/pob")
//@CrossOrigin(origins = "http://localhost:4201")
public class PoblacionesControlador {
    @Autowired
    PoblacionesRepositorio repository;
    @Autowired
    JwtProvider jwtProvider;
    @GetMapping("/listar")
    public ResponseEntity<List<For000Poblaciones>> getAll() {
        System.out.println("LISTAR");
        try {
            List<For000Poblaciones> items = new ArrayList<For000Poblaciones>();

            repository.findAll(Sort.by(Sort.Direction.ASC, "pobPoblacionid")).forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/recuperar/{id}")
    public ResponseEntity<For000Poblaciones> getById(@PathVariable("id") Long id) {
        Optional<For000Poblaciones> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<For000Poblaciones> create(@RequestBody For000Poblaciones item, @RequestHeader String Authorization) {
        try {

            String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
            BigDecimal operacion = new BigDecimal("2.0");
            Timestamp fecha = new Timestamp(System.currentTimeMillis());

            item.setPobUsuario(usuario);
            item.setPobOperacion(operacion);
            item.setPobFecha(fecha);

            For000Poblaciones savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<For000Poblaciones> update(@PathVariable("id") Long id,
            @RequestBody For000Poblaciones for000Actividades, @RequestHeader String Authorization) {
        // se recuperará del servicio de login
        String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
        BigDecimal operacion = new BigDecimal("2.0");
        Timestamp fecha = new Timestamp(System.currentTimeMillis());
        Optional<For000Poblaciones> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            For000Poblaciones existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            existingItem = for000Actividades;
            existingItem.setPobUsuario(usuario);
            existingItem.setPobOperacion(operacion);
            existingItem.setPobFecha(fecha);

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

    @GetMapping("/pobPorProvincia")
    public ResponseEntity<List<For000Poblaciones>> getPobByCodProvincia(Long idProvincia) {

        List<For000Poblaciones> listFor000Poblaciones = new ArrayList<For000Poblaciones>();
        if (null != idProvincia)
            listFor000Poblaciones = repository.getPobByCodProvincia(idProvincia);

        return new ResponseEntity<>(listFor000Poblaciones, HttpStatus.OK);

    }

}
