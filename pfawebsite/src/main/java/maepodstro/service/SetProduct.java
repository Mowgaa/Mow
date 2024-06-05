package maepodstro.service;

public class SetProduct {
	public String nomProduct;
	private String Couleur;
	private int prix;
	private String productKey;
	
	public SetProduct(String nomProduct, String Couleur, int prix,String productKey ) {
	this.nomProduct = nomProduct;
	this.Couleur = Couleur;
	this.prix = prix;
	this.productKey = productKey ;
	}

	public String getNomProduct() {
		return nomProduct;
	}

	public void setNomProduct(String nomProduct) {
		this.nomProduct = nomProduct;
	}

	public String getCouleur() {
		return Couleur;
	}

	public void setCouleur(String couleur) {
		Couleur = couleur;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getProductKey() {
		return productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	
	

}
