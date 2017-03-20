package com.pmurmor.spotifyAPI;

import org.json.*;

import java.util.*;

public class SpotifyAlbumSimplified extends SpotifyObject {
	
	// Instance attributes
	private String albumType;						// The type of album: one of "album", "single" or "compilation"
	private SpotifyArtistSimplified artists[];		// The artists of the album
	private String availableMarkets[];				// The markets in which the album is available
	private SpotifyExternalUrl externalURLs;		// Known external URLs for this album
	private SpotifyImage images[];					// The cover art for the album in various sizes, widest first
	private String name;							// The name of the album

	/*public SpotifyAlbumSimplified(String href, String id, String type, String uri, String albumType,
			SpotifyArtistSimplified[] artists, String[] availableMarkets, SpotifyExternalUrl externalURLs,
			SpotifyImage[] images, String name) {
		super(href, id, type, uri);
		this.albumType = albumType;
		this.artists = artists;
		this.availableMarkets = availableMarkets;
		this.externalURLs = externalURLs;
		this.images = images;
		this.name = name;
	}*/
	
	public SpotifyAlbumSimplified(JSONObject object)
	{
		super(object);
		this.setAlbumType(object);
		this.setArtists(object);
		this.setAvailableMarkets(object);
		this.setExternalURLs(object);
		this.setImages(object);
		this.setName(object);
	}

	private void setAlbumType(JSONObject object) {
		try {
			this.albumType = object.getString("album_type");
		} catch (Exception e)
		{
			System.out.println("No Album Type available.");
		}
	}

	private void setArtists(JSONObject object) {
		ArrayList<SpotifyArtistSimplified> songArtists = new ArrayList<SpotifyArtistSimplified>();
		object
			.getJSONArray("artists")
			.forEach(artist -> songArtists.add(new SpotifyArtistSimplified((JSONObject) artist)));
		this.artists = songArtists.toArray(new SpotifyArtistSimplified[songArtists.size()]);
	}

	private void setAvailableMarkets(JSONObject object) {
		this.availableMarkets = object
									.getJSONArray("available_markets")
									.toList()
									.stream()
									.toArray(String[]::new);
	}

	private void setExternalURLs(JSONObject object) {
		this.externalURLs = new SpotifyExternalUrl(object.getJSONObject("external_urls"));
	}

	private void setImages(JSONObject object) {
		ArrayList<SpotifyImage> songImages = new ArrayList<SpotifyImage>();
		object
			.getJSONArray("images")
			.forEach(image -> songImages.add(new SpotifyImage((JSONObject) image)));
		this.images = songImages.toArray(new SpotifyImage[songImages.size()]);
	}

	private void setName(JSONObject object) {
		this.name = object.getString("name");
	}

	public String getAlbumType() {
		return albumType;
	}

	public SpotifyArtistSimplified[] getArtists() {
		return artists;
	}

	public String[] getAvailableMarkets() {
		return availableMarkets;
	}

	public SpotifyExternalUrl getExternalURLs() {
		return externalURLs;
	}

	public SpotifyImage[] getImages() {
		return images;
	}

	public String getName() {
		return name;
	}
}
