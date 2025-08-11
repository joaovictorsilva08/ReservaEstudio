package org.example.entities;
import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ESTUDIO")
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EST_ID")
    private Long estId;

    @Column(name = "EST_NOME", length = 100, nullable = false)
    private String estNome;

    @Column(name = "EST_CNPJ", length = 18, unique = true)
    private String estCnpj;

    @Column(name = "EST_ENDERECO", length = 255)
    private String estEndereco;

    @Column(name = "EST_TELEFONE", length = 20)
    private String estTelefone;

    @Column(name = "EST_EMAIL", length = 100)
    private String estEmail;

    @Column(name = "EST_ATIVO")
    private boolean estAtivo;

    public Estudio(Long estId, String estNome, String estCnpj, String estEndereco, String estTelefone, String estEmail, boolean estAtivo) {
        this.estId = estId;
        this.estNome = estNome;
        this.estCnpj = estCnpj;
        this.estEndereco = estEndereco;
        this.estTelefone = estTelefone;
        this.estEmail = estEmail;
        this.estAtivo = estAtivo;
    }
}

