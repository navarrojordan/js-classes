package br.ielusc.natacao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class Evento
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nomeEvento;
    @Column(nullable = false)
    private LocalDateTime data;
    @Column(nullable = false)
    private String localidade;
    @Column(nullable = false)
    private long quantidadeMaxima;


}
