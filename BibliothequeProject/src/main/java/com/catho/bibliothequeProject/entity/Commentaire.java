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
public class Commentaire {
	
	@Column(nullable = false)
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String message;
	
	@Column(nullable = true)
	private String titre;
	
	@Column(nullable = false)
	@ManyToOne
	private Livre livre;
	
	
	 

}
