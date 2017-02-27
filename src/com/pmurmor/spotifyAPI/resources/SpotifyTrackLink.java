package com.pmurmor.spotifyAPI.resources;

public class SpotifyTrackLink {
	private SpotifyExternalUrl externalUrls;
	private String href;
	private String id;
	private String type;
	private String uri;
	
	public SpotifyTrackLink(SpotifyExternalUrl externalUrls, String href, String id, String type, String uri) {
		this.setExternalUrls(externalUrls);
		this.setHref(href);
		this.setId(id);
		this.setType(type);
		this.setUri(uri);
	}
	
	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}
	
	public void setExternalUrls(SpotifyExternalUrl externalUrls) {
		this.externalUrls = externalUrls;
	}
	
	public String getHref() {
		return href;
	}
	
	public void setHref(String href) {
		this.href = href;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri;
	}
}
