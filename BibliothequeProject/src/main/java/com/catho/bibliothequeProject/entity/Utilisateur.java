package com.catho.bibliothequeProject.entity;

import javax.persistence.*;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Utilisateur {

	@Column(nullable = false)
	@Id
	private Long id;

	@Column(nullable = false)
	private String prenom;

	@Column(nullable = false)
	private String nom;

	@Column(nullable = false)
	private String age;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private String password;

	// nombre des livres empruntés
	@Column(nullable = false)
	private int nbreEmpr;
	private String ageCategorie;
	@OneToMany
	@Column(name = "user_id")
	private Set<Book> emprentedBookList = new HashSet<>();
}
