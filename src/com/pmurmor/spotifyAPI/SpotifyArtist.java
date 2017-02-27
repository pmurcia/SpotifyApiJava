package com.pmurmor.spotifyAPI;

public class SpotifyArtist extends SpotifyArtistSimplified {
	private SpotifyFollowers followers;
	private String genres[];
	private SpotifyImage images[];
	private int popularity;
	
	public SpotifyArtist(SpotifyExternalUrl externalURLs, String href, String id, String name, String type,
			String uri) {
		super(externalURLs, href, id, name, type, uri);
		this.setFollowers(followers);
		this.setGenres(genres);
		this.setImages(images);
		this.setPopularity(popularity);
	}

	public SpotifyFollowers getFollowers() {
		return followers;
	}
	
	public void setFollowers(SpotifyFollowers followers) {
		this.followers = followers;
	}
	
	public String[] getGenres() {
		return genres;
	}
	
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	
	public SpotifyImage[] getImages() {
		return images;
	}
	
	public void setImages(SpotifyImage[] images) {
		this.images = images;
	}
	
	public int getPopularity() {
		return popularity;
	}
	
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
}
