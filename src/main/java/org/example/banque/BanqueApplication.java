package org.example.banque;

import jakarta.persistence.Id;
import org.example.banque.entities.TypeCompte;
import org.example.banque.entities.compte;
import org.example.banque.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BanqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository compteRepository){
		return args -> {
			compteRepository.save(new compte(null , 30 , new Date() , TypeCompte.Epargne));
			compteRepository.save(new compte(null , 70 , new Date() , TypeCompte.Courant));
			compteRepository.save(new compte(null , 58 , new Date() , TypeCompte.Epargne));
			compteRepository.save(new compte(null , 34 , new Date() , TypeCompte.Epargne));
			compteRepository.save(new compte(null , 300 , new Date() , TypeCompte.Epargne));
			compteRepository.findAll().forEach(c ->{
				System.out.println(c);

			});


		};
	}

}
