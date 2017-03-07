package com.pmurmor.spotifyAPI;

import com.pmurmor.spotifyAPI.resources.SpotifyArtistSimplified;
import com.pmurmor.spotifyAPI.resources.SpotifyExternalUrl;
import com.pmurmor.spotifyAPI.resources.SpotifyFollowers;
import com.pmurmor.spotifyAPI.resources.SpotifyImage;

public class SpotifyArtist extends SpotifyArtistSimplified {
	private SpotifyFollowers followers;
	private String genres[];
	private SpotifyImage images[];
	private int popularity;
	
	public SpotifyArtist(String href, String id, String type, String uri, SpotifyExternalUrl externalURLs, String name,
			SpotifyFollowers followers, String[] genres, SpotifyImage[] images, int popularity) {
		super(href, id, type, uri, externalURLs, name);
		this.followers = followers;
		this.genres = genres;
		this.images = images;
		this.popularity = popularity;
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
