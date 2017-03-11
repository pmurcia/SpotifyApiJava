package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyPlaylistTrack {
	private String addedAt;
	private SpotifyUserPublic addedBy;
	private boolean isLocal;
	private SpotifyTrack track;
	
	/*public SpotifyPlaylistTrack(String timestamp, SpotifyUserPublic addedBy, boolean isLocal, SpotifyTrack track) {
		this.timestamp = timestamp;
		this.addedBy = addedBy;
		this.isLocal = isLocal;
		this.track = track;
	}*/
	
	public SpotifyPlaylistTrack(JSONObject object)
	{
		this.setAddedAt(object);
		this.setAddedBy(object);
		this.setLocal(object);
		this.setTrack(object);
	}

	private void setAddedAt(JSONObject object) {
		this.addedAt = object.getString("added_at");
	}

	private void setAddedBy(JSONObject object) {
		this.addedBy = new SpotifyUserPublic(object.getJSONObject("added_by"));
	}

	private void setLocal(JSONObject object) {
		this.isLocal = object.getBoolean("is_local");
	}

	private void setTrack(JSONObject object) {
		this.track = new SpotifyTrack(object.getJSONObject("track"));
	}

	public String getAddedAt() {
		return addedAt;
	}

	public SpotifyUserPublic getAddedBy() {
		return addedBy;
	}

	public boolean isLocal() {
		return isLocal;
	}

	public SpotifyTrack getTrack() {
		return track;
	}
}
