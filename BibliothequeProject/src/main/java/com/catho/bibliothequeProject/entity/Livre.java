package com.catho.bibliothequeProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Livre {
	@Column(nullable = false)
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String titre;
	
	//International Standard Book Number
	@Column(nullable = false)
	private String isbn;
	
	@Column(nullable = false)
	private String categorie;
	
	/*//nombre d'exemplaires
	@Column(nullable = false)
	private int nbreExemp;*/
	
	@Column(nullable = true)
	@ManyToOne
	private Utilisateur utilisateur;
 

	
	
    
    
	

}
