package com.maepodstro.entities;

import java.util.Date;
import com.maepodstro.entities.Product;
 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Orders")
public class Orders{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	public Product product;
	private Date orderDate;
	private String deliveryDate;
	private int quantity;

	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(Product product, Date orderDate, String deliveryDate, int quantity) {
		super();
		this.product = product;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public product getProduct() {
		return product;
	}
	public void setProduct(product product) {
		this.product = product;
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
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", product=" + product + ", orderDate=" + orderDate + ", deliveryDate="
				+ deliveryDate + ", quantity=" + quantity + "]";
	}
		
}
