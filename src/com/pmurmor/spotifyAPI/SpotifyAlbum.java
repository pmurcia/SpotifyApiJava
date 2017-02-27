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
			String uri) {
		super(albumType, artists, availableMarkets, externalURLs, href, id, images, name, type, uri);
		this.setCopyrights(copyrights);
		this.setExternalIds(externalIds);
		this.setGenres(genres);
		this.setLabel(label);
		this.setPopularity(popularity);
		this.setReleaseDate(releaseDate);
		this.setReleaseDatePrecision(releaseDatePrecision);
		this.setTracks(tracks);
	}

	public SpotifyCopyright[] getCopyrights() {
		return copyrights;
	}
	
	public void setCopyrights(SpotifyCopyright[] copyrights) {
		this.copyrights = copyrights;
	}
	
	public SpotifyExternalId getExternalIds() {
		return externalIds;
	}
	
	public void setExternalIds(SpotifyExternalId externalIds) {
		this.externalIds = externalIds;
	}
	
	public String[] getGenres() {
		return genres;
	}
	
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public int getPopularity() {
		return popularity;
	}
	
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String getReleaseDatePrecision() {
		return releaseDatePrecision;
	}
	
	public void setReleaseDatePrecision(String releaseDatePrecision) {
		this.releaseDatePrecision = releaseDatePrecision;
	}
	
	public SpotifyTrackSimplified[] getTracks() {
		return tracks;
	}
	
	public void setTracks(SpotifyTrackSimplified[] tracks) {
		this.tracks = tracks;
	}
}
