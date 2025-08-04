package org.example.entities;
import jakarta.persistence.*;


@Entity
@Table(name = "ESTUDIO")
public class Estudio {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "EST_ID")
private Long estid;

    @Column(name = "EST_NOME", length = 100, nullable = false)
    private String estnome;

    @Column(name = "EST_CNPJ", length = 18, unique = true)
    private String estcnpj;

    @Column(name = "EST_ENDERECO", length = 255)
    private String estendereco;

    @Column(name = "EST_TELEFONE", length = 20)
    private String esttelefone;

    @Column(name = "EST_EMAIL", length = 100)
    private String estemail;

    @Column(name = "EST_ATIVO")
    private boolean estatvo;

    public Estudio(Long estid, String estnome, String estcnpj, String estendereco, String esttelefone, String estemail, boolean estatvo) {
        this.estid = estid;
        this.estnome = estnome;
        this.estcnpj = estcnpj;
        this.estendereco = estendereco;
        this.esttelefone = esttelefone;
        this.estemail = estemail;
        this.estatvo = estatvo;
    }

    public Long getEstid() {
        return estid;
    }

    public void setEstid(Long estid) {
        this.estid = estid;
    }

    public String getEstnome() {
        return estnome;
    }

    public void setEstnome(String estnome) {
        this.estnome = estnome;
    }

    public String getEstcnpj() {
        return estcnpj;
    }

    public void setEstcnpj(String estcnpj) {
        this.estcnpj = estcnpj;
    }

    public String getEstendereco() {
        return estendereco;
    }

    public void setEstendereco(String estendereco) {
        this.estendereco = estendereco;
    }

    public String getEsttelefone() {
        return esttelefone;
    }

    public void setEsttelefone(String esttelefone) {
        this.esttelefone = esttelefone;
    }

    public String getEstemail() {
        return estemail;
    }

    public void setEstemail(String estemail) {
        this.estemail = estemail;
    }

    public boolean isEstatvo() {
        return estatvo;
    }

    public void setEstatvo(boolean estatvo) {
        this.estatvo = estatvo;
    }
}
