package com.pmurmor.spotifyAPI;

public class SpotifySavedAlbum {
	private String addedAt;
	private SpotifyAlbum album;
	
	public SpotifySavedAlbum(String addedAt, SpotifyAlbum album) {
		this.addedAt = addedAt;
		this.album = album;
	}

	public String getAddedAt() {
		return addedAt;
	}

	public SpotifyAlbum getAlbum() {
		return album;
	}
}
