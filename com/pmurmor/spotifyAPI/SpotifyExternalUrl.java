package com.pmurmor.spotifyAPI;

import java.util.Map;

import org.json.*;

public class SpotifyExternalUrl {
	
	// Instance attributes
	private Map<String,String> urls;		// The type of URL
	
	// Constructor method
	/*public SpotifyExternalUrl(String[] keys, String[] values) {
		this.keys = keys;
		this.values = values;
	}*/
	
	public SpotifyExternalUrl(JSONObject object)
	{
		this.setUrls(object);
	}
	
	public Map<String, String> getIds() {
		return urls;
	}

	private void setUrls(JSONObject object) {
		String keys[] = JSONObject.getNames(object);
		for(int i = 0; i < object.length(); i++)
		{
			this.urls.put(keys[i], object.getString(keys[i]));
		}
	}
}
