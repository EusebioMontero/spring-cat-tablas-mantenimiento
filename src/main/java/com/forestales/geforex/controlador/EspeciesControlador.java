package com.forestales.geforex.controlador;

import java.util.List;
import java.util.Optional;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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

import com.forestales.geforex.modelo.For000Especies;
import com.forestales.geforex.repositorio.EspeciesRepositorio;
import com.forestales.geforex.excepciones.ResourceNotFoundException;

@RestController
@RequestMapping("/esp/")
@CrossOrigin(origins = "http://localhost:4201")
public class EspeciesControlador {
    @Autowired
    EspeciesRepositorio repository;

    @GetMapping("/listar")
    public ResponseEntity<List<For000Especies>> getAll() {
        try {
            List<For000Especies> items = new ArrayList<For000Especies>();

            repository.findAll(Sort.by(Sort.Direction.ASC, "espEspecieid")).forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/recuperar/{id}")
    public ResponseEntity<For000Especies> getById(@PathVariable("id") Long id) {
        Optional<For000Especies> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<For000Especies> create(@RequestBody For000Especies item) {
        try {
            String usuario = "usuarioAct";
            BigDecimal operacion = new BigDecimal("2.0");
            Timestamp fecha = new Timestamp(System.currentTimeMillis());

            item.setEspUsuario(usuario);
            item.setEspOperacion(operacion);
            item.setEspFecha(fecha);

            For000Especies savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<For000Especies> update(@PathVariable("id") Long id,
            @RequestBody For000Especies especieActualizada) {
        // se recuperará del servicio de login
        String usuario = "usuarioAct";
        BigDecimal operacion = new BigDecimal("2.0");
        Timestamp fecha = new Timestamp(System.currentTimeMillis());

        Optional<For000Especies> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            For000Especies existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            existingItem = especieActualizada;
            existingItem.setEspUsuario(usuario);
            existingItem.setEspOperacion(operacion);
            existingItem.setEspFecha(fecha);

            // For000Especies actualizado = repository.save(existingItem);

            return new ResponseEntity<>(repository.save(existingItem), HttpStatus.OK);

            // return ResponseEntity.ok(actualizado);
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

    // @GetMapping("/mensaje")
    // public String mostrarMensaje() {
    // // Realiza las operaciones necesarias para obtener el mensaje
    // String mensaje = "¡Hola! Este es un mensaje de ejemplo.";

    // return mensaje;
    // }

}
