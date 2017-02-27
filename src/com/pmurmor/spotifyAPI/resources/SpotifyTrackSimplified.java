package com.pmurmor.spotifyAPI.resources;

public class SpotifyTrackSimplified {
	private SpotifyArtistSimplified artists[];
	private String availableMarkets[];
	private int discNumber;
	private int durationMs;
	private boolean explicit;
	private SpotifyExternalUrl externalUrls;
	private String href;
	private String id;
	private boolean isPlayable;
	private SpotifyTrackLink linkedFrom;
	private String name;
	private String previewUrl;
	private int trackNumber;
	private String type;
	private String uri;
	
	
	
	public SpotifyTrackSimplified(SpotifyArtistSimplified[] artists, String[] availableMarkets, int discNumber,
			int durationMs, boolean explicit, SpotifyExternalUrl externalUrls, String href, String id,
			boolean isPlayable, SpotifyTrackLink linkedFrom, String name, String previewUrl, int trackNumber,
			String type, String uri) {
		this.setArtists(artists);
		this.setAvailableMarkets(availableMarkets);
		this.setDiscNumber(discNumber);
		this.setDurationMs(durationMs);
		this.setExplicit(explicit);
		this.setExternalUrls(externalUrls);
		this.setHref(href);
		this.setId(id);
		this.setPlayable(isPlayable);
		this.setLinkedFrom(linkedFrom);
		this.setName(name);
		this.setPreviewUrl(previewUrl);
		this.setTrackNumber(trackNumber);
		this.setType(type);
		this.setUri(uri);
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
	public int getDiscNumber() {
		return discNumber;
	}
	public void setDiscNumber(int discNumber) {
		this.discNumber = discNumber;
	}
	public int getDurationMs() {
		return durationMs;
	}
	public void setDurationMs(int durationMs) {
		this.durationMs = durationMs;
	}
	public boolean isExplicit() {
		return explicit;
	}
	public void setExplicit(boolean explicit) {
		this.explicit = explicit;
	}
	public SpotifyExternalUrl getExternalUrls() {
		return externalUrls;
	}
	public void setExternalUrls(SpotifyExternalUrl externalUrls) {
		this.externalUrls = externalUrls;
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
	public boolean isPlayable() {
		return isPlayable;
	}
	public void setPlayable(boolean isPlayable) {
		this.isPlayable = isPlayable;
	}
	public SpotifyTrackLink getLinkedFrom() {
		return linkedFrom;
	}
	public void setLinkedFrom(SpotifyTrackLink linkedFrom) {
		this.linkedFrom = linkedFrom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public int getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
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
