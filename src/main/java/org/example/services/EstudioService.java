package org.example.services;

import org.example.entities.Estudio;
import org.example.repositories.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EstudioService {
    @Autowired
    private EstudioRepository estudioRepository;

    public List<Estudio> listarTodos() {
        return estudioRepository.findAll();
    }

    public Optional<Estudio> buscarPorId(Long id) {
        return estudioRepository.findById(id);
    }

    public Estudio criar(Estudio estudio) {
        return estudioRepository.save(estudio);
    }

    public Optional<Estudio> atualizar(Long id, Estudio estudioAtualizado) {
        return estudioRepository.findById(id).map(estudioExistente -> {
            estudioAtualizado.setEstid(id);
            return estudioRepository.save(estudioAtualizado);
        });
    }

    public boolean deletar(Long id) {
        return estudioRepository.findById(id).map(estudio -> {
            estudioRepository.delete(estudio);
            return true;
        }).orElse(false);
    }
}

