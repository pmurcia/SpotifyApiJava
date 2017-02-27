package com.pmurmor.spotifyAPI.resources;

public class SpotifyUserPublic {
	private String displayName;
	private SpotifyExternalUrl externalUrls;
	private SpotifyFollowers followers;
	private String href;
	private String id;
	private SpotifyImage images[];
	private String type;
	private String uri;
	public SpotifyUserPublic(String displayName, SpotifyExternalUrl externalUrls, SpotifyFollowers followers,
			String href, String id, SpotifyImage[] images, String type, String uri) {
		this.setDisplayName(displayName);
		this.setExternalUrls(externalUrls);
		this.setFollowers(followers);
		this.setHref(href);
		this.setId(id);
		this.setImages(images);
		this.setType(type);
		this.setUri(uri);
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}
	public void setExternalUrls(SpotifyExternalUrl externalUrls) {
		this.externalUrls = externalUrls;
	}
	public SpotifyFollowers getFollowers() {
		return followers;
	}
	public void setFollowers(SpotifyFollowers followers) {
		this.followers = followers;
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
	public SpotifyImage[] getImages() {
		return images;
	}
	public void setImages(SpotifyImage[] images) {
		this.images = images;
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
