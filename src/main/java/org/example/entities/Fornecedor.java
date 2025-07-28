package org.example.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FORNE_ID")
    private Long forneid;
    @Column(name = "FORNE_RAZAO_SOCIAL", length = 150, nullable = false)
    private String fornerazaoSocial;
    @Column(name = "FORNE_NOME_FANTASIA", length = 100)
    private String fornenomeFantasia;
    @Column(name = "FORNE_CNPJ", length = 18, unique = true)
    private String fornecnpj;
    @Column(name = "FORNE_INSCRICAO_ESTADUAL", length = 30)
    private String forneinscricaoEstadual;
    @Column(name = "FORNE_INSCRICAO_MUNICIPAL", length = 30)
    private String forneinscricaoMunicipal;
    @Column(name = "FORNE_CONTATO_RESPONSAVEL", length = 100)
    private String fornecontatoResponsavel;
    @Column(name = "FORNE_DATA_CADASTRO")
    private LocalDate fornedataCadastro;
    @Column(name = "FORNE_OBSERVACOES")
    private String forneobservacoes;
    @Column(name = "FORNE_ATIVO")
    private boolean forneativo;

    // Construtor vazio
    public Fornecedor() {}

    // Construtor completo
    public Fornecedor(Long id, String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual,
                      String inscricaoMunicipal, String contatoResponsavel, LocalDate dataCadastro, String observacoes,
                      boolean ativo) {
        this.forneid = id;
        this.fornerazaoSocial = razaoSocial;
        this.fornenomeFantasia = nomeFantasia;
        this.fornecnpj = cnpj;
        this.forneinscricaoEstadual = inscricaoEstadual;
        this.forneinscricaoMunicipal = inscricaoMunicipal;
        this.fornecontatoResponsavel = contatoResponsavel;
        this.fornedataCadastro = dataCadastro;
        this.forneobservacoes = observacoes;
        this.forneativo = ativo;
    }

    // Getters e setters


    public Long getForneid() {
        return forneid;
    }

    public void setForneid(Long forneid) {
        this.forneid = forneid;
    }

    public String getFornerazaoSocial() {
        return fornerazaoSocial;
    }

    public void setFornerazaoSocial(String fornerazaoSocial) {
        this.fornerazaoSocial = fornerazaoSocial;
    }

    public String getFornenomeFantasia() {
        return fornenomeFantasia;
    }

    public void setFornenomeFantasia(String fornenomeFantasia) {
        this.fornenomeFantasia = fornenomeFantasia;
    }

    public String getFornecnpj() {
        return fornecnpj;
    }

    public void setFornecnpj(String fornecnpj) {
        this.fornecnpj = fornecnpj;
    }

    public String getForneinscricaoEstadual() {
        return forneinscricaoEstadual;
    }

    public void setForneinscricaoEstadual(String forneinscricaoEstadual) {
        this.forneinscricaoEstadual = forneinscricaoEstadual;
    }

    public String getForneinscricaoMunicipal() {
        return forneinscricaoMunicipal;
    }

    public void setForneinscricaoMunicipal(String forneinscricaoMunicipal) {
        this.forneinscricaoMunicipal = forneinscricaoMunicipal;
    }

    public String getFornecontatoResponsavel() {
        return fornecontatoResponsavel;
    }

    public void setFornecontatoResponsavel(String fornecontatoResponsavel) {
        this.fornecontatoResponsavel = fornecontatoResponsavel;
    }

    public LocalDate getFornedataCadastro() {
        return fornedataCadastro;
    }

    public void setFornedataCadastro(LocalDate fornedataCadastro) {
        this.fornedataCadastro = fornedataCadastro;
    }

    public String getForneobservacoes() {
        return forneobservacoes;
    }

    public void setForneobservacoes(String forneobservacoes) {
        this.forneobservacoes = forneobservacoes;
    }

    public boolean isForneativo() {
        return forneativo;
    }

    public void setForneativo(boolean forneativo) {
        this.forneativo = forneativo;
    }
}
