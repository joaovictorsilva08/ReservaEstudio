package org.example.mapper;

import org.example.dto.FornecedorDTO;
import org.example.entities.Fornecedor;

public class FornecedorMapper {

    public static FornecedorDTO toDTOFornecedorDTO(Fornecedor fornecedor) {
        if (fornecedor == null) return null;

        FornecedorDTO dto = new FornecedorDTO();
        dto.setForneId(fornecedor.getForneId());
        dto.setForneRazaoSocial(fornecedor.getForneRazaoSocial());
        dto.setForneNomeFantasia(fornecedor.getForneNomeFantasia());
        dto.setForneCnpj(fornecedor.getForneCnpj());
        dto.setForneInscricaoEstadual(fornecedor.getForneInscricaoEstadual());
        dto.setForneInscricaoMunicipal(fornecedor.getForneInscricaoMunicipal());
        dto.setForneContatoResponsavel(fornecedor.getForneContatoResponsavel());
        dto.setForneDataCadastro(fornecedor.getForneDataCadastro());
        dto.setForneObservacoes(fornecedor.getForneObservacoes());
        dto.setForneAtivo(fornecedor.isForneAtivo());

        return dto;
    }

    public static Fornecedor toEntity(FornecedorDTO dto) {
        if (dto == null) return null;

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setForneId(dto.getForneId());
        fornecedor.setForneRazaoSocial(dto.getForneRazaoSocial());
        fornecedor.setForneNomeFantasia(dto.getForneNomeFantasia());
        fornecedor.setForneCnpj(dto.getForneCnpj());
        fornecedor.setForneInscricaoEstadual(dto.getForneInscricaoEstadual());
        fornecedor.setForneInscricaoMunicipal(dto.getForneInscricaoMunicipal());
        fornecedor.setForneContatoResponsavel(dto.getForneContatoResponsavel());
        fornecedor.setForneDataCadastro(dto.getForneDataCadastro());
        fornecedor.setForneObservacoes(dto.getForneObservacoes());
        fornecedor.setForneAtivo(dto.isForneAtivo());

        return fornecedor;
    }
}
