package com.pmurmor.spotifyAPI;

public class SpotifyExternalId {
	private String keys[];
	private String values[];
	
	public SpotifyExternalId(String[] keys, String[] values) {
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
