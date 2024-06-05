package com.maepodstro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Products")
public class Product {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long idProduct;
	private String nomProduct;
	private String couleur;
	private Long prix;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String nomProduct, String couleur, Long prix) {
		super();
		this.nomProduct = nomProduct;
		this.couleur = couleur;
		this.prix = prix;
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getNomProduct() {
		return nomProduct;
	}
	public void setNomProduct(String nomProduct) {
		this.nomProduct = nomProduct;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Long getPrix() {
		return prix;
	}
	public void setPrix(Long prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nomProduct=" + nomProduct + ", couleur=" + couleur + ", prix="
				+ prix + "]";
	}	
	
}
