package com.pmurmor.spotifyAPI;

public class SpotifyTrackSimplified extends SpotifyObject {
	private SpotifyArtistSimplified artists[];
	private String availableMarkets[];
	private int discNumber;
	private int durationMs;
	private boolean explicit;
	private SpotifyExternalUrl externalUrls;
	private boolean isPlayable;
	private SpotifyTrackLink linkedFrom;
	private String name;
	private String previewUrl;
	private int trackNumber;
	
	public SpotifyTrackSimplified(String href, String id, String type, String uri, SpotifyArtistSimplified[] artists,
			String[] availableMarkets, int discNumber, int durationMs, boolean explicit,
			SpotifyExternalUrl externalUrls, boolean isPlayable, SpotifyTrackLink linkedFrom, String name,
			String previewUrl, int trackNumber) {
		super(href, id, type, uri);
		this.artists = artists;
		this.availableMarkets = availableMarkets;
		this.discNumber = discNumber;
		this.durationMs = durationMs;
		this.explicit = explicit;
		this.externalUrls = externalUrls;
		this.isPlayable = isPlayable;
		this.linkedFrom = linkedFrom;
		this.name = name;
		this.previewUrl = previewUrl;
		this.trackNumber = trackNumber;
	}

	public SpotifyArtistSimplified[] getArtists() {
		return artists;
	}

	public String[] getAvailableMarkets() {
		return availableMarkets;
	}

	public int getDiscNumber() {
		return discNumber;
	}

	public int getDurationMs() {
		return durationMs;
	}

	public boolean isExplicit() {
		return explicit;
	}

	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}

	public boolean isPlayable() {
		return isPlayable;
	}

	public SpotifyTrackLink getLinkedFrom() {
		return linkedFrom;
	}

	public String getName() {
		return name;
	}

	public String getPreviewUrl() {
		return previewUrl;
	}

	public int getTrackNumber() {
		return trackNumber;
	}
}
