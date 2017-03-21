package com.pmurmor.spotifyAPI;

import java.util.ArrayList;

import org.json.*;

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
	
	/*public SpotifyTrackSimplified(String href, String id, String type, String uri, SpotifyArtistSimplified[] artists,
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
	}*/
	
	public SpotifyTrackSimplified(JSONObject object)
	{
		super(object);
		this.setArtists(object);
		this.setAvailableMarkets(object);
		this.setDiscNumber(object);
		this.setDurationMs(object);
		this.setExplicit(object);
		this.setExternalUrls(object);
		this.setLinkedFrom(object);
		this.setName(object);
		this.setPlayable(object);
		this.setPreviewUrl(object);
		this.setTrackNumber(object);
	}

	private void setArtists(JSONObject object) {
		ArrayList<SpotifyArtistSimplified> songArtists = new ArrayList<SpotifyArtistSimplified>();
		object
			.getJSONArray("artists")
			.forEach(artist -> songArtists.add(new SpotifyArtistSimplified((JSONObject) artist)));
		this.artists = songArtists.toArray(new SpotifyArtistSimplified[songArtists.size()]);
	}

	private void setAvailableMarkets(JSONObject object) {
		this.availableMarkets = object
									.getJSONArray("available_markets")
									.toList()
									.stream()
									.toArray(String[]::new);
	}

	private void setDiscNumber(JSONObject object) {
		this.discNumber = object.getInt("disc_number");
	}

	private void setDurationMs(JSONObject object) {
		this.durationMs = object.getInt("duration_ms");
	}

	private void setExplicit(JSONObject object) {
		this.explicit = object.getBoolean("explicit");
	}

	private void setExternalUrls(JSONObject object) {
		this.externalUrls = new SpotifyExternalUrl(object.getJSONObject("external_urls"));
	}

	private void setPlayable(JSONObject object) {
		try
		{
			this.isPlayable = object.getBoolean("is_playable");
		} catch(Exception e)
		{}
	}

	private void setLinkedFrom(JSONObject object) {
		try
		{
			this.linkedFrom = new SpotifyTrackLink(object.getJSONObject("linked_from"));
		} catch(Exception e)
		{}
	}

	private void setName(JSONObject object) {
		this.name = object.getString("name");
	}

	private void setPreviewUrl(JSONObject object) {
		try
		{
			this.previewUrl = object.getString("preview_url");
		} catch(Exception e)
		{}
	}

	private void setTrackNumber(JSONObject object) {
		this.trackNumber = object.getInt("track_number");
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
