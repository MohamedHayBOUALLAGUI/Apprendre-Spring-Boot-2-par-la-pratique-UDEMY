package com.bouallagui.produits;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.Date;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.bouallagui.produits.entities.Produit;

//import com.bouallagui.produits.entities.Produit;
//import com.bouallagui.produits.service.ProduitService;

@SpringBootApplication
//public class ProduitsApplication implements CommandLineRunner{
public class ProduitsApplication implements CommandLineRunner{
	//@Autowired
//	private ProduitService produitService;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration; 
	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
		
	}
	
	//implementer l'interface CommandLineRunner: la méthode run va s'executer à chaque démarrage de l'application
	//donc 3 produits vont être ajouter!
//	@Override
//	public void run(String... args) throws Exception {
//		produitService.saveProduit(new Produit("PC Dell", 2600.0, new Date()));
//		produitService.saveProduit(new Produit("PC Asus", 2800.0, new Date()));
//		produitService.saveProduit(new Produit("Imprimante Epson", 900.0, new Date()));
//		
//	}

}
