package com.pmurmor.spotifyAPI.resources;

public class SpotifyExternalUrl {
	
	// Instance attributes
	private String keys[];		// The type of URL
	private String values[];		// An external, public URL to the object
	
	// Constructor method
	public SpotifyExternalUrl(String[] keys, String[] values) {
		this.setKey(keys);
		this.setValue(values);
	}

	public String[] getKey() {
		return keys;
	}
	
	public void setKey(String[] keys) {
		this.keys = keys;
	}
	
	public String[] getValue() {
		return values;
	}
	
	public void setValue(String[] values) {
		this.values = values;
	}
}
