package com.catho.bibliothequeProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Utilisateur {
	@Id
	private Long id;
	private String prenom;
	private String nom;
	private String age;
	private String cin;
	private String email;
	private String tel;
	private String login;
	private String password;
	// nombre d'emprunt des livre 
	private int nbreEmpr;
	private String ageCategorie;
	@OneToMany
	@JoinColumn(name = "user_id")
	private Set<Book> emprentedBookList = new HashSet<>();
}
