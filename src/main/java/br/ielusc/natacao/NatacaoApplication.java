package br.ielusc.natacao;

import br.ielusc.natacao.entity.Evento;
import br.ielusc.natacao.repository.EventoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

@SpringBootApplication
public class NatacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NatacaoApplication.class, args);
	}


}
