package com.pmurmor.spotifyAPI;

public class SpotifyPlaylist extends SpotifyPlaylistSimplified {
	private String description;
	private SpotifyFollowers followers;
	
	public SpotifyPlaylist(boolean collaborative, SpotifyExternalUrl externalUrls, String href, String id,
			SpotifyImage[] images, String name, SpotifyUserPublic owner, boolean isPublic, String snapshotId,
			SpotifyTrack[] tracks, String type, String uri, String description, SpotifyFollowers followers) {
		super(collaborative, externalUrls, href, id, images, name, owner, isPublic, snapshotId, tracks, type, uri);
		this.description = description;
		this.followers = followers;
	}

	public String getDescription() {
		return description;
	}

	public SpotifyFollowers getFollowers() {
		return followers;
	}
}
