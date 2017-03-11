package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyAlbum extends SpotifyAlbumSimplified {
	private SpotifyCopyright copyrights[];
	private SpotifyExternalId externalIds;
	private String genres[];
	private String label;
	private int popularity;
	private String releaseDate;
	private String releaseDatePrecision;
	private SpotifyPaging tracks;

	/*public SpotifyAlbum(String href, String id, String type, String uri, String albumType,
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
	}*/
	
	public SpotifyAlbum(JSONObject object)
	{
		super(object);
		this.setCopyrights(object);
		this.setExternalIds(object);
		this.setGenres(object);
		this.setLabel(object);
		this.setPopularity(object);
		this.setReleaseDate(object);
		this.setReleaseDatePrecision(object);
		this.setTracks(object);
	}

	public void setCopyrights(JSONObject object) {
		this.copyrights = object
							.getJSONArray("copyrights")
							.toList()
							.stream()
							.toArray(SpotifyCopyright[]::new);
	}

	public void setExternalIds(JSONObject object) {
		this.externalIds = new SpotifyExternalId(object.getJSONObject("external_ids"));
	}

	public void setGenres(JSONObject object) {
		this.genres = object
						.getJSONArray("genres")
						.toList()
						.stream()
						.toArray(String[]::new);
	}

	public void setLabel(JSONObject object) {
		this.label = object.getString("label");
	}

	public void setPopularity(JSONObject object) {
		this.popularity = object.getInt("popularity");
	}

	public void setReleaseDate(JSONObject object) {
		this.releaseDate = object.getString("release_date");
	}

	public void setReleaseDatePrecision(JSONObject object) {
		this.releaseDatePrecision = object.getString("releaseDatePrecision");
	}

	public void setTracks(JSONObject object) {
		 this.tracks = new SpotifyPaging(object.getJSONObject("tracks"));
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

	public SpotifyPaging getTracks() {
		return tracks;
	}
}
