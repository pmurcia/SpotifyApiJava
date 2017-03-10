package com.pmurmor.spotifyAPI;

public class SpotifySavedTrack {
	private String addedAt;
	private SpotifyTrack track;
	
	public SpotifySavedTrack(String addedAt, SpotifyTrack track) {
		this.addedAt = addedAt;
		this.track = track;
	}

	public String getAddedAt() {
		return addedAt;
	}

	public SpotifyTrack getTrack() {
		return track;
	}
}
