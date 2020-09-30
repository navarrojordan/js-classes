package br.ielusc.natacao.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String documento;
     @Column(nullable = false)
    private int idade;
    @Column(nullable = false)
    private String estado;
     @Column(nullable = false)
    private String cidade;
     @Column(nullable = false)
    private String bairro;
     @Column(nullable = false)
    private String numero;

    private String complemento;
     @Column(nullable = false)
    private String sexo;
     @Column(nullable = false)
    private String senha;
     @Column(nullable = false)
    private TipoUsuario tipoUsuario;
}

