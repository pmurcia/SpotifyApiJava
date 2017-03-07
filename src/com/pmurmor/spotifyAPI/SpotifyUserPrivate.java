package com.pmurmor.spotifyAPI;

import com.pmurmor.spotifyAPI.resources.SpotifyExternalUrl;
import com.pmurmor.spotifyAPI.resources.SpotifyFollowers;
import com.pmurmor.spotifyAPI.resources.SpotifyImage;

public class SpotifyUserPrivate extends SpotifyUserPublic {
	private String birthdate;
	private String country;
	private String email;
	private String product;
	
	public SpotifyUserPrivate(String href, String id, String type, String uri, String displayName,
			SpotifyExternalUrl externalUrls, SpotifyFollowers followers, SpotifyImage[] images, String birthdate,
			String country, String email, String product) {
		super(href, id, type, uri, displayName, externalUrls, followers, images);
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
