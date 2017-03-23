package com.pmurmor.spotifyAPI;

import org.json.*;

public abstract class SpotifyObject extends SpotifyItem {
	
	private String type;
	private String uri;
	
	public SpotifyObject(JSONObject object) {
		super(object);
		this.setType(object);
		this.setUri(object);
	}
	
	private void setType(JSONObject object)
	{
		this.type = object.getString("type");
	}
	
	private void setUri(JSONObject object)
	{
		this.uri = object.getString("uri");
	}

	public String getType() {
		return type;
	}

	public String getUri() {
		return uri;
	}
}
