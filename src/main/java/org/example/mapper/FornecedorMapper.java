package org.example.mapper;

import org.example.dto.FornecedorDTO;
import org.example.entities.Fornecedor;

public class FornecedorMapper {

    public static FornecedorDTO toDTOFornecedorDTO(Fornecedor fornecedor) {
        if (fornecedor == null) return null;

        FornecedorDTO dto = new FornecedorDTO();
        dto.setForneid(fornecedor.getForneid());
        dto.setFornerazaoSocial(fornecedor.getFornerazaoSocial());
        dto.setFornenomeFantasia(fornecedor.getFornenomeFantasia());
        dto.setFornecnpj(fornecedor.getFornecnpj());
        dto.setForneinscricaoEstadual(fornecedor.getForneinscricaoEstadual());
        dto.setForneinscricaoMunicipal(fornecedor.getForneinscricaoMunicipal());
        dto.setFornecontatoResponsavel(fornecedor.getFornecontatoResponsavel());
        dto.setFornedataCadastro(fornecedor.getFornedataCadastro());
        dto.setForneobservacoes(fornecedor.getForneobservacoes());
        dto.setForneativo(fornecedor.isForneativo());

        return dto;
    }

    public static Fornecedor toEntity(FornecedorDTO dto) {
        if (dto == null) return null;

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setForneid(dto.getForneid());
        fornecedor.setFornerazaoSocial(dto.getFornerazaoSocial());
        fornecedor.setFornenomeFantasia(dto.getFornenomeFantasia());
        fornecedor.setFornecnpj(dto.getFornecnpj());
        fornecedor.setForneinscricaoEstadual(dto.getForneinscricaoEstadual());
        fornecedor.setForneinscricaoMunicipal(dto.getForneinscricaoMunicipal());
        fornecedor.setFornecontatoResponsavel(dto.getFornecontatoResponsavel());
        fornecedor.setFornedataCadastro(dto.getFornedataCadastro());
        fornecedor.setForneobservacoes(dto.getForneobservacoes());
        fornecedor.setForneativo(dto.isForneativo());

        return fornecedor;
    }
}
