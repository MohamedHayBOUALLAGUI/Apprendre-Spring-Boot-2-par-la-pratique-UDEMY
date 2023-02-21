/*package com.bouallagui.produits.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


public class ProduitSansLombok {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String libelle;
	
	private Double prix;
	
	
	private Date dateCreation;
	
	
	@ManyToOne
	private Categorie categorie;


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", dateCreation=" + dateCreation + "]";
	}


	public ProduitSansLombok(String libelle, Double prix, Date dateCreation) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.dateCreation = dateCreation;
	}


	public ProduitSansLombok() {
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

}*/
