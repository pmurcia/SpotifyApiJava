package com.pmurmor.spotifyAPI;

import java.util.ArrayList;

import org.json.*;

public class SpotifyAlbum extends SpotifyAlbumSimplified {
	private SpotifyCopyright copyrights[];
	private SpotifyExternalId externalIds;
	private String genres[];
	private String label;
	private int popularity;
	private String releaseDate;
	private String releaseDatePrecision;
	private SpotifyPaging<SpotifyTrackSimplified> tracks;

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
		ArrayList<SpotifyCopyright> albumCopyrights = new ArrayList<SpotifyCopyright>();
		object
			.getJSONArray("copyrights")
			.forEach(copyright -> albumCopyrights.add(new SpotifyCopyright((JSONObject) copyright)));
		this.copyrights = albumCopyrights.toArray(new SpotifyCopyright[albumCopyrights.size()]);
	}

	public void setExternalIds(JSONObject object) {
		this.externalIds = new SpotifyExternalId(object.getJSONObject("external_ids"));
	}

	public void setGenres(JSONObject object) {
		try{
			this.genres = object
						.getJSONArray("genres")
						.toList()
						.stream()
						.toArray(String[]::new);
		} 
		catch(Exception e)
		{
			System.out.println("No genres available");
		}
	}

	public void setLabel(JSONObject object) {
		try{
			this.label = object.getString("label");
		} catch(Exception e)
		{
			System.out.println("No labels available");
		}
	}

	public void setPopularity(JSONObject object) {
		try {
			this.popularity = object.getInt("popularity");
		} catch (Exception e)
		{
			System.out.println("No popularity available");
		}
	}

	public void setReleaseDate(JSONObject object) {
		try {
			this.releaseDate = object.getString("release_date");
		} catch (Exception e) {
			System.out.println("No release date available.");
		}
	}

	public void setReleaseDatePrecision(JSONObject object) {
		try {
			this.releaseDatePrecision = object.getString("release_date_precision");
		} catch (Exception e)
		{
			System.out.println("No release date precision available");
		}
	}

	public void setTracks(JSONObject object) {
		this.tracks = new SpotifyPaging<SpotifyTrackSimplified>(object.getJSONObject("tracks"), SpotifyTrackSimplified.class);
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

	public SpotifyPaging<SpotifyTrackSimplified> getTracks() {
		return tracks;
	}
}
