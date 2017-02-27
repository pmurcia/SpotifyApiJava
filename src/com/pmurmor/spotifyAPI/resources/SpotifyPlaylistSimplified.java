package com.pmurmor.spotifyAPI.resources;

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
		this.setCollaborative(collaborative);
		this.setExternalUrls(externalUrls);
		this.setHref(href);
		this.setId(id);
		this.setImages(images);
		this.setName(name);
		this.setOwner(owner);
		this.setPublic(isPublic);
		this.setSnapshotId(snapshotId);
		this.setTracks(tracks);
		this.setType(type);
		this.setUri(uri);
	}

	public boolean isCollaborative() {
		return collaborative;
	}

	public void setCollaborative(boolean collaborative) {
		this.collaborative = collaborative;
	}

	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}

	public void setExternalUrls(SpotifyExternalUrl externalUrls) {
		this.externalUrls = externalUrls;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SpotifyImage[] getImages() {
		return images;
	}

	public void setImages(SpotifyImage[] images) {
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SpotifyUserPublic getOwner() {
		return owner;
	}

	public void setOwner(SpotifyUserPublic owner) {
		this.owner = owner;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String getSnapshotId() {
		return snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}

	public SpotifyTrack[] getTracks() {
		return tracks;
	}

	public void setTracks(SpotifyTrack[] tracks) {
		this.tracks = tracks;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
}
