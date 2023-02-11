package com.bouallagui.produits;

import java.util.List;

//import java.util.Date;
//import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;

import com.bouallagui.produits.entities.Produit;
import com.bouallagui.produits.repository.ProduitRepository;
//import com.bouallagui.produits.service.ProduitService;

@SpringBootTest
class ProduitsApplicationTests {

	//Injection de dependances Ioc
	@Autowired
	private ProduitRepository produitRepository;
//	@Autowired
//	private ProduitService produitService;
//	
//	@Test
//	public void testCreateProduit() {
//	Produit produit = new Produit("PC Dell",2200.500,new Date());
//	produitRepository.save(produit);
//	}
	
//	@Test
//	public void testFindProduit() {
//		
//		Produit produit= produitRepository.findById(2L).get();
//		System.out.println(produit);
//	}
//	
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
	
//	@Test
//	public void testListAllProducts() {
//		
//		List<Produit> produits = produitRepository.findAll();
//		
//		produits.forEach(produit -> System.out.println(produit));
//	}
//	@Test
//	public void testListAllProducts() {
//		Page<Produit> produits = produitService.getAllProduitsParPage(0,2);
//		System.out.println("size="+produits.getSize());
//		System.out.println("nombre total d'elements="+produits.getTotalElements());
//		System.out.println("nombre total de pages="+produits.getTotalPages());
//		produits.getContent().forEach(produit -> {System.out.println(produit);
//		 });
//		/*ou bien
//		for (Produit produit : produits)
//		{
//		System.out.println(produit);
//		} */
//
//	}
	
	@Test
	public void testFindProduitByLibelle() {
		
		List<Produit> produits= produitRepository.findByLibelle("PC Deglawi");
		produits.forEach(produit ->{System.out.println(produit);});      
	}
}
