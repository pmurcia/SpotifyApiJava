package com.pmurmor.spotifyAPI;

import org.json.JSONObject;

public abstract class SpotifyItem {
	private String href;	// Reference to the API endpoint
	private String id;
	
	public SpotifyItem(JSONObject object)
	{
		this.setHref(object);
		this.setId(object);
	}
	
	private void setHref(JSONObject object)
	{
		this.href = object.getString("href");
	}
	
	private void setId(JSONObject object)
	{
		this.id = object.getString("id");
	}
	
	public String getHref() {
		return href;
	}

	public String getId() {
		return id;
	}
}
