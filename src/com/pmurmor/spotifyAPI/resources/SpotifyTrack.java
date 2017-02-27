package com.pmurmor.spotifyAPI.resources;

public class SpotifyTrack extends SpotifyTrackSimplified {
	private SpotifyAlbumSimplified album;
	private SpotifyExternalId externalIds;
	private int popularity;
	
	public SpotifyTrack(SpotifyArtistSimplified[] artists, String[] availableMarkets, int discNumber, int durationMs,
			boolean explicit, SpotifyExternalUrl externalUrls, String href, String id, boolean isPlayable,
			SpotifyTrackLink linkedFrom, String name, String previewUrl, int trackNumber, String type, String uri) {
		super(artists, availableMarkets, discNumber, durationMs, explicit, externalUrls, href, id, isPlayable, linkedFrom, name,
				previewUrl, trackNumber, type, uri);
		this.setAlbum(album);
		this.setExternalIds(externalIds);
		this.setPopularity(popularity);
	}
	public SpotifyAlbumSimplified getAlbum() {
		return album;
	}
	public void setAlbum(SpotifyAlbumSimplified album) {
		this.album = album;
	}
	public SpotifyExternalId getExternalIds() {
		return externalIds;
	}
	public void setExternalIds(SpotifyExternalId externalIds) {
		this.externalIds = externalIds;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	
	
}
