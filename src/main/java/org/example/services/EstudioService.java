package org.example.services;

import org.example.dto.EstudioDTO;
import org.example.entities.Estudio;
import org.example.mapper.EstudioMapper;
import org.example.repositories.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstudioService {

    @Autowired
    private EstudioRepository estudioRepository;

    // Retorna lista de DTOs
    public List<EstudioDTO> listarTodos() {
        List<Estudio> estudios = estudioRepository.findAll();
        return estudios.stream()
                .map(EstudioMapper::toDTO)
                .collect(Collectors.toList());
    }

    // Retorna um DTO pelo id (ou lança exceção se quiser)
    public EstudioDTO buscarPorId(Long id) {
        Estudio estudio = estudioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudio não encontrado com id " + id));
        return EstudioMapper.toDTO(estudio);
    }

    // Cria e retorna o DTO salvo
    public EstudioDTO criar(EstudioDTO estudioDTO) {
        Estudio estudio = EstudioMapper.toEntity(estudioDTO);
        estudio = estudioRepository.save(estudio);
        return EstudioMapper.toDTO(estudio);
    }

    // Atualiza e retorna o DTO atualizado
    public EstudioDTO atualizar(Long id, EstudioDTO estudioDTO) {
        Estudio estudioExistente = estudioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudio não encontrado com id " + id));

        Estudio estudioAtualizado = EstudioMapper.toEntity(estudioDTO);
        estudioAtualizado.setEstId(id); // garante que o id permaneça o mesmo

        estudioAtualizado = estudioRepository.save(estudioAtualizado);
        return EstudioMapper.toDTO(estudioAtualizado);
    }

    // Deleta e retorna true se deletou, false se não encontrou
    public boolean deletar(Long id) {
        return estudioRepository.findById(id).map(estudio -> {
            estudioRepository.delete(estudio);
            return true;
        }).orElse(false);
    }
}


