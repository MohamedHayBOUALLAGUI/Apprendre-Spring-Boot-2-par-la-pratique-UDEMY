package com.bouallagui.produits.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bouallagui.produits.entities.Categorie;
import com.bouallagui.produits.entities.Produit;

@RepositoryRestResource(path = "rest")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	List<Produit> findByLibelle(String libelle);
	List<Produit> findByLibelleContains(String libelle);
//	@Query("select p from Produit p where p.libelle like %?1 and p.prix > ?2")
//	List<Produit> findByLibellePrix (String nom, Double prix);
	//On peut nommer les paramètres avec l’annotation @Param 
	
	@Query("select p from Produit p where p.libelle like :nom and p.prix>:price")
	List<Produit> findByLibellePrix(@Param("nom") String libelle, @Param("price") Double prix);
	
	@Query("select p from Produit p where p.categorie = ?1")
	List<Produit> findByCategorie (Categorie categorie);
	
	List<Produit> findByCategorieIdCat(Long id);
	List<Produit> findByOrderByLibelleAsc();
	
	@Query("select p from Produit p order by p.libelle ASC, p.prix DESC")
	List<Produit> trierProduitsLibellesPrix ();


}
