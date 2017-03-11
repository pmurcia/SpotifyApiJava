package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyTrackLink extends SpotifyObject {
	private SpotifyExternalUrl externalUrls;
	
	/*public SpotifyTrackLink(SpotifyExternalUrl externalUrls, String href, String id, String type, String uri) {
		this.externalUrls = externalUrls;
		this.href = href;
		this.id = id;
		this.type = type;
		this.uri = uri;
	}*/
	
	public SpotifyTrackLink(JSONObject object)
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
