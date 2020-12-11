package com.catho.bibliothequeProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Livre {
	@Id
	private Long id;
	private String titre;
	//International Standard Book Number
	private String isbn;
	private String categorie;
	//nombre d'exemplaires
	private int nbreExemp;
 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getNbreExemp() {
		return nbreExemp;
	}
	public void setNbreExemp(int nbreExemp) {
		this.nbreExemp = nbreExemp;
	}
	public Livre(Long id, String titre, String isbn, String categorie, int nbreExemp) {
		super();
		this.id = id;
		this.titre = titre;
		this.isbn = isbn;
		this.categorie = categorie;
		this.nbreExemp = nbreExemp;
	}
	
	
	
    
    
	

}
