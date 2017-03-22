package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyUserPublic extends SpotifyOwner {
	private String displayName;
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
		this.setFollowers(object);
		this.setImages(object);
	}

	private void setDisplayName(JSONObject object) {
		this.displayName = object.getString("display_name");
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

	public SpotifyFollowers getFollowers() {
		return followers;
	}

	public SpotifyImage[] getImages() {
		return images;
	}
}
