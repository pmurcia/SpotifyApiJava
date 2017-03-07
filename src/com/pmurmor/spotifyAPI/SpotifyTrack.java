package com.pmurmor.spotifyAPI;

import com.pmurmor.spotifyAPI.resources.SpotifyArtistSimplified;
import com.pmurmor.spotifyAPI.resources.SpotifyExternalId;
import com.pmurmor.spotifyAPI.resources.SpotifyExternalUrl;
import com.pmurmor.spotifyAPI.resources.SpotifyTrackLink;

public class SpotifyTrack extends SpotifyTrackSimplified {
	private SpotifyAlbumSimplified album;
	private SpotifyExternalId externalIds;
	private int popularity;

	public SpotifyTrack(String href, String id, String type, String uri, SpotifyArtistSimplified[] artists,
			String[] availableMarkets, int discNumber, int durationMs, boolean explicit,
			SpotifyExternalUrl externalUrls, boolean isPlayable, SpotifyTrackLink linkedFrom, String name,
			String previewUrl, int trackNumber, SpotifyAlbumSimplified album, SpotifyExternalId externalIds,
			int popularity) {
		super(href, id, type, uri, artists, availableMarkets, discNumber, durationMs, explicit, externalUrls,
				isPlayable, linkedFrom, name, previewUrl, trackNumber);
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
