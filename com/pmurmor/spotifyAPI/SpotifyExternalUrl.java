package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyExternalUrl {
	
	// Instance attributes
	private String keys[];		// The type of URL
	private String values[];		// An external, public URL to the object
	
	// Constructor method
	/*public SpotifyExternalUrl(String[] keys, String[] values) {
		this.keys = keys;
		this.values = values;
	}*/
	
	public SpotifyExternalUrl(JSONObject object)
	{
		this.setKeys(object);
		this.setValues(object);
	}
	
	private void setKeys(JSONObject object) {}
	
	private void setValues(JSONObject object) {}

	public String[] getKeys() {
		return keys;
	}

	public String[] getValues() {
		return values;
	}
}
