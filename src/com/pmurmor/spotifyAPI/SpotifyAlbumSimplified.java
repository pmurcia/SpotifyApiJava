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
		this.setAlbumType(albumType);
		this.setArtists(artists);
		this.setAvailableMarkets(availableMarkets);
		this.setExternalURLs(externalURLs);
		this.setHref(href);
		this.setId(id);
		this.setImages(images);
		this.setName(name);
		this.setType(type);
		this.setUri(uri);
	}

	public String getAlbumType() {
		return albumType;
	}
	
	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}
	
	public SpotifyArtistSimplified[] getArtists() {
		return artists;
	}
	
	public void setArtists(SpotifyArtistSimplified[] artists) {
		this.artists = artists;
	}
	
	public String[] getAvailableMarkets() {
		return availableMarkets;
	}
	
	public void setAvailableMarkets(String[] availableMarkets) {
		this.availableMarkets = availableMarkets;
	}
	
	public SpotifyExternalUrl getExternalURLs() {
		return externalURLs;
	}
	
	public void setExternalURLs(SpotifyExternalUrl externalURLs) {
		this.externalURLs = externalURLs;
	}
	
	public String getHref() {
		return href;
	}
	
	public void setHref(String href) {
		this.href = href;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public SpotifyImage[] getImages() {
		return images;
	}
	
	public void setImages(SpotifyImage[] images) {
		this.images = images;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri;
	}
}
