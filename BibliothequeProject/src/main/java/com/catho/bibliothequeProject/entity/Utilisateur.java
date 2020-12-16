package com.catho.bibliothequeProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
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
	

	
	
	
	
	
	

}
