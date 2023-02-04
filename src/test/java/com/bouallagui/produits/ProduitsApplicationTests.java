package com.bouallagui.produits;

//import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bouallagui.produits.entities.Produit;
import com.bouallagui.produits.repository.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	//Injection de dependances Ioc
	@Autowired
	private ProduitRepository produitRepository;
	
//	@Test
//	public void testCreateProduit() {
//	Produit produit = new Produit("PC Dell",2200.500,new Date());
//	produitRepository.save(produit);
//	}
	
	@Test
	public void testFindProduit() {
		
		Produit produit= produitRepository.findById(2L).get();
		System.out.println(produit);
	}
	
//	@Test
//	public void testUpdateProduit() {
//		Produit produit = produitRepository.findById(1L).get();
//		produit.setPrix(3500.5);
//		
//		produitRepository.save(produit);
//	}
	
//	@Test
//	public void testDeleteProduit() {
//		Produit produit = produitRepository.findById(1L).get();
//		produitRepository.delete(produit);
//	}
	
	@Test
	public void testListAllProducts() {
		
		List<Produit> produits = produitRepository.findAll();
		
		produits.forEach(produit -> System.out.println(produit));
		
		
	}
}
