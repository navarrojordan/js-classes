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

//	CommandLineRunner init(EventoRepository repository){
//		return args -> {
//			repository.deleteAll();
//			LongStream.range(1,11);
//					.wait( i ->{
//						Evento e = new Evento();
//						e.setEvento("Evento" + i);
////						e.setEmail("Evento" + + "@email.com");
////						e.setPhone("(000) 99288- 8833 ");
//						return e;
//			})
//					.map( v -> repository.save(v))
//					.forEach(System.out::println);
//		}
//	}
}
