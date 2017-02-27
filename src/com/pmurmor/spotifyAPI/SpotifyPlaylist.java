package com.pmurmor.spotifyAPI;

public class SpotifyPlaylist extends SpotifyPlaylistSimplified {
	private String description;
	private SpotifyFollowers followers;

	public SpotifyPlaylist(boolean collaborative, SpotifyExternalUrl externalUrls, String href, String id,
			SpotifyImage[] images, String name, SpotifyUserPublic owner, boolean isPublic, String snapshotId,
			SpotifyTrack[] tracks, String type, String uri) {
		super(collaborative, externalUrls, href, id, images, name, owner, isPublic, snapshotId, tracks, type, uri);
		this.setDescription(description);
		this.setFollowers(followers);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SpotifyFollowers getFollowers() {
		return followers;
	}

	public void setFollowers(SpotifyFollowers followers) {
		this.followers = followers;
	}
	
}
