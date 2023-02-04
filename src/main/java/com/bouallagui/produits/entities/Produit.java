package com.bouallagui.produits.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String libelle;
	
	private Double prix;
	
	
	private Date dateCreation;


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", dateCreation=" + dateCreation + "]";
	}


	public Produit(String libelle, Double prix, Date dateCreation) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.dateCreation = dateCreation;
	}


	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public Double getPrix() {
		return prix;
	}


	public void setPrix(Double prix) {
		this.prix = prix;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
