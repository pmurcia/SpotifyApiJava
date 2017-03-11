package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifySavedAlbum {
	private String addedAt;
	private SpotifyAlbum album;
	
	/*public SpotifySavedAlbum(String addedAt, SpotifyAlbum album) {
		this.addedAt = addedAt;
		this.album = album;
	}*/
	
	public SpotifySavedAlbum(JSONObject object)
	{
		this.setAddedAt(object);
		this.setAlbum(object);
	}

	private void setAddedAt(JSONObject object) {
		this.addedAt = object.getString("added_at");
	}

	private void setAlbum(JSONObject object) {
		this.album = new SpotifyAlbum(object.getJSONObject("album"));
	}

	public String getAddedAt() {
		return addedAt;
	}

	public SpotifyAlbum getAlbum() {
		return album;
	}
}
