package org.example.dto;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class FornecedorDTO {

    private Long forneId;
    private String forneRazaoSocial;
    private String forneNomeFantasia;
    private String forneCnpj;
    private String forneInscricaoEstadual;
    private String forneInscricaoMunicipal;
    private String forneContatoResponsavel;
    private LocalDate forneDataCadastro;
    private String forneObservacoes;
    private boolean forneAtivo;

    public FornecedorDTO() {
    }
}
