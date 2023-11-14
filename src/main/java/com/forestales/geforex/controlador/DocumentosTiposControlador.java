package com.forestales.geforex.controlador;

import java.math.BigDecimal;
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

import com.forestales.geforex.modelo.For000Documentostipos;
import com.forestales.geforex.repositorio.DocumentosTiposRepositorio;
import com.forestales.geforex.excepciones.ResourceNotFoundException;

@RestController
@RequestMapping("/tablas/dot")
public class DocumentosTiposControlador {

    @Autowired
    DocumentosTiposRepositorio repository;

    @Autowired
    JwtProvider jwtProvider;

    @GetMapping("/listar")
    public ResponseEntity<List<For000Documentostipos>> getAll() {
        try {
            List<For000Documentostipos> items = new ArrayList<For000Documentostipos>();

            repository.findAll(Sort.by(Sort.Direction.ASC, "dotTipodocumentoid")).forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/recuperar/{id}")
    public ResponseEntity<For000Documentostipos> getById(@PathVariable("id") Long id) {
        Optional<For000Documentostipos> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<For000Documentostipos> create(@RequestBody For000Documentostipos item, @RequestHeader String Authorization){
//        System.out.println("usuario en el token: "+jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) );

        try {

           String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
            System.out.println("Usuario del token: "+usuario);
//            String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
            BigDecimal operacion = new BigDecimal("2.0");
            Timestamp fecha = new Timestamp(System.currentTimeMillis());

            item.setDotUsuario(usuario);
            item.setDotOperacion(operacion);
            item.setDotFecha(fecha);

            For000Documentostipos savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<For000Documentostipos> update(@PathVariable("id") Long id,
            @RequestBody For000Documentostipos for000Documentostipos, @RequestHeader String Authorization) {
        // se recuperará del servicio de login
        String usuario = jwtProvider.getUserNameFromToken(Authorization.replace("Bearer ", "")) ;
        BigDecimal operacion = new BigDecimal("2.0");
        Timestamp fecha = new Timestamp(System.currentTimeMillis());
        Optional<For000Documentostipos> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            For000Documentostipos existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            existingItem = for000Documentostipos;
            existingItem.setDotUsuario(usuario);
            existingItem.setDotOperacion(operacion);
            existingItem.setDotFecha(fecha);

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