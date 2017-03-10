package com.pmurmor.spotifyAPI;

public abstract class SpotifyObject {
	private String href;	// Reference to the API endpoint
	private String id;
	private String type;
	private String uri;
	
	public SpotifyObject(String href, String id, String type, String uri) {
		this.href = href;
		this.id = id;
		this.type = type;
		this.uri = uri;
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
