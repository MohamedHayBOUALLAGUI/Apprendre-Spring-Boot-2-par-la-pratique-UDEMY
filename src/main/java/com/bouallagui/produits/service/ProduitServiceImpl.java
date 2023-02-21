package com.bouallagui.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.bouallagui.produits.entities.Categorie;
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

	@Override
	public Page<Produit> getAllProduitsParPage(int page, int size) {
		
		return produitRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Produit> findByLibelle(String libelle) {
		return produitRepository.findByLibelle(libelle);
	}

	@Override
	public List<Produit> findByLibelleContains(String nom) {
	
		return produitRepository.findByLibelleContains(nom);
	}

	@Override
	public List<Produit> findByLibellePrix(String nom, Double prix) {
		return produitRepository.findByLibellePrix(nom, prix);
	}

	@Override
	public List<Produit> findByCategorie(Categorie categorie) {	
		return produitRepository.findByCategorie(categorie);
	}

	@Override
	public List<Produit> findByCategorieIdCat(Long id) {	
		return produitRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Produit> findByOrderByLibelleAsc() {
		return produitRepository.findByOrderByLibelleAsc();
	}

	@Override
	public List<Produit> trierProduitsLibellesPrix() {
		return produitRepository.trierProduitsLibellesPrix();
	} 

}
