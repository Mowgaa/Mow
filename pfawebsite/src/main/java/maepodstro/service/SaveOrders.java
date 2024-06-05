package maepodstro.service;

public class SaveOrders {
	private int orderId;
	public String nomProduct;
	private String Couleur;
	private int prix;
	private String productKey;
	private String deliveryDate;
	private int quantity;
	
	public SaveOrders(int orderId, String nomProduct, String couleur, int prix, String productKey, String deliveryDate,
			int quantity) {
		super();
		this.orderId = orderId;
		this.nomProduct = nomProduct;
		Couleur = couleur;
		this.prix = prix;
		this.productKey = productKey;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}