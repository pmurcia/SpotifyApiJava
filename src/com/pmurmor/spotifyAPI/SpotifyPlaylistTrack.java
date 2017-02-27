package com.pmurmor.spotifyAPI;

public class SpotifyPlaylistTrack {
	private String timestamp;
	private SpotifyUserPublic addedBy;
	private boolean isLocal;
	private SpotifyTrack track;
	
	public SpotifyPlaylistTrack(String timestamp, SpotifyUserPublic addedBy, boolean isLocal, SpotifyTrack track) {
		this.setTimestamp(timestamp);
		this.setAddedBy(addedBy);
		this.setLocal(isLocal);
		this.setTrack(track);
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public SpotifyUserPublic getAddedBy() {
		return addedBy;
	}
	
	public void setAddedBy(SpotifyUserPublic addedBy) {
		this.addedBy = addedBy;
	}
	
	public boolean isLocal() {
		return isLocal;
	}
	
	public void setLocal(boolean isLocal) {
		this.isLocal = isLocal;
	}
	
	public SpotifyTrack getTrack() {
		return track;
	}
	
	public void setTrack(SpotifyTrack track) {
		this.track = track;
	}
}
