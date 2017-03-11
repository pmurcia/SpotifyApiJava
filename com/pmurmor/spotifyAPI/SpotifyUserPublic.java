package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyUserPublic extends SpotifyObject {
	private String displayName;
	private SpotifyExternalUrl externalUrls;
	private SpotifyFollowers followers;
	private SpotifyImage images[];
	
	/*public SpotifyUserPublic(String href, String id, String type, String uri, String displayName,
			SpotifyExternalUrl externalUrls, SpotifyFollowers followers, SpotifyImage[] images) {
		super(href, id, type, uri);
		this.displayName = displayName;
		this.externalUrls = externalUrls;
		this.followers = followers;
		this.images = images;
	}*/
	
	public SpotifyUserPublic(JSONObject object)
	{
		super(object);
		this.setDisplayName(object);
		this.setExternalUrls(object);
		this.setFollowers(object);
		this.setImages(object);
	}

	private void setDisplayName(JSONObject object) {
		this.displayName = object.getString("display_name");
	}

	private void setExternalUrls(JSONObject object) {
		this.externalUrls = new SpotifyExternalUrl(object.getJSONObject("external_urls"));
	}

	private void setFollowers(JSONObject object) {
		this.followers = new SpotifyFollowers(object.getJSONObject("followers"));
	}

	private void setImages(JSONObject object) {
		this.images = object
						.getJSONArray("images")
						.toList()
						.stream()
						.toArray(SpotifyImage[]::new);
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
