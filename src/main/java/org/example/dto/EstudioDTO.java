package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstudioDTO {

    private Long estId;
    private String estNome;
    private String estCnpj;
    private String estEndereco;
    private String estTelefone;
    private String estEmail;
    private boolean estAtivo;

    public EstudioDTO() {
    }
}
