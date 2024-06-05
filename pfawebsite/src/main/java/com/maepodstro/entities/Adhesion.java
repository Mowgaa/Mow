package com.maepodstro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Adhesion")
public class Adhesion{
	
	private Long idAdhesion;
	private String email;
	private boolean  newsletter;
	
	public Adhesion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adhesion(String email, boolean newsletter) {
		super();
		this.email = email;
		this.newsletter = newsletter;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isNewsletter() {
		return newsletter;
	}
	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}
	public Long getIdAdhesion() {
		return idAdhesion;
	}
	public void setIdAdhesion(Long idAdhesion) {
		this.idAdhesion = idAdhesion;
	}
	@Override
	public String toString() {
		return "Adhesion [idAdhesion=" + idAdhesion + ", email=" + email + ", newsletter=" + newsletter + "]";
	}
	
}
