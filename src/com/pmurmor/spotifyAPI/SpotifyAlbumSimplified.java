package com.pmurmor.spotifyAPI;

public class SpotifyAlbumSimplified extends SpotifyObject {
	
	// Instance attributes
	private String albumType;						// The type of album: one of "album", "single" or "compilation"
	private SpotifyArtistSimplified artists[];		// The artists of the album
	private String availableMarkets[];				// The markets in which the album is available
	private SpotifyExternalUrl externalURLs;		// Known external URLs for this album
	private SpotifyImage images[];					// The cover art for the album in various sizes, widest first
	private String name;							// The name of the album

	public SpotifyAlbumSimplified(String href, String id, String type, String uri, String albumType,
			SpotifyArtistSimplified[] artists, String[] availableMarkets, SpotifyExternalUrl externalURLs,
			SpotifyImage[] images, String name) {
		super(href, id, type, uri);
		this.albumType = albumType;
		this.artists = artists;
		this.availableMarkets = availableMarkets;
		this.externalURLs = externalURLs;
		this.images = images;
		this.name = name;
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
