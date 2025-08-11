package org.example.mapper;


import org.example.dto.EstudioDTO;
import org.example.entities.Estudio;

public class EstudioMapper {

    public static EstudioDTO toDTO(Estudio estudio) {
        if (estudio == null) return null;

        EstudioDTO dto = new EstudioDTO();
        dto.setEstId(estudio.getEstId());
        dto.setEstNome(estudio.getEstNome());
        dto.setEstCnpj(estudio.getEstCnpj());
        dto.setEstEndereco(estudio.getEstEndereco());
        dto.setEstTelefone(estudio.getEstTelefone());
        dto.setEstEmail(estudio.getEstEmail());
        dto.setEstAtivo(estudio.isEstAtivo());

        return dto;
    }

    public static Estudio toEntity(EstudioDTO dto) {
        if (dto == null) return null;


        Estudio estudio = new Estudio();
        estudio.setEstId(dto.getEstId());
        estudio.setEstNome(dto.getEstNome());
        estudio. setEstCnpj(dto.getEstCnpj());
        estudio.setEstEndereco(dto.getEstEndereco());
        estudio.setEstTelefone(dto.getEstTelefone());
        estudio.setEstEmail(dto.getEstEmail());
        estudio.setEstAtivo(dto.isEstAtivo());

        return estudio;
    }
}
