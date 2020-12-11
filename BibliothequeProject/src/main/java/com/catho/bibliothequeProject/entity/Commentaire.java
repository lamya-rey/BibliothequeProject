package com.catho.bibliothequeProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Commentaire {
	@Id
	private Long id;
	private String message;
	private String titre;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public Commentaire(Long id, String message, String titre) {
		super();
		this.id = id;
		this.message = message;
		this.titre = titre;
	}
	
	 

}
