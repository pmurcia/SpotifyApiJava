package com.pmurmor.spotifyAPI.resources;

import com.pmurmor.spotifyAPI.SpotifyTrack;
import com.pmurmor.spotifyAPI.SpotifyUserPublic;

public class SpotifyPlaylistTrack {
	private String timestamp;
	private SpotifyUserPublic addedBy;
	private boolean isLocal;
	private SpotifyTrack track;
	
	public SpotifyPlaylistTrack(String timestamp, SpotifyUserPublic addedBy, boolean isLocal, SpotifyTrack track) {
		this.timestamp = timestamp;
		this.addedBy = addedBy;
		this.isLocal = isLocal;
		this.track = track;
	}

	public String getTimestamp() {
		return timestamp;
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
