package com.pmurmor.spotifyAPI;


public class SpotifyArtistSimplified extends SpotifyObject {
	
	// Instance attributes
	private SpotifyExternalUrl externalURLs;	// Known external URLs for this artist
	private String name;						// The name of the artist
	
	public SpotifyArtistSimplified(String href, String id, String type, String uri, SpotifyExternalUrl externalURLs,
			String name) {
		super(href, id, type, uri);
		this.externalURLs = externalURLs;
		this.name = name;
	}

	public SpotifyExternalUrl getExternalURLs() {
		return externalURLs;
	}

	public String getName() {
		return name;
	}
}