package org.example.resources;
import org.example.entities.Estudio;
import org.example.repositories.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("estudios")
public class EstudioController {

    @Autowired
    private EstudioRepository estudioRepository;

    @GetMapping
    public List<Estudio> listarTodos() {
        return estudioRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudio> buscarPorId(@PathVariable Long id) {
        return estudioRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estudio criar(@RequestBody Estudio estudio) {
        return estudioRepository.save(estudio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudio> atualizar(@PathVariable Long id, @RequestBody Estudio estudio) {
        return estudioRepository.findById(id)
                .map(eExistente -> {
                    estudio.setEstId(id);
                    Estudio atualizado = estudioRepository.save(estudio);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return estudioRepository.findById(id)
                .map(e -> {
                    estudioRepository.delete(e);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}