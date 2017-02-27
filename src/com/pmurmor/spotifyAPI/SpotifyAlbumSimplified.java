package com.pmurmor.spotifyAPI;

public class SpotifyAlbumSimplified {
	
	// Instance attributes
	private String albumType;						// The type of album: one of "album", "single" or "compilation"
	private SpotifyArtistSimplified artists[];		// The artists of the album
	private String availableMarkets[];				// The markets in which the album is available
	private SpotifyExternalUrl externalURLs;		// Known external URLs for this album
	private String href;							// A link to the Web API endpoint providing full details of the album
	private String id;								// The Spotify ID
	private SpotifyImage images[];					// The cover art for the album in various sizes, widest first
	private String name;							// The name of the album
	private String type;							// The object type: "album"
	private String uri;								// The Spotify URI
	
	public SpotifyAlbumSimplified(String albumType, SpotifyArtistSimplified[] artists, String[] availableMarkets,
			SpotifyExternalUrl externalURLs, String href, String id, SpotifyImage[] images, String name, String type,
			String uri) {
		this.albumType = albumType;
		this.artists = artists;
		this.availableMarkets = availableMarkets;
		this.externalURLs = externalURLs;
		this.href = href;
		this.id = id;
		this.images = images;
		this.name = name;
		this.type = type;
		this.uri = uri;
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

	public String getHref() {
		return href;
	}

	public String getId() {
		return id;
	}

	public SpotifyImage[] getImages() {
		return images;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getUri() {
		return uri;
	}
}
