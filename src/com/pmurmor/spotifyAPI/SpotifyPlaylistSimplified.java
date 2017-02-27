package com.pmurmor.spotifyAPI;

public class SpotifyPlaylistSimplified {
	private boolean collaborative;
	private SpotifyExternalUrl externalUrls;
	private String href;
	private String id;
	private SpotifyImage images[];
	private String name;
	private SpotifyUserPublic owner;
	private boolean isPublic;
	private String snapshotId;
	private SpotifyTrack tracks[];
	private String type;
	private String uri;
	
	public SpotifyPlaylistSimplified(boolean collaborative, SpotifyExternalUrl externalUrls, String href, String id,
			SpotifyImage[] images, String name, SpotifyUserPublic owner, boolean isPublic, String snapshotId,
			SpotifyTrack[] tracks, String type, String uri) {
		this.collaborative = collaborative;
		this.externalUrls = externalUrls;
		this.href = href;
		this.id = id;
		this.images = images;
		this.name = name;
		this.owner = owner;
		this.isPublic = isPublic;
		this.snapshotId = snapshotId;
		this.tracks = tracks;
		this.type = type;
		this.uri = uri;
	}

	public boolean isCollaborative() {
		return collaborative;
	}

	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}

	public String getHref() {
		return href;
	}

	public String getId() {
		return id;
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

	public String getType() {
		return type;
	}

	public String getUri() {
		return uri;
	}
}
