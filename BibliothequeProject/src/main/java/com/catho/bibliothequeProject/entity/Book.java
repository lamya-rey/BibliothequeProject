package com.catho.bibliothequeProject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String titre;
	//International Standard Book Number
	private String isbn;
	private String categorie;
	//nombre d'exemplaires
	private int nbreExemp;

	@ManyToOne
	@JoinColumn(name = "book_id", nullable = false)
	private Comment comment;


}
