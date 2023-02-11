package com.bouallagui.produits.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bouallagui.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	List<Produit> findByLibelle(String libelle);
}
