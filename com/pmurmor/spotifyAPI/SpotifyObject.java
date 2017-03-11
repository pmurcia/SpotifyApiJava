package com.pmurmor.spotifyAPI;

import org.json.*;

public abstract class SpotifyObject {
	private String href;	// Reference to the API endpoint
	private String id;
	private String type;
	private String uri;
	
	public SpotifyObject(JSONObject object) {
		this.setHref(object);
		this.setId(object);
		this.setType(object);
		this.setUri(object);
	}

	private void setHref(JSONObject object)
	{
		this.href = object.getString("href");
	}
	
	private void setId(JSONObject object)
	{
		this.id = object.getString("id");
	}
	
	private void setType(JSONObject object)
	{
		this.type = object.getString("type");
	}
	
	private void setUri(JSONObject object)
	{
		this.uri = object.getString("uri");
	}
	
	public String getHref() {
		return href;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getUri() {
		return uri;
	}
}
