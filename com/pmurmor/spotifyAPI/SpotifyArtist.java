package com.pmurmor.spotifyAPI;

import java.util.ArrayList;

import org.json.*;

public class SpotifyArtist extends SpotifyArtistSimplified {
	private SpotifyFollowers followers;
	private String genres[];
	private SpotifyImage images[];
	private int popularity;
	
	/*public SpotifyArtist(String href, String id, String type, String uri, SpotifyExternalUrl externalURLs, String name,
			SpotifyFollowers followers, String[] genres, SpotifyImage[] images, int popularity) {
		super(href, id, type, uri, externalURLs, name);
		this.followers = followers;
		this.genres = genres;
		this.images = images;
		this.popularity = popularity;
	}*/
	
	public SpotifyArtist(JSONObject object)
	{
		super(object);
		this.setFollowers(object);
		this.setGenres(object);
		this.setImages(object);
		this.setPopularity(object);
	}

	private void setFollowers(JSONObject object) {
		this.followers = new SpotifyFollowers(object.getJSONObject("followers"));
	}

	private void setGenres(JSONObject object) {
		this.genres = object
						.getJSONArray("genres")
						.toList()
						.stream()
						.toArray(String[]::new);
	}

	private void setImages(JSONObject object) {
		ArrayList<SpotifyImage> artistImages = new ArrayList<SpotifyImage>();
		object
			.getJSONArray("images")
			.forEach(image -> artistImages.add(new SpotifyImage((JSONObject) image)));
		this.images = artistImages.toArray(new SpotifyImage[artistImages.size()]);
	}

	private void setPopularity(JSONObject object) {
		this.popularity = object.getInt("popularity");
	}

	public SpotifyFollowers getFollowers() {
		return followers;
	}

	public String[] getGenres() {
		return genres;
	}

	public SpotifyImage[] getImages() {
		return images;
	}

	public int getPopularity() {
		return popularity;
	}
}
