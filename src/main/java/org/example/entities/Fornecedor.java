package org.example.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FORNE_ID")
    private Long forneId;

    @Column(name = "FORNE_RAZAO_SOCIAL", length = 150, nullable = false)
    private String forneRazaoSocial;

    @Column(name = "FORNE_NOME_FANTASIA", length = 100)
    private String forneNomeFantasia;

    @Column(name = "FORNE_CNPJ", length = 18, unique = true)
    private String forneCnpj;

    @Column(name = "FORNE_INSCRICAO_ESTADUAL", length = 30)
    private String forneInscricaoEstadual;

    @Column(name = "FORNE_INSCRICAO_MUNICIPAL", length = 30)
    private String forneInscricaoMunicipal;

    @Column(name = "FORNE_CONTATO_RESPONSAVEL", length = 100)
    private String forneContatoResponsavel;

    @Column(name = "FORNE_DATA_CADASTRO")
    private LocalDate forneDataCadastro;

    @Column(name = "FORNE_OBSERVACOES")
    private String forneObservacoes;

    @Column(name = "FORNE_ATIVO")
    private boolean forneAtivo;

    public Fornecedor(Long forneId, String forneRazaoSocial, String forneNomeFantasia, String forneCnpj,
                      String forneInscricaoEstadual, String forneInscricaoMunicipal, String forneContatoResponsavel,
                      LocalDate forneDataCadastro, String forneObservacoes, boolean forneAtivo) {
        this.forneId = forneId;
        this.forneRazaoSocial = forneRazaoSocial;
        this.forneNomeFantasia = forneNomeFantasia;
        this.forneCnpj = forneCnpj;
        this.forneInscricaoEstadual = forneInscricaoEstadual;
        this.forneInscricaoMunicipal = forneInscricaoMunicipal;
        this.forneContatoResponsavel = forneContatoResponsavel;
        this.forneDataCadastro = forneDataCadastro;
        this.forneObservacoes = forneObservacoes;
        this.forneAtivo = forneAtivo;
    }
}
