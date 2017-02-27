package com.pmurmor.spotifyAPI;

public class SpotifyUserPrivate extends SpotifyUserPublic {
	private String birthdate;
	private String country;
	private String email;
	private String product;
	
	public SpotifyUserPrivate(String displayName, SpotifyExternalUrl externalUrls, SpotifyFollowers followers,
			String href, String id, SpotifyImage[] images, String type, String uri) {
		super(displayName, externalUrls, followers, href, id, images, type, uri);
		this.setBirthdate(birthdate);
		this.setCountry(country);
		this.setEmail(email);
		this.setProduct(product);
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}	
}
