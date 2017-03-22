package com.pmurmor.spotifyAPI;

import org.json.JSONObject;

public class SpotifyOwner extends SpotifyObject {
	private SpotifyExternalUrl externalUrls;
	
	public SpotifyOwner(JSONObject object)
	{
		super(object);
		this.setExternalUrls(object);
	}
	
	private void setExternalUrls(JSONObject object) {
		this.externalUrls = new SpotifyExternalUrl(object.getJSONObject("external_urls"));
	}
	
	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}
}
