package com.bouallagui.produits.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bouallagui.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
