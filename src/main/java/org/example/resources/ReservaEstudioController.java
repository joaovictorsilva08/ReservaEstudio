package org.example.resources;


import org.example.entities.ReservaEstudios;
import org.example.services.ReservaEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/reservas")
public class ReservaEstudioController {

    @Autowired
    private ReservaEstudioService reservaEstudioService;

    // Listar todas as reservas
    @GetMapping
    public List<ReservaEstudios> listarTodos() {
        return reservaEstudioService.listarTodos();
    }

    // Buscar reserva por ID
    @GetMapping("/{id}")
    public ResponseEntity<ReservaEstudios> buscarPorId(@PathVariable Long id) {
        return reservaEstudioService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Criar nova reserva
    @PostMapping
    public ReservaEstudios criar(@RequestBody ReservaEstudios reservaEstudio) {
        return reservaEstudioService.salvar(reservaEstudio);
    }

    // Atualizar reserva existente
    @PutMapping("/{id}")
    public ResponseEntity<ReservaEstudios> atualizar(@PathVariable Long id, @RequestBody ReservaEstudios reservaEstudio) {
        return reservaEstudioService.buscarPorId(id).map(res -> {
            reservaEstudio.setResId(id);
            return ResponseEntity.ok(reservaEstudioService.salvar(reservaEstudio));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Deletar reserva
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (reservaEstudioService.buscarPorId(id).isPresent()) {
            reservaEstudioService.deletar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

