package com.catho.bibliothequeProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id
	private Long id;
	private String nom;
	private String age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	

}
