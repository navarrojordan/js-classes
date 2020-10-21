package br.ielusc.natacao.controller;

import br.ielusc.natacao.entity.Usuario;
import br.ielusc.natacao.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor

public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity get(@PathVariable Long id){
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            return new ResponseEntity(usuario.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    // Criar User
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //   Alterar Usuario
    @PutMapping(value = "/{id}")
    public ResponseEntity update (@PathVariable("id") long id, @RequestBody Usuario usuario){
        Optional<Usuario> usuarioRepositoryById = usuarioRepository.findById(id);
        if (usuarioRepositoryById.isPresent()) {
            Usuario userUpdate = usuarioRepositoryById.get();
             userUpdate.setNome(usuario.getNome());
             userUpdate.setDocumento(usuario.getDocumento());
             userUpdate.setIdade(usuario.getIdade());
             userUpdate.setEstado(usuario.getEstado());
             userUpdate.setCidade(usuario.getCidade());
             userUpdate.setBairro(usuario.getBairro());
             userUpdate.setNumero(usuario.getNumero());
             userUpdate.setComplemento(usuario.getComplemento());
             userUpdate.setSexo(usuario.getSexo());
             userUpdate.setSenha(usuario.getSenha());
             userUpdate.setTipoUsuario(usuario.getTipoUsuario());

             usuarioRepository.save(userUpdate);
            return new ResponseEntity(usuarioRepositoryById.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    //    Deletar Usuario
    @DeleteMapping(path = "/{id}")
    public ResponseEntity <?> delete (@PathVariable long id){
        return usuarioRepository.findById(id)
                .map(record -> {
                    usuarioRepository.deleteById(id);
                    return ResponseEntity.notFound().build();
                }).orElse(ResponseEntity.notFound().build());
    }

   }
