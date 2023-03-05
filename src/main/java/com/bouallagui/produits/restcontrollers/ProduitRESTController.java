package com.bouallagui.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bouallagui.produits.entities.Produit;
import com.bouallagui.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
public class ProduitRESTController {
	@Autowired
	private ProduitService produitService;
	
	//Afficher tous les produits
	@RequestMapping(method=RequestMethod.GET)
	List<Produit> getAllProduits(){
		return produitService.getAllProduits();
	}
	
	//Récupérer un produit par son id
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Produit getProduitById(@PathVariable("id") Long id) {
		return produitService.getProduit(id);
	 }
	
	//Ajouter un produit
	@RequestMapping(method = RequestMethod.POST)
	public Produit createProduit(@RequestBody Produit produit) {
		return produitService.saveProduit(produit);
	}
	
	//Modifier un produit
	@RequestMapping(method = RequestMethod.PUT)
	public Produit updateProduit(@RequestBody Produit produit) {
		return produitService.updateProduit(produit);
	}
	
	//Supprimer un produit
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteProduit(@PathVariable("id") Long id) {
		produitService.deleteProduitById(id);
		return new ResponseEntity<>("Le produit a été supprimé avec succès",HttpStatus.OK);
	}
//	Web service REST permettant de retourner les produits ayant une catégorie donnée
	@RequestMapping(value="/productscat/{idCat}",method = RequestMethod.GET)
	public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
		return produitService.findByCategorieIdCat(idCat);
	}

	

	
	

	

}
