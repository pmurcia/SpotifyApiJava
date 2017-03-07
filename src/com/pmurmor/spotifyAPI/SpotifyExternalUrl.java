package com.pmurmor.spotifyAPI;

public class SpotifyExternalUrl {
	
	// Instance attributes
	private String keys[];		// The type of URL
	private String values[];		// An external, public URL to the object
	
	// Constructor method
	public SpotifyExternalUrl(String[] keys, String[] values) {
		this.keys = keys;
		this.values = values;
	}

	public String[] getKeys() {
		return keys;
	}

	public String[] getValues() {
		return values;
	}
}
