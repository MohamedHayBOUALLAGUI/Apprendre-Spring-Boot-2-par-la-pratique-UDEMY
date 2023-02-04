package com.bouallagui.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bouallagui.produits.entities.Produit;
import com.bouallagui.produits.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public Produit saveProduit(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public Produit updateProduit(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(Produit produit) {
		produitRepository.delete(produit);

	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
	} 

}
