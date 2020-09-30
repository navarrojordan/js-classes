package br.ielusc.natacao.controller;

import br.ielusc.natacao.entity.Usuario;
import br.ielusc.natacao.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor

public class UsuarioController {
        private UsuarioRepository usuarioRepository;


//        @PostMapping
//        public Usuario create
//    }
