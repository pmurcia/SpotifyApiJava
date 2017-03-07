package com.pmurmor.spotifyAPI;

public class SpotifyAlbum extends SpotifyAlbumSimplified {
	private SpotifyCopyright copyrights[];
	private SpotifyExternalId externalIds;
	private String genres[];
	private String label;
	private int popularity;
	private String releaseDate;
	private String releaseDatePrecision;
	private SpotifyTrackSimplified tracks[];

	public SpotifyAlbum(String href, String id, String type, String uri, String albumType,
			SpotifyArtistSimplified[] artists, String[] availableMarkets, SpotifyExternalUrl externalURLs,
			SpotifyImage[] images, String name, SpotifyCopyright[] copyrights, SpotifyExternalId externalIds,
			String[] genres, String label, int popularity, String releaseDate, String releaseDatePrecision,
			SpotifyTrackSimplified[] tracks) {
		super(href, id, type, uri, albumType, artists, availableMarkets, externalURLs, images, name);
		this.copyrights = copyrights;
		this.externalIds = externalIds;
		this.genres = genres;
		this.label = label;
		this.popularity = popularity;
		this.releaseDate = releaseDate;
		this.releaseDatePrecision = releaseDatePrecision;
		this.tracks = tracks;
	}

	public SpotifyCopyright[] getCopyrights() {
		return copyrights;
	}

	public SpotifyExternalId getExternalIds() {
		return externalIds;
	}

	public String[] getGenres() {
		return genres;
	}

	public String getLabel() {
		return label;
	}

	public int getPopularity() {
		return popularity;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getReleaseDatePrecision() {
		return releaseDatePrecision;
	}

	public SpotifyTrackSimplified[] getTracks() {
		return tracks;
	}
}
