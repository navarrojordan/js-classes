package br.ielusc.natacao.controller;


import br.ielusc.natacao.repository.ParticipaEventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Participa")
@RequiredArgsConstructor
public class ParticipaEventoController {

    private ParticipaEventoRepository participaEventoRepository;

}

