package com.pmurmor.spotifyAPI;

import java.util.HashMap;

import org.json.*;

public class SpotifyExternalUrl {
	
	// Instance attributes
	private HashMap<String,String> urls = new HashMap<String,String>();		// The type of URL
	
	// Constructor method
	/*public SpotifyExternalUrl(String[] keys, String[] values) {
		this.keys = keys;
		this.values = values;
	}*/
	
	public SpotifyExternalUrl(JSONObject object)
	{
		this.setUrls(object);
	}
	
	public HashMap<String, String> getIds() {
		return urls;
	}

	private void setUrls(JSONObject object) {
		String keys[] = JSONObject.getNames(object);
		for(int i = 0; i < keys.length; i++)
		{
			this.urls.put(keys[i], object.getString(keys[i]));
		}
	}
}
