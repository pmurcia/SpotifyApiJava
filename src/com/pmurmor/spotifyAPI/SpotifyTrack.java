package com.pmurmor.spotifyAPI;

public class SpotifyTrack extends SpotifyTrackSimplified {
	private SpotifyAlbumSimplified album;
	private SpotifyExternalId externalIds;
	private int popularity;
	
	public SpotifyTrack(SpotifyArtistSimplified[] artists, String[] availableMarkets, int discNumber, int durationMs,
			boolean explicit, SpotifyExternalUrl externalUrls, String href, String id, boolean isPlayable,
			SpotifyTrackLink linkedFrom, String name, String previewUrl, int trackNumber, String type, String uri,
			SpotifyAlbumSimplified album, SpotifyExternalId externalIds, int popularity) {
		super(artists, availableMarkets, discNumber, durationMs, explicit, externalUrls, href, id, isPlayable,
				linkedFrom, name, previewUrl, trackNumber, type, uri);
		this.album = album;
		this.externalIds = externalIds;
		this.popularity = popularity;
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
