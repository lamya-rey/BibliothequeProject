package com.catho.bibliothequeProject.entity;

import javax.persistence.*;

import lombok.*;

import java.util.*;

@Entity
@Data
public class Utilisateur {

	@Column(nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private Collection<Book> books = new LinkedHashSet<Book>();
	public Utilisateur(String prenom, String nom, String age, String email, String userName, String password, int nbreEmpr, String ageCategorie) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.nbreEmpr = nbreEmpr;
		this.ageCategorie = ageCategorie;
	}

	public Utilisateur() {

	}
}
