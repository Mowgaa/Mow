package maepodstro.service;

import jakarta.validation.constraints.NotBlank;

public class SaveClient { 
	private String fullName;
    @NotBlank(message = "Full name is required")
	private String email;
    @NotBlank(message = "Email required")
	private int phoneNum;
    @NotBlank(message = "Phone number required")
	private String adress;
    @NotBlank(message = "Adress is required")
	private bCard bCard;
    
	public SaveClient(String fullName, String email, int phoneNum, String adress, bCard bCard) {
    this.fullName = fullName;
    this.email = email;
    this.phoneNum = phoneNum;
    this.adress = adress;
    this.bCard = bCard;
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

	public bCard getbCard() {
		return bCard;
	}

	public void setbCard(bCard bCard) {
		this.bCard = bCard;
	}
}






