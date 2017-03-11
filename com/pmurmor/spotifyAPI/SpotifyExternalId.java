package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyExternalId {
	private String keys[];
	private String values[];
	
	/*public SpotifyExternalId(String[] keys, String[] values) {
		this.keys = keys;
		this.values = values;
	}*/
	
	public SpotifyExternalId(JSONObject object)
	{
		this.setKeys(object);
		this.setValues(object);
	}
	
	private void setKeys(JSONObject object)
	{
		
	}
	
	private void setValues(JSONObject object)
	{
		
	}
	
	public String[] getKeys() {
		return keys;
	}
	
	public String[] getValues() {
		return values;
	}
}
