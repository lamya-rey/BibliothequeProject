package com.catho.bibliothequeProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livre {
	@Id
	private Long id;
	private String titre;
	//International Standard Book Number
	private String isbn;
	//nombre d'exemplaires
	private int nbreExemp;
    @ManyToOne
	private Categorie categorie;
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
	public int getNbreExemp() {
		return nbreExemp;
	}
	public void setNbreExemp(int nbreExemp) {
		this.nbreExemp = nbreExemp;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Livre(Long id, String titre, String isbn, int nbreExemp, Categorie categorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.isbn = isbn;
		this.nbreExemp = nbreExemp;
		this.categorie = categorie;
	}
    
    
	

}
