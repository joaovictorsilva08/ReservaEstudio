package org.example.entities;

import jakarta.persistence.*;

@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private String tipo;  // Ex: à vista, parcelado, crédito, débito, pix, boleto ou bens pessoais kskksks

    private Integer numeroParcelas;

    private Integer diasEntreParcelas;

    private boolean permiteTroco;

    private Double taxaPercentual;

    private boolean ativo;

    public FormaPagamento() {}

    public FormaPagamento(Long id, String descricao, String tipo, Integer numeroParcelas, Integer diasEntreParcelas,
                          boolean permiteTroco, Double taxaPercentual, boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.numeroParcelas = numeroParcelas;
        this.diasEntreParcelas = diasEntreParcelas;
        this.permiteTroco = permiteTroco;
        this.taxaPercentual = taxaPercentual;
        this.ativo = ativo;
    }

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Integer getDiasEntreParcelas() {
        return diasEntreParcelas;
    }

    public void setDiasEntreParcelas(Integer diasEntreParcelas) {
        this.diasEntreParcelas = diasEntreParcelas;
    }

    public boolean isPermiteTroco() {
        return permiteTroco;
    }

    public void setPermiteTroco(boolean permiteTroco) {
        this.permiteTroco = permiteTroco;
    }

    public Double getTaxaPercentual() {
        return taxaPercentual;
    }

    public void setTaxaPercentual(Double taxaPercentual) {
        this.taxaPercentual = taxaPercentual;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
