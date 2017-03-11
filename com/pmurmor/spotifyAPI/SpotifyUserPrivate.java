package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyUserPrivate extends SpotifyUserPublic {
	private String birthdate;
	private String country;
	private String email;
	private String product;
	
	/*public SpotifyUserPrivate(String href, String id, String type, String uri, String displayName,
			SpotifyExternalUrl externalUrls, SpotifyFollowers followers, SpotifyImage[] images, String birthdate,
			String country, String email, String product) {
		super(href, id, type, uri, displayName, externalUrls, followers, images);
		this.birthdate = birthdate;
		this.country = country;
		this.email = email;
		this.product = product;
	}*/
	
	public SpotifyUserPrivate(JSONObject object)
	{
		super(object);
		this.setBirthdate(object);
		this.setCountry(object);
		this.setEmail(object);
		this.setProduct(object);
	}

	private void setBirthdate(JSONObject object) {
		this.birthdate = object.getString("birthdate");
	}

	private void setCountry(JSONObject object) {
		this.country = object.getString("country");
	}

	private void setEmail(JSONObject object) {
		this.email = object.getString("email");
	}

	private void setProduct(JSONObject object) {
		this.product = object.getString("product");
	}

	public String getBirthdate() {
		return birthdate;
	}

	public String getCountry() {
		return country;
	}

	public String getEmail() {
		return email;
	}

	public String getProduct() {
		return product;
	}
}
