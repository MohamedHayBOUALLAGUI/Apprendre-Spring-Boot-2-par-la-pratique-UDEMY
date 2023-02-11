package com.bouallagui.produits.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.bouallagui.produits.entities.Produit;

public interface ProduitService {
	Produit saveProduit(Produit produit);
	Produit updateProduit(Produit produit);
	void deleteProduit(Produit produit);
	void deleteProduitById(Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits();
	
	Page<Produit> getAllProduitsParPage(int page,int size);
	
}
