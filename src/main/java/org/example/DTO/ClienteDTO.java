package org.example.DTO;
import jakarta.persistence.*;

import java.time.LocalDate;
public class ClienteDTO {

    @Column(name = "CLI_ID")
    private Long Cliid;

    @Column(name = "CLI_NOME", length = 100, nullable = false)
    private String clinome;

    @Column(name = "CLI_CPF", length = 14, unique = true)
    private String clicpf;

    @Column(name = "CLI_RG", length = 20)
    private String clirg;

    @Column(name = "CLI_DATA_NASCIMENTO")
    private LocalDate clidataNascimento;

    @Column(name = "CLI_SEXO", length = 1)
    private String clisexo;

    @Column(name = "CLI_DATA_CADASTRO")
    private LocalDate clidataCadastro;

    @Column(name = "CLI_OBSERVACOES")
    private String cliobservacoes;

    @Column(name = "CLI_ATIVO")
    private boolean cliativo;

    public ClienteDTO() {
    }

    // Getters e Setters

    public Long getCliid() {
        return Cliid;
    }

    public void setCliid(Long cliid) {
        this.Cliid = cliid;
    }

    public String getClinome() {
        return clinome;
    }

    public void setClinome(String clinome) {
        this.clinome = clinome;
    }

    public String getClicpf() {
        return clicpf;
    }

    public void setClicpf(String clicpf) {
        this.clicpf = clicpf;
    }

    public String getClirg() {
        return clirg;
    }

    public void setClirg(String clirg) {
        this.clirg = clirg;
    }

    public LocalDate getClidataNascimento() {
        return clidataNascimento;
    }

    public void setClidataNascimento(LocalDate clidataNascimento) {
        this.clidataNascimento = clidataNascimento;
    }

    public String getClisexo() {
        return clisexo;
    }

    public void setClisexo(String clisexo) {
        this.clisexo = clisexo;
    }

    public LocalDate getClidataCadastro() {
        return clidataCadastro;
    }

    public void setClidataCadastro(LocalDate clidataCadastro) {
        this.clidataCadastro = clidataCadastro;
    }

    public String getCliobservacoes() {
        return cliobservacoes;
    }

    public void setCliobservacoes(String cliobservacoes) {
        this.cliobservacoes = cliobservacoes;
    }

    public boolean isCliativo() {
        return cliativo;
    }

    public void setCliativo(boolean cliativo) {
        this.cliativo = cliativo;
    }
}