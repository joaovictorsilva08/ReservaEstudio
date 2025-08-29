package org.example.services;

import org.example.entities.ReservaEstudios;
import org.example.repositories.ReservaEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaEstudioService {

    @Autowired
    private ReservaEstudioRepository reservaEstudioRepository;

    // Listar todas as reservas
    public List<ReservaEstudios> listarTodos() {
        return reservaEstudioRepository.findAll();
    }

    // Buscar reserva por ID
    public Optional<ReservaEstudios> buscarPorId(Long id) {
        return reservaEstudioRepository.findById(id);
    }

    // Criar ou atualizar reserva
    public ReservaEstudios salvar(ReservaEstudios reservaEstudio) {
        return reservaEstudioRepository.save(reservaEstudio);
    }

    // Deletar reserva por ID
    public void deletar(Long id) {
        reservaEstudioRepository.deleteById(id);
    }
}
