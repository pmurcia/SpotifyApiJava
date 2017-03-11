package com.pmurmor.spotifyAPI;

import org.json.JSONObject;

public class SpotifySavedTrack {
	private String addedAt;
	private SpotifyTrack track;
	
	/*public SpotifySavedTrack(String addedAt, SpotifyTrack track) {
		this.addedAt = addedAt;
		this.track = track;
	}*/
	
	public SpotifySavedTrack(JSONObject object)
	{
		this.setAddedAt(object);
		this.setAlbum(object);
	}

	private void setAddedAt(JSONObject object) {
		this.addedAt = object.getString("added_at");
	}

	private void setAlbum(JSONObject object) {
		this.track = new SpotifyTrack(object.getJSONObject("track"));
	}

	public String getAddedAt() {
		return addedAt;
	}

	public SpotifyTrack getTrack() {
		return track;
	}
}
