package com.pmurmor.spotifyAPI;

public class SpotifySavedTrack {
	private String addedAt;
	private SpotifyTrack track;
	public SpotifySavedTrack(String addedAt, SpotifyTrack track) {
		this.setAddedAt(addedAt);
		this.setTrack(track);
	}
	public String getAddedAt() {
		return addedAt;
	}
	public void setAddedAt(String addedAt) {
		this.addedAt = addedAt;
	}
	public SpotifyTrack getTrack() {
		return track;
	}
	public void setTrack(SpotifyTrack track) {
		this.track = track;
	}
	
	
}
