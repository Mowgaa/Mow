package maepodstro.service;

import jakarta.validation.constraints.NotBlank;

public class SavebCard {
	
	private long id;
    @NotBlank(message = "Card ID is required")
	private int mm;
    @NotBlank(message = "Month required")
	private int yy;
    @NotBlank(message = "Year is required")
	private int cvv;
    @NotBlank(message = "CVV is required")
    
    public SavebCard(Long id, String code, int mm,int yy, int cvv) {
        this.id = id;
        this.mm = mm;
        this.yy = yy;
        this.cvv = cvv;
}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
}
