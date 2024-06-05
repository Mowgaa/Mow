package maepodstro.service;

public class SaveAdhesion {
	
	private String email;
	private boolean  newsletter;
	
	public SaveAdhesion (String email, boolean newsletter)
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
