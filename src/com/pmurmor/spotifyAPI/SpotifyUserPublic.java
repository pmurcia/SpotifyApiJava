package com.pmurmor.spotifyAPI;

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
		this.displayName = displayName;
		this.externalUrls = externalUrls;
		this.followers = followers;
		this.href = href;
		this.id = id;
		this.images = images;
		this.type = type;
		this.uri = uri;
	}

	public String getDisplayName() {
		return displayName;
	}

	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}

	public SpotifyFollowers getFollowers() {
		return followers;
	}

	public String getHref() {
		return href;
	}

	public String getId() {
		return id;
	}

	public SpotifyImage[] getImages() {
		return images;
	}

	public String getType() {
		return type;
	}

	public String getUri() {
		return uri;
	}
}
