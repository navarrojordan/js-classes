package br.ielusc.natacao.controller;

import br.ielusc.natacao.entity.Evento;
import br.ielusc.natacao.repository.EventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/evento")
@RequiredArgsConstructor

public class EventoContoller {

    private EventoRepository eventoRepository;

    @GetMapping (value = "/{id}")
    public ResponseEntity get(@PathVariable Long id){
        Optional<Evento> evento = eventoRepository.findById(id);
        if (evento.isPresent()) {
            return new ResponseEntity(evento.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
//    Listar todos os cadastro do Evento
    @GetMapping
    public List<Evento> findAll(){
        return eventoRepository.findAll();

    }
// Criar Evento
    @PostMapping
    public Evento create(@RequestBody Evento evento) {
        return eventoRepository.save(evento);
    }

//   Alterar Evento
    @PutMapping(value = "/{id}")
    public ResponseEntity update (@PathVariable("id") long id, @RequestBody Evento evento){
            Optional<Evento> eventoRepositoryById = eventoRepository.findById(id);
            if (eventoRepositoryById.isPresent()) {
//                eventoRepositoryById.get()
                return new ResponseEntity(eventoRepositoryById.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity(HttpStatus.NOT_FOUND);
            }
        }


//    Deletar Evento
    @DeleteMapping(path = "/{id}")
    public ResponseEntity <?> delete (@PathVariable long id){
        return eventoRepository.findById(id)
                .map(record -> {
                    eventoRepository.deleteById(id);
                    return ResponseEntity.notFound().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}