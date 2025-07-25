package org.example.entities;


import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private Long proid;
    @Column(name = "PRO_NOME", length = 100, nullable = false)
    private String pronome;
    @Column(name = "PRO_DESCRICAO", length = 255)
    private String prodescricao;

    @Column(name = "PRO_CODIGO_BARRAS", length = 50, unique = true)
    private String procodigoBarras;
    @Column(name = "PRO_REFERENCIA", length = 50)
    private String proreferencia;

    @Column(name = "PRO_UNIDADE_MEDIDA", length = 5)
    private String prounidadeMedida; // ex: UN, KG, L
    @Column(name = "PRO_MARCA", length = 50)
    private String promarca;
    @Column(name = "PRO_CATEGORIA", length = 50)
    private String procategoria;
    @Column(name = "PRO_PRECO_CUSTO", precision = 10, scale = 2)
    private BigDecimal proprecoCusto;
    @Column(name = "PRO_PRECO_VENDA", precision = 10, scale = 2)

    private BigDecimal proprecoVenda;

    @Column(name = "PRO_ESTOQUE_ATUAL")
    private Integer proestoqueAtual;

    @Column(name = "PRO_ESTOQUE_MINIMO")
    private Integer proestoqueMinimo;

    @Column(name = "PRO_ESTOQUE_MAXIMO")
    private Integer proestoqueMaximo;
    @Column(name = "PRO_LOCALIZACAO", length = 50)
    private String prolocalizacao; // ex: prateleira A1

    @Column(name = "PRO_DATA_VALIDADE")
    private LocalDate prodataValidade;

    @ManyToOne
    @JoinColumn(name = "FORNECEDOR_ID")
    private Fornecedor profornecedor;
    @Column(name = "PRO_ATIVO")
    private boolean proativo;

    @Column(name = "PRO_DATA_CADASTRO")
    private LocalDate prodataCadastro;

    @Column(name = "PRO_OBSERVACOES", columnDefinition = "TEXT")
    private String proobservacoes;

    public Produto() {}

    public Produto(Long id, String nome, String descricao, String codigoBarras, String referencia, String unidadeMedida,
                   String marca, String categoria, BigDecimal precoCusto, BigDecimal precoVenda, Integer estoqueAtual,
                   Integer estoqueMinimo, Integer estoqueMaximo, String localizacao, LocalDate dataValidade,
                   Fornecedor fornecedor, boolean ativo, LocalDate dataCadastro, String observacoes) {
        this.proid = id;
        this.pronome = nome;
        this.prodescricao = descricao;
        this.procodigoBarras = codigoBarras;
        this.proreferencia = referencia;
        this.prounidadeMedida = unidadeMedida;
        this.promarca = marca;
        this.procategoria = categoria;
        this.proprecoCusto = precoCusto;
        this.proprecoVenda = precoVenda;
        this.proestoqueAtual = estoqueAtual;
        this.proestoqueMinimo = estoqueMinimo;
        this.proestoqueMaximo = estoqueMaximo;
        this.prolocalizacao = localizacao;
        this.prodataValidade = dataValidade;
        this.profornecedor = fornecedor;
        this.proativo = ativo;
        this.prodataCadastro = dataCadastro;
        this.proobservacoes = observacoes;
    }

    public Long getProid() {
        return proid;
    }

    public void setProid(Long proid) {
        this.proid = proid;
    }

    public String getPronome() {
        return pronome;
    }

    public void setPronome(String pronome) {
        this.pronome = pronome;
    }

    public String getProdescricao() {
        return prodescricao;
    }

    public void setProdescricao(String prodescricao) {
        this.prodescricao = prodescricao;
    }

    public String getProcodigoBarras() {
        return procodigoBarras;
    }

    public void setProcodigoBarras(String procodigoBarras) {
        this.procodigoBarras = procodigoBarras;
    }

    public String getProreferencia() {
        return proreferencia;
    }

    public void setProreferencia(String proreferencia) {
        this.proreferencia = proreferencia;
    }

    public String getProunidadeMedida() {
        return prounidadeMedida;
    }

    public void setProunidadeMedida(String prounidadeMedida) {
        this.prounidadeMedida = prounidadeMedida;
    }

    public String getPromarca() {
        return promarca;
    }

    public void setPromarca(String promarca) {
        this.promarca = promarca;
    }

    public String getProcategoria() {
        return procategoria;
    }

    public void setProcategoria(String procategoria) {
        this.procategoria = procategoria;
    }

    public BigDecimal getProprecoCusto() {
        return proprecoCusto;
    }

    public void setProprecoCusto(BigDecimal proprecoCusto) {
        this.proprecoCusto = proprecoCusto;
    }

    public BigDecimal getProprecoVenda() {
        return proprecoVenda;
    }

    public void setProprecoVenda(BigDecimal proprecoVenda) {
        this.proprecoVenda = proprecoVenda;
    }

    public Integer getProestoqueAtual() {
        return proestoqueAtual;
    }

    public void setProestoqueAtual(Integer proestoqueAtual) {
        this.proestoqueAtual = proestoqueAtual;
    }

    public Integer getProestoqueMinimo() {
        return proestoqueMinimo;
    }

    public void setProestoqueMinimo(Integer proestoqueMinimo) {
        this.proestoqueMinimo = proestoqueMinimo;
    }

    public Integer getProestoqueMaximo() {
        return proestoqueMaximo;
    }

    public void setProestoqueMaximo(Integer proestoqueMaximo) {
        this.proestoqueMaximo = proestoqueMaximo;
    }

    public String getProlocalizacao() {
        return prolocalizacao;
    }

    public void setProlocalizacao(String prolocalizacao) {
        this.prolocalizacao = prolocalizacao;
    }

    public LocalDate getProdataValidade() {
        return prodataValidade;
    }

    public void setProdataValidade(LocalDate prodataValidade) {
        this.prodataValidade = prodataValidade;
    }

    public Fornecedor getProfornecedor() {
        return profornecedor;
    }

    public void setProfornecedor(Fornecedor profornecedor) {
        this.profornecedor = profornecedor;
    }

    public boolean isProativo() {
        return proativo;
    }

    public void setProativo(boolean proativo) {
        this.proativo = proativo;
    }

    public LocalDate getProdataCadastro() {
        return prodataCadastro;
    }

    public void setProdataCadastro(LocalDate prodataCadastro) {
        this.prodataCadastro = prodataCadastro;
    }

    public String getProobservacoes() {
        return proobservacoes;
    }

    public void setProobservacoes(String proobservacoes) {
        this.proobservacoes = proobservacoes;
    }
}
