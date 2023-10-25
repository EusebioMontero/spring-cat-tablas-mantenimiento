package com.forestales.geforex.controlador;

import java.util.List;
import java.util.Map;
import java.util.Optional;
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

import com.forestales.geforex.modelo.For000Expedientestipo;
import com.forestales.geforex.modelo.For000Expedientesviassaca;
import com.forestales.geforex.repositorio.ExpedientesTipoRepositorio;
import com.forestales.geforex.excepciones.ResourceNotFoundException;

@RestController
@RequestMapping("/ext/")
@CrossOrigin(origins = "http://localhost:4201")
public class ExpedientesTipoControlador {
    @Autowired
    ExpedientesTipoRepositorio repositorio;

    @GetMapping("/hola")
    public String mostrarHola() {

        return "hola";

    }

    // este metodo sirve para listar todos los tipos de expedientes
    @GetMapping("/listar")
    public List<For000Expedientestipo> listarTodosLosExpedientesTipo() {

        List<For000Expedientestipo> listExpedientesTipos = new ArrayList<For000Expedientestipo>();
        Sort ordenamiento = Sort.by(Sort.Direction.ASC, "extExpedientetipoid");

        listExpedientesTipos = repositorio.findAll(ordenamiento);

        int tamanio = listExpedientesTipos.size();

        System.out.println("tamanio" + tamanio);
        return listExpedientesTipos;

    }

    // este metodo sirve para guardar el tipo de expediente
    @PostMapping("/guardar")
    public For000Expedientestipo guardarExpedientesTipo(@RequestBody For000Expedientestipo expedientesTipo) {

        // expedientesTipo.setId(2L);
        // expedientesTipo.setExtLetra("A");
        // expedientesTipo.setExtDescripcion("sssss");
        // expedientesTipo.setExtPlazosResolucion(1);

        return repositorio.save(expedientesTipo);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<For000Expedientestipo> update(@PathVariable("id") Long id,
            @RequestBody For000Expedientestipo expedientesEstados) {
        Optional<For000Expedientestipo> existingItemOptional = repositorio.findById(id);
        if (existingItemOptional.isPresent()) {
            For000Expedientestipo existingItem = existingItemOptional.get();
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            existingItem.setExtDescripcion("MODIFICADO");
            return new ResponseEntity<>(repositorio.save(existingItem), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // este metodo sirve para eliminar un tipo de expediente
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarExpedienteTipo(@PathVariable Long id) {
        For000Expedientestipo expedientesTipo = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el tipo de expediente con el ID : " + id));

        repositorio.delete(expedientesTipo);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar", Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }

}
