package com.bouallagui.produits.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nameProduct",types = {Produit.class})
public interface ProduitProjection {
	public String getLibelle();
}
