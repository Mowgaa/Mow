package com.maepodstro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Bcard")
public class Bcard{

	private long idBcard;
	private int mm;
	private int yy;
	private int cvv;
	public Bcard(long idBcard, int mm, int yy, int cvv) {
		super();
		this.idBcard = idBcard;
		this.mm = mm;
		this.yy = yy;
		this.cvv = cvv;
	}
	public long getIdBcard() {
		return idBcard;
	}
	public void setIdBcard(long id) {
		this.idBcard = id;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Bcard [idBcard=" + idBcard + ", mm=" + mm + ", yy=" + yy + ", cvv=" + cvv + "]";
	}
	
}
