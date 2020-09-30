package br.ielusc.natacao.repository;

import br.ielusc.natacao.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

//JPA gerenciador de banco de dados

public interface EventoRepository extends JpaRepository<Evento,Long> {

}
