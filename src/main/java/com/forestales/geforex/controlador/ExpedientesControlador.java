package com.forestales.geforex.controlador;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Date;

import javax.persistence.Tuple;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

import com.forestales.geforex.security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

import com.forestales.geforex.modelo.ExpParcelas;
import com.forestales.geforex.modelo.For000Expedientes;
import com.forestales.geforex.modelo.For000Expedientesestado;
import com.forestales.geforex.modelo.For000Expedientestipo;
//import com.forestales.geforex.entidades.BusquedaListadoPrincipal;
//import com.forestales.geforex.entidades.DatosExpedientesParcelas;
import com.forestales.geforex.repositorio.ExpedientesRepositorio;
import com.forestales.geforex.excepciones.ResourceNotFoundException;

@RestController
@RequestMapping("/tablas/exp")

public class ExpedientesControlador {
    @Autowired
    ExpedientesRepositorio repository;
    @Autowired
    JwtProvider jwtProvider;
    @GetMapping("/listar")
    public ResponseEntity<List<For000Expedientes>> getAll() {
        try {
            List<For000Expedientes> items = new ArrayList<For000Expedientes>();

            repository.findAll().forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/recuperar/{id}")
    public ResponseEntity<For000Expedientes> getById(@PathVariable("id") Long id) {
        Optional<For000Expedientes> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<For000Expedientes> create(@RequestBody For000Expedientes item) {
        try {
            For000Expedientes savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<For000Expedientes> update(@PathVariable("id") Long id,
            @RequestBody For000Expedientes expedientesEstados) {
        Optional<For000Expedientes> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            For000Expedientes existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
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

    // @GetMapping("/{id}")
    // public ResponseEntity<For000Expediente> datosExpedientes(@PathVariable Long
    // id) {
    // Optional<For000Expediente> invoice = repository.findById(id);
    // if (invoice.isPresent())
    // return new ResponseEntity<>(invoice.get(), HttpStatus.OK);
    // return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    // }

    // @GetMapping("/busqueda2")
    // public ResponseEntity<List<For000Expediente>> listExpFiltrado2(String
    // tipoExp, String fincaId) {
    // try {
    // List<For000Expediente> items = new ArrayList<For000Expediente>();

    // if (tipoExp != null && !tipoExp.equals("") || fincaId != null &&
    // !fincaId.equals("")) {

    // repository.findExpFiltro(tipoExp, fincaId).forEach(items::add);
    // } else
    // repository.findAll().forEach(items::add);

    // if (items.isEmpty())
    // return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    // return new ResponseEntity<>(items, HttpStatus.OK);
    // } catch (Exception e) {
    // return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    // }
    // }

    @GetMapping("/busqueda")
    public ResponseEntity<List<ExpParcelas>> listExpFiltrado(String tipoExp, String fincaId) {
        try {
            List<For000Expedientes> items = new ArrayList<For000Expedientes>();
            List<ExpParcelas> listaExpParcelas = new ArrayList<ExpParcelas>();

            if (tipoExp != null && !tipoExp.equals("") || fincaId != null && !fincaId.equals("")) {
                Long tipoExp1 = null != tipoExp ? Long.valueOf(tipoExp) : null;
                Long fincaId1 = null != fincaId ? Long.valueOf(fincaId) : null;
                List<Tuple> listaExp = repository.findExpFiltro(tipoExp1, fincaId1);

                for (Tuple exp : listaExp) {
                    ExpParcelas par = new ExpParcelas();
                    System.out.println(exp.get("expExpedienteid"));
                    par.setExpExpedienteid((Long) exp.get("expExpedienteid"));
                    par.setExtExpedientetipoid((Long) exp.get("extExpedientetipoid"));
                    par.setExeExpedienteestadoid((Long) exp.get("exeExpedienteestadoid"));
                    par.setFinFincaid((long) exp.get("finFincaid"));
                    par.setExpFechainicio((Date) exp.get("expFechainicio"));
                    par.setExpFechaprevistafin((Date) exp.get("expFechaprevistafin"));
                    par.setExpIgf((String) exp.get("expIgf"));

                    listaExpParcelas.add(par);

                }
                // repository.findExpFiltro(tipoExp1, fincaId1).forEach(items::add);
            } // else
              // repository.findAll().forEach(items::add);

            if (listaExpParcelas.size() == 0)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(listaExpParcelas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // public List<For000Expedientes> findExpFiltro(Long expExpedienteid, BigDecimal
    // expCampana, String expIgf,
    // String expNumexpediente, String expUsuario, For000Expedientessestado
    // For000Expedientessestado,
    // For000Expedientestipo for000Expedientestipo){

    // For000ExpedienteSpecification spec = new
    // For000ExpedienteSpecification(expExpedienteid, expCampana, expIgf,
    // expNumexpediente, expUsuario, for000Expedientesestado,
    // for000Expedientestipo);
    // return repository.findAll(spec);

    // }

}
