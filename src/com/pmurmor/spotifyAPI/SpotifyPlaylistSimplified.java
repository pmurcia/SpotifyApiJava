package com.pmurmor.spotifyAPI;

public class SpotifyPlaylistSimplified extends SpotifyObject {
	private boolean collaborative;
	private SpotifyExternalUrl externalUrls;
	private SpotifyImage images[];
	private String name;
	private SpotifyUserPublic owner;
	private boolean isPublic;
	private String snapshotId;
	private SpotifyTrack tracks[];
	
	public SpotifyPlaylistSimplified(String href, String id, String type, String uri, boolean collaborative,
			SpotifyExternalUrl externalUrls, SpotifyImage[] images, String name, SpotifyUserPublic owner,
			boolean isPublic, String snapshotId, SpotifyTrack[] tracks) {
		super(href, id, type, uri);
		this.collaborative = collaborative;
		this.externalUrls = externalUrls;
		this.images = images;
		this.name = name;
		this.owner = owner;
		this.isPublic = isPublic;
		this.snapshotId = snapshotId;
		this.tracks = tracks;
	}

	public boolean isCollaborative() {
		return collaborative;
	}

	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}

	public SpotifyImage[] getImages() {
		return images;
	}

	public String getName() {
		return name;
	}

	public SpotifyUserPublic getOwner() {
		return owner;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public String getSnapshotId() {
		return snapshotId;
	}

	public SpotifyTrack[] getTracks() {
		return tracks;
	}
}
