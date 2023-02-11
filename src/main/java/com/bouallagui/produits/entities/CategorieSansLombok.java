/*package com.bouallagui.produits.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CategorieSansLombok {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	
	private String libelleCat;
	
	
	private String descriptionCat;
	
	@OneToMany(mappedBy = "categorie")
	private List <Produit> produits;
	
	public CategorieSansLombok() {
		super();
	}


	public Long getIdCat() {
		return idCat;
	}


	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}


	public String getLibelleCat() {
		return libelleCat;
	}


	public void setLibelleCat(String libelleCat) {
		this.libelleCat = libelleCat;
	}


	public String getDescriptionCat() {
		return descriptionCat;
	}


	public void setDescriptionCat(String descriptionCat) {
		this.descriptionCat = descriptionCat;
	}

	


}*/
