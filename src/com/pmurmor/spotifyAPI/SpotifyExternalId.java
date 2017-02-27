package com.pmurmor.spotifyAPI;

public class SpotifyExternalId {
	private String keys[];
	private String values[];
	
	public SpotifyExternalId(String[] keys, String[] values) {
		this.setKeys(keys);
		this.setValues(values);
	}
	
	public String[] getKeys() {
		return keys;
	}
	public void setKeys(String[] keys) {
		this.keys = keys;
	}
	public String[] getValues() {
		return values;
	}
	public void setValues(String[] values) {
		this.values = values;
	}
	
	
}
