package com.pmurmor.spotifyAPI.resources;

public class SpotifyError {
	private int status;
	private String message;
	
	public SpotifyError(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}
	
	public String getMessage() {
		return message;
	}
}
