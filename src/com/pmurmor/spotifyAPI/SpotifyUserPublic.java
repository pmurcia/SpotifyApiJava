package com.pmurmor.spotifyAPI;

public class SpotifyUserPublic extends SpotifyObject {
	private String displayName;
	private SpotifyExternalUrl externalUrls;
	private SpotifyFollowers followers;
	private SpotifyImage images[];
	
	public SpotifyUserPublic(String href, String id, String type, String uri, String displayName,
			SpotifyExternalUrl externalUrls, SpotifyFollowers followers, SpotifyImage[] images) {
		super(href, id, type, uri);
		this.displayName = displayName;
		this.externalUrls = externalUrls;
		this.followers = followers;
		this.images = images;
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

	public SpotifyImage[] getImages() {
		return images;
	}
}
