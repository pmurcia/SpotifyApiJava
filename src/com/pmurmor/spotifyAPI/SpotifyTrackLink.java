package com.pmurmor.spotifyAPI;

public class SpotifyTrackLink {
	private SpotifyExternalUrl externalUrls;
	private String href;
	private String id;
	private String type;
	private String uri;
	
	public SpotifyTrackLink(SpotifyExternalUrl externalUrls, String href, String id, String type, String uri) {
		this.externalUrls = externalUrls;
		this.href = href;
		this.id = id;
		this.type = type;
		this.uri = uri;
	}

	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
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
