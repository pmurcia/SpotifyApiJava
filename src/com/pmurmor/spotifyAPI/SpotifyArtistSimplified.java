package com.pmurmor.spotifyAPI;


public class SpotifyArtistSimplified {
	
	// Instance attributes
	private SpotifyExternalUrl externalURLs;	// Known external URLs for this artist
	private String href;						// A link to the Web API endpoint providing full details of the artist
	private String id;							// The Spotify ID
	private String name;						// The name of the artist
	private String type;						// The object type: "artist"
	private String uri;							// The Spotify URI
	
	public SpotifyArtistSimplified(SpotifyExternalUrl externalURLs, String href, String id, String name, String type,
			String uri) {
		this.externalURLs = externalURLs;
		this.href = href;
		this.id = id;
		this.name = name;
		this.type = type;
		this.uri = uri;
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