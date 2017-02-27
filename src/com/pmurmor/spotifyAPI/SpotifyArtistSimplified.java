package com.pmurmor.spotifyAPI;


public class SpotifyArtistSimplified {
	
	// Instance attributes
	private SpotifyExternalUrl externalURLs;	// Known external URLs for this artist
	private String href;						// A link to the Web API endpoint providing full details of the artist
	private String id;							// The Spotify ID
	private String name;						// The name of the artist
	private String type;						// The object type: "artist"
	private String uri;							// The Spotify URI
	
	// Constructor method
	public SpotifyArtistSimplified(SpotifyExternalUrl externalURLs, String href, String id, String name, String type, String uri)
	{
		this.setExternalURLs(externalURLs);
		this.setHref(href);
		this.setId(id);
		this.setName(name);
		this.setType(type);
		this.setUri(uri);
	}

	// Method that returns the external URLs of the artist
	public SpotifyExternalUrl getExternalURLs() {
		return externalURLs;
	}

	// Method that sets the external URLs of the artist
	public void setExternalURLs(SpotifyExternalUrl externalURLs) {
		this.externalURLs = externalURLs;
	}

	// Method that returns the link to more info of the artist
	public String getHref() {
		return href;
	}

	// Method that sets the link to more info of the artist
	public void setHref(String href) {
		this.href = href;
	}

	// Method that returns the Spotify ID of an artist
	public String getId() {
		return id;
	}

	// Method that sets the Spotify ID of an artist
	public void setId(String id) {
		this.id = id;
	}

	// Method that returns the name of an artist
	public String getName() {
		return name;
	}

	// Method that sets the name of an artist
	public void setName(String name) {
		this.name = name;
	}

	// Method that returns the type of object
	public String getType() {
		return type;
	}

	// Method that sets the type of object
	public void setType(String type) {
		this.type = type;
	}

	// Method that returns the Spotify URI
	public String getUri() {
		return uri;
	}

	// Method that sets the Spotify URI
	public void setUri(String uri) {
		this.uri = uri;
	}
}