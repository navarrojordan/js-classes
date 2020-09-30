package br.ielusc.natacao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class ParticipaEvento {

    @Column(nullable = false)

    private int idusuario;
    private int idenvento;
}
