package org.example.mapper;


import org.example.dto.EstudioDTO;
import org.example.entities.Estudio;

public class EstudioMapper {

    public static EstudioDTO toDTO(Estudio estudio) {
        if (estudio == null) return null;

        EstudioDTO dto = new EstudioDTO();
        dto.setEstid(estudio.getEstid());
        dto.setEstnome(estudio.getEstnome());
        dto.setEstcnpj(estudio.getEstcnpj());
        dto.setEstendereco(estudio.getEstendereco());
        dto.setEsttelefone(estudio.getEsttelefone());
        dto.setEstemail(estudio.getEstemail());
        dto.setEstatvo(estudio.isEstatvo());

        return dto;
    }

    public static Estudio toEntity(EstudioDTO dto) {
        if (dto == null) return null;


        Estudio estudio = new Estudio();
        estudio.setEstid(dto.getEstid());
        estudio.setEstnome(dto.getEstnome());
        estudio.setEstcnpj(dto.getEstcnpj());
        estudio.setEstendereco(dto.getEstendereco());
        estudio.setEsttelefone(dto.getEsttelefone());
        estudio.setEstemail(dto.getEstemail());
        estudio.setEstatvo(dto.isEstatvo());

        return estudio;
    }
}
