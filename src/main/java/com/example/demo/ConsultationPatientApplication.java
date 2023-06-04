package com.example.demo;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Entities.Patient;
import com.example.demo.Entities.RendezVous;
import com.example.demo.Repository.PatienRepository;
import com.example.demo.Repository.RendezVousRepository;

@SpringBootApplication
public class ConsultationPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultationPatientApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(PatienRepository patienRepository,RendezVousRepository rendezVousRepository) {
		return args->{
			Stream.of("A","B","C").forEach(cn->{
				patienRepository.save(new Patient(null, cn, "emaol"+cn + ".com"));
			});
			RendezVous rendezVous = new RendezVous();
			rendezVous.setId(null);
			Optional<Patient> p = patienRepository.findById(1l);
			Patient p1 = p.get();
			rendezVous.setPatient(p1);
			rendezVousRepository.save(rendezVous);
		};
	}

}
