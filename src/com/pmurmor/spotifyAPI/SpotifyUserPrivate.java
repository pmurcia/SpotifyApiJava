package com.pmurmor.spotifyAPI;

public class SpotifyUserPrivate extends SpotifyUserPublic {
	private String birthdate;
	private String country;
	private String email;
	private String product;
	
	public SpotifyUserPrivate(String displayName, SpotifyExternalUrl externalUrls, SpotifyFollowers followers,
			String href, String id, SpotifyImage[] images, String type, String uri, String birthdate, String country,
			String email, String product) {
		super(displayName, externalUrls, followers, href, id, images, type, uri);
		this.birthdate = birthdate;
		this.country = country;
		this.email = email;
		this.product = product;
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
