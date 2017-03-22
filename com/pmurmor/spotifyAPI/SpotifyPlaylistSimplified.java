package com.pmurmor.spotifyAPI;

import org.json.*;

import java.util.*;

public class SpotifyPlaylistSimplified extends SpotifyObject {
	private boolean collaborative;
	private SpotifyExternalUrl externalUrls;
	private SpotifyImage images[];
	private String name;
	private SpotifyOwner owner;
	private boolean isPublic;
	private String snapshotId;
	private Map<String,Object> tracks;
	
	/*public SpotifyPlaylistSimplified(String href, String id, String type, String uri, boolean collaborative,
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
	}*/
	
	public SpotifyPlaylistSimplified(JSONObject object)
	{
		super(object);
		this.setCollaborative(object);
		this.setExternalUrls(object);
		this.setImages(object);
		this.setName(object);
		this.setOwner(object);
		this.setPublic(object);
		this.setSnapshotId(object);
		this.setTracks(object);
	}

	private void setCollaborative(JSONObject object) {
		this.collaborative = object.getBoolean("collaborative");
	}

	private void setExternalUrls(JSONObject object) {
		this.externalUrls = new SpotifyExternalUrl(object.getJSONObject("external_urls"));
	}

	private void setImages(JSONObject object) {
		ArrayList<SpotifyImage> playlistImages = new ArrayList<SpotifyImage>();
		
		object
			.getJSONArray("images")
			.forEach(image -> playlistImages.add(new SpotifyImage((JSONObject) image)));
		
		this.images = playlistImages.toArray(new SpotifyImage[playlistImages.size()]);
	}

	private void setName(JSONObject object) {
		this.name = object.getString("name");
	}

	private void setOwner(JSONObject object) {
		this.owner = new SpotifyOwner(object.getJSONObject("owner"));
	}

	private void setPublic(JSONObject object) {
		try
		{
			this.isPublic = object.getBoolean("public");
		} catch(Exception e){}
	}

	private void setSnapshotId(JSONObject object) {
		this.snapshotId = object.getString("snapshot_id");
	}

	private void setTracks(JSONObject object) {
		this.tracks = object.getJSONObject("tracks").toMap();
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

	public SpotifyOwner getOwner() {
		return owner;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public String getSnapshotId() {
		return snapshotId;
	}

	public Map<String,Object> getTracks() {
		return tracks;
	}
}
