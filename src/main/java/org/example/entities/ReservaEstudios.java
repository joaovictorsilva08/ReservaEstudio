package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ReservaEstudios {

    @Id
    @Column(name = "RES_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CLI_ID")
    private Cliente cliente;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "EST_ID")
    private Estudio estudio;

    @OneToMany(mappedBy = "pagReserva", cascade = CascadeType.ALL)
    private List<FormaPagamento> FormaPagamento = new ArrayList<>();

    @Column(name = "RES_DATA", nullable = false)
    private Date resData;

    @Column(name = "RES_HORA_INICIO", nullable = false)
    private Date resHoraInicio;

    @Column(name = "RES_HORA_FIM", nullable = false)
    private Date resHoraFim;

    @Column(name = "RES_VALOR", nullable = false)
    private Double resValor;

    @Column(name = "RES_STATUS", length = 20, nullable = false)
    private String resStatus;

    @Column(name = "RES_OBSERVACOES")
    private String resObservacoes;

    public ReservaEstudios(Long resId, Cliente cliente, Estudio estudio, Date resData, Date resHoraInicio, Date resHoraFim,
                          Double resValor, String resStatus, String resObservacoes) {
        this.resId = resId;
        this.cliente = cliente;
        this.estudio = estudio;
        this.resData = resData;
        this.resHoraInicio = resHoraInicio;
        this.resHoraFim = resHoraFim;
        this.resValor = resValor;
        this.resStatus = resStatus;
        this.resObservacoes = resObservacoes;
    }
}
