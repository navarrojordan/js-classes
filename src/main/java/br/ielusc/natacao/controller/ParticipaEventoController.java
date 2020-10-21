package br.ielusc.natacao.controller;


import br.ielusc.natacao.entity.ParticipaEvento;
import br.ielusc.natacao.entity.Usuario;
import br.ielusc.natacao.repository.ParticipaEventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Participa")
@RequiredArgsConstructor
public class ParticipaEventoController {

    private ParticipaEventoRepository participaEventoRepository;


    @GetMapping
    public List<ParticipaEvento> findAll(){
        return participaEventoRepository.findAll();
    }

}

