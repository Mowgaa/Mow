package com.maepodstro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="Client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String fullName;
	private String email;
	private int phoneNum;
	private String adress;
	private Long idBcard;
		
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String fullName, String email, int phoneNum, String adress, Long idBcard) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.adress = adress;
		this.idBcard = idBcard;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Long getidBcard() {
		return idBcard;
	}
	public void setbCard(Long idBcard) {
		this.idBcard = idBcard;
	}
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", fullName=" + fullName + ", email=" + email + ", phoneNum=" + phoneNum
				+ ", adress=" + adress + ", idBcard=" + idBcard + "]";
	}
	    
}
