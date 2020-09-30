package br.ielusc.natacao.repository;

import br.ielusc.natacao.entity.ParticipaEvento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ParticipaEventoRepository extends JpaRepository <ParticipaEvento, Long> {
}
