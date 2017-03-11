package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyPlaylist extends SpotifyPlaylistSimplified {
	private String description;
	private SpotifyFollowers followers;

	/*public SpotifyPlaylist(String href, String id, String type, String uri, boolean collaborative,
			SpotifyExternalUrl externalUrls, SpotifyImage[] images, String name, SpotifyUserPublic owner,
			boolean isPublic, String snapshotId, SpotifyTrack[] tracks, String description,
			SpotifyFollowers followers) {
		super(href, id, type, uri, collaborative, externalUrls, images, name, owner, isPublic, snapshotId, tracks);
		this.description = description;
		this.followers = followers;
	}*/
	
	public SpotifyPlaylist(JSONObject object)
	{
		super(object);
		this.setDescription(object);
		this.setFollowers(object);
	}
	
	private void setDescription(JSONObject object)
	{
		this.description = object.getString("description");
	}
	
	private void setFollowers(JSONObject object)
	{
		this.followers = new SpotifyFollowers(object.getJSONObject("followers"));
	}

	public String getDescription() {
		return description;
	}

	public SpotifyFollowers getFollowers() {
		return followers;
	}
}
