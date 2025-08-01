package org.example.DTO;

public class ClienteDTO {
    private long Cliid;
    private String nome;
    private String cpf;
    private String rua;
    private String cep;
    private String numero;
    private String endereco;

    public ClienteDTO() {
    }

    public long getCliid() {
        return Cliid;
    }

    public void setCliid(long cliid) {
        Cliid = cliid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
