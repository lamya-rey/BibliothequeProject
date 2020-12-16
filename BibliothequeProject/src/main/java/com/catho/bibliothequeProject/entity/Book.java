package com.catho.bibliothequeProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Book {
	@Id
	private Long id;
	private String titre;
	//International Standard Book Number
	private String isbn;
	private String categorie;
	//nombre d'exemplaires
	private int nbreExemp;
}
