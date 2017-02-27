package com.pmurmor.spotifyAPI.resources;

public class SpotifySavedAlbum {
	private String addedAt;
	private SpotifyAlbum album;
	public SpotifySavedAlbum(String addedAt, SpotifyAlbum album) {
		this.setAddedAt(addedAt);
		this.setAlbum(album);
	}
	public String getAddedAt() {
		return addedAt;
	}
	public void setAddedAt(String addedAt) {
		this.addedAt = addedAt;
	}
	public SpotifyAlbum getAlbum() {
		return album;
	}
	public void setAlbum(SpotifyAlbum album) {
		this.album = album;
	}
	
	
}
