package org.example.entities;

import jakarta.persistence.*;

@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FORM_ID")
    private Long formid;
    @Column(name = "FORM_DESCRICAO", length = 100, nullable = false)
    private String formdescricao;
    @Column(name = "FORM_TIPO", length = 50, nullable = false)
    private String formtipo;  // Ex: à vista, parcelado, crédito, débito, pix, boleto ou bens pessoais kskksks
    @Column(name = "FORM_NUMERO_PARCELAS")
    private Integer formnumeroParcelas;
    @Column(name = "FORM_DIAS_ENTRE_PARCELAS")
    private Integer formdiasEntreParcelas;
    @Column(name = "FORM_PERMITE_TROCO")
    private boolean formpermiteTroco;
    @Column(name = "FORM_TAXA_PERCENTUAL")
    private Double formtaxaPercentual;
    @Column(name = "FORM_ATIVO")
    private boolean formativo;

    public FormaPagamento() {}

    public FormaPagamento(Long id, String descricao, String tipo, Integer numeroParcelas, Integer diasEntreParcelas,
                          boolean permiteTroco, Double taxaPercentual, boolean ativo) {
        this.formid = id;
        this.formdescricao = descricao;
        this.formtipo = tipo;
        this.formnumeroParcelas = numeroParcelas;
        this.formdiasEntreParcelas = diasEntreParcelas;
        this.formpermiteTroco = permiteTroco;
        this.formtaxaPercentual = taxaPercentual;
        this.formativo = ativo;
    }

    // Getters e setters


    public Long getFormid() {
        return formid;
    }

    public void setFormid(Long formid) {
        this.formid = formid;
    }

    public String getFormdescricao() {
        return formdescricao;
    }

    public void setFormdescricao(String formdescricao) {
        this.formdescricao = formdescricao;
    }

    public String getFormtipo() {
        return formtipo;
    }

    public void setFormtipo(String formtipo) {
        this.formtipo = formtipo;
    }

    public Integer getFormnumeroParcelas() {
        return formnumeroParcelas;
    }

    public void setFormnumeroParcelas(Integer formnumeroParcelas) {
        this.formnumeroParcelas = formnumeroParcelas;
    }

    public Integer getFormdiasEntreParcelas() {
        return formdiasEntreParcelas;
    }

    public void setFormdiasEntreParcelas(Integer formdiasEntreParcelas) {
        this.formdiasEntreParcelas = formdiasEntreParcelas;
    }

    public boolean isFormpermiteTroco() {
        return formpermiteTroco;
    }

    public void setFormpermiteTroco(boolean formpermiteTroco) {
        this.formpermiteTroco = formpermiteTroco;
    }

    public Double getFormtaxaPercentual() {
        return formtaxaPercentual;
    }

    public void setFormtaxaPercentual(Double formtaxaPercentual) {
        this.formtaxaPercentual = formtaxaPercentual;
    }

    public boolean isFormativo() {
        return formativo;
    }

    public void setFormativo(boolean formativo) {
        this.formativo = formativo;
    }
}
