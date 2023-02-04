package com.bouallagui.produits.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bouallagui.produits.entities.Produit;
import com.bouallagui.produits.service.ProduitService;

@Controller
public class ProduitController {

	@Autowired
	private ProduitService produitService;
	
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createProduit";
	}
	
	@RequestMapping("/saveProduit")
	public String saveProduit(@ModelAttribute("produit") Produit produit, 
	 @RequestParam("date") String date,ModelMap modelMap) throws ParseException {
	//conversion de la date 
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateCreation = dateformat.parse(String.valueOf(date));
	 produit.setDateCreation(dateCreation);
	 
	Produit saveProduit = produitService.saveProduit(produit);
	String msg ="produit enregistré avec Id "+saveProduit.getId();
	modelMap.addAttribute("msg", msg);
	return "createProduit";
	}
	
	@RequestMapping("/ListeProduits")
	public String listeProduits(ModelMap modelMap){
		
		List<Produit> produits = produitService.getAllProduits();
		modelMap.addAttribute("produits", produits);
		return "listeProduits";
		
		
	}
	
	
	@RequestMapping("/supprimerProduit")
	public String supprimerProduit(@RequestParam("id") Long id){
		
		
		produitService.deleteProduitById(id);
//		List<Produit> produits = produitService.getAllProduits();
//		modelMap.addAttribute("produits", produits);
		return "redirect:/ListeProduits";
	}
	
	@RequestMapping("/modifierProduit")
	public String editerProduit(@RequestParam("id") Long id,ModelMap modelMap){
	Produit produit= produitService.getProduit(id);
	modelMap.addAttribute("produit", produit);
	return "editerProduit";
	}
	
	@RequestMapping("/updateProduit")
	public String updateProduit(@ModelAttribute("produit") Produit produit,
	@RequestParam("date") String date){
		//conversion de la date 
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Date dateCreation;
		try {
			dateCreation = dateformat.parse(String.valueOf(date));
			 produit.setDateCreation(dateCreation);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 produitService.updateProduit(produit);
//		 List<Produit> prods = produitService.getAllProduits();
//		 modelMap.addAttribute("produits", prods);
		return "redirect:/ListeProduits";
		}



	
	
	
}
