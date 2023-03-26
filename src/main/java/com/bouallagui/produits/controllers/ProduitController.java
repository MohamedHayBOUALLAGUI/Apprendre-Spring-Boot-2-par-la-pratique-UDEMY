package com.bouallagui.produits.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
	public String showCreate(ModelMap modelMap) {
		modelMap.addAttribute("produit", new Produit());
		modelMap.addAttribute("mode", "newProduct");
		return "formProduit";
	}

//	@RequestMapping("/saveProduit")
//	public String saveProduit(@ModelAttribute("produit") Produit produit, @RequestParam("date") String date,
//			ModelMap modelMap) throws ParseException {
//		// conversion de la date
//		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
//		Date dateCreation = dateformat.parse(String.valueOf(date));
//		produit.setDateCreation(dateCreation);
//
//		Produit saveProduit = produitService.saveProduit(produit);
//		String msg = "produit enregistré avec Id " + saveProduit.getId();
//		modelMap.addAttribute("msg", msg);
//		return "createProduit";
//	}
	
	@RequestMapping("/saveProduit")
	public String saveProduit(@Valid Produit produit, BindingResult bindingResul) 
	{
		if(bindingResul.hasErrors()) {
			return "formProduit";
		}
		produitService.saveProduit(produit);
		return "redirect:/ListeProduits";
	}


//	@RequestMapping("/ListeProduits")
//	public String listeProduits(ModelMap modelMap){
//		
//		List<Produit> produits = produitService.getAllProduits();
//		modelMap.addAttribute("produits", produits);
//		return "listeProduits";
//		
//		
//	}

	// liste des produits avec pagination
	@RequestMapping("/ListeProduits")
	public String listeProduits(ModelMap modelMap, @RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "2") int size) {
		Page<Produit> produits = produitService.getAllProduitsParPage(page, size);
		modelMap.addAttribute("produits", produits);
		// tableau d'entiers de taille nombre total de pages
		modelMap.addAttribute("pages", new int[produits.getTotalPages()]);
		modelMap.addAttribute("currentPage", page);
		return "listeProduits";
	}

	@RequestMapping("/supprimerProduit")
	public String supprimerProduit(ModelMap modelMap, @RequestParam("id") Long id,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "2") int size) {

		produitService.deleteProduitById(id);
//		List<Produit> produits = produitService.getAllProduits();
//		modelMap.addAttribute("produits", produits);
//		Page<Produit> produits = produitService.getAllProduitsParPage(page,size);
//		modelMap.addAttribute("produits", produits);
//		modelMap.addAttribute("pages", new int[produits.getTotalPages()]);
//		modelMap.addAttribute("currentPage", page);
//		modelMap.addAttribute("size", size);
		return "redirect:/ListeProduits";
	}

	@RequestMapping("/modifierProduit")
	public String editerProduit(@RequestParam("id") Long id, ModelMap modelMap) {
		Produit produit = produitService.getProduit(id);
		modelMap.addAttribute("produit", produit);
		modelMap.addAttribute("mode", "editProduct");
		//return "editerProduit";
		return "formProduit";
	}

	@RequestMapping("/updateProduit")
	public String updateProduit(@ModelAttribute("produit") Produit produit, @RequestParam("date") String date) {
		// conversion de la date
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
