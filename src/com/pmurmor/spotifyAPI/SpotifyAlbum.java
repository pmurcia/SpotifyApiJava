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

	public SpotifyAlbum(String albumType, SpotifyArtistSimplified[] artists, String[] availableMarkets,
			SpotifyExternalUrl externalURLs, String href, String id, SpotifyImage[] images, String name, String type,
			String uri, SpotifyCopyright[] copyrights, SpotifyExternalId externalIds, String[] genres, String label,
			int popularity, String releaseDate, String releaseDatePrecision, SpotifyTrackSimplified[] tracks) {
		super(albumType, artists, availableMarkets, externalURLs, href, id, images, name, type, uri);
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
