package org.example.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "PROPRIETARIO")
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROP_ID")
    private Long propid;

    @Column(name = "PROP_NOME", length = 100, nullable = false)
    private String propnome;

    @Column(name = "PROP_CPF", length = 14, unique = true, nullable = false)
    private String propcpf;

    @Column(name = "PROP_RG", length = 20)
    private String proprg;

    @Column(name = "PROP_TELEFONE", length = 20)
    private String proptelefone;

    @Column(name = "PROP_EMAIL", length = 100)
    private String propemail;

    @Column(name = "PROP_ATIVO")
    private boolean propativo;

    public Proprietario(Long propid, String propnome, String propcpf, String proprg, String proptelefone, String propemail, boolean propativo) {
        this.propid = propid;
        this.propnome = propnome;
        this.propcpf = propcpf;
        this.proprg = proprg;
        this.proptelefone = proptelefone;
        this.propemail = propemail;
        this.propativo = propativo;
    }

    public Long getPropid() {
        return propid;
    }

    public void setPropid(Long propid) {
        this.propid = propid;
    }

    public String getPropnome() {
        return propnome;
    }

    public void setPropnome(String propnome) {
        this.propnome = propnome;
    }

    public String getPropcpf() {
        return propcpf;
    }

    public void setPropcpf(String propcpf) {
        this.propcpf = propcpf;
    }

    public String getProprg() {
        return proprg;
    }

    public void setProprg(String proprg) {
        this.proprg = proprg;
    }

    public String getProptelefone() {
        return proptelefone;
    }

    public void setProptelefone(String proptelefone) {
        this.proptelefone = proptelefone;
    }

    public String getPropemail() {
        return propemail;
    }

    public void setPropemail(String propemail) {
        this.propemail = propemail;
    }

    public boolean isPropativo() {
        return propativo;
    }

    public void setPropativo(boolean propativo) {
        this.propativo = propativo;
    }
}
