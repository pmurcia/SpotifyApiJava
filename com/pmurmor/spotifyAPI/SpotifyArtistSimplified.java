package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyArtistSimplified extends SpotifyObject {
	
	// Instance attributes
	private SpotifyExternalUrl externalUrls;	// Known external URLs for this artist
	private String name;						// The name of the artist
	
	/*public SpotifyArtistSimplified(String href, String id, String type, String uri, SpotifyExternalUrl externalURLs,
			String name) {
		super(href, id, type, uri);
		this.externalURLs = externalURLs;
		this.name = name;
	}*/
	
	public SpotifyArtistSimplified(JSONObject object)
	{
		//this.externalURLs = object.getString("external_urls");
		super(object);
		this.setExternalUrls(object);
		this.setName(object);
	}

	private void setExternalUrls(JSONObject object) {
		this.externalUrls = new SpotifyExternalUrl(object.getJSONObject("external_urls"));
	}

	private void setName(JSONObject object) {
		this.name = object.getString("name");
	}

	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}

	public String getName() {
		return name;
	}
}