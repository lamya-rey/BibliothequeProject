package com.catho.bibliothequeProject;

import com.catho.bibliothequeProject.dao.UserRepository;
import com.catho.bibliothequeProject.entity.Book;
import com.catho.bibliothequeProject.entity.Utilisateur;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class BibliothequeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliothequeProjectApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(UserRepository userRepository) throws Exception {
		return (String[] args) -> {
			Book book = new Book();
			Utilisateur user1 = new Utilisateur("John","Claude","21", "john@domain.com","jeanclaude","123456789",2,"adulte");
			Utilisateur user2 = new Utilisateur("Julie","Jean","21", "julie@domain.com","julie","123456789",2,"enfant");
			userRepository.save(user1);
			userRepository.save(user2);
			userRepository.findAll().forEach(user -> System.out.println(user));
		};
	}
}
