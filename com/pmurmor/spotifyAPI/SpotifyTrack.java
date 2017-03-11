package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyTrack extends SpotifyTrackSimplified {
	private SpotifyAlbumSimplified album;
	private SpotifyExternalId externalIds;
	private int popularity;

	/*public SpotifyTrack(String href, String id, String type, String uri, SpotifyArtistSimplified[] artists,
			String[] availableMarkets, int discNumber, int durationMs, boolean explicit,
			SpotifyExternalUrl externalUrls, boolean isPlayable, SpotifyTrackLink linkedFrom, String name,
			String previewUrl, int trackNumber, SpotifyAlbumSimplified album, SpotifyExternalId externalIds,
			int popularity) {
		super(href, id, type, uri, artists, availableMarkets, discNumber, durationMs, explicit, externalUrls,
				isPlayable, linkedFrom, name, previewUrl, trackNumber);
		this.album = album;
		this.externalIds = externalIds;
		this.popularity = popularity;
	}*/
	
	public SpotifyTrack(JSONObject object)
	{
		super(object);
		this.setAlbum(object);
		this.setExternalIds(object);
		this.setPopularity(object);
	}

	private void setAlbum(JSONObject object) {
		this.album = new SpotifyAlbumSimplified(object.getJSONObject("album"));
	}

	private void setExternalIds(JSONObject object) {
		this.externalIds = new SpotifyExternalId(object.getJSONObject("external_ids"));
	}

	private void setPopularity(JSONObject object) {
		this.popularity = object.getInt("popularity");
	}

	public SpotifyAlbumSimplified getAlbum() {
		return album;
	}

	public SpotifyExternalId getExternalIds() {
		return externalIds;
	}

	public int getPopularity() {
		return popularity;
	}
}
