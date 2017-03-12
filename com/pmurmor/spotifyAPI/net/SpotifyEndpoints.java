package com.pmurmor.spotifyAPI.net;

public final class SpotifyEndpoints {
	// Base URLs
	private static final String API_URL = "https://api.spotify.com";
	private static final String VERSION = "/v1";
	public static final String BASE_URL = API_URL + VERSION;
	
	// Authentication URL
	public static final String AUTH_API_TOKEN = "https://accounts.spotify.com/api/token";

	// Search URLs
	public static final String GET_ALBUM = BASE_URL + "/albums/";
	public static final String GET_ALBUMS = BASE_URL + "/albums?ids=";
	public static final String GET_ALBUM_TRACKS = "/tracks";
	
	public static final String GET_ARTIST = BASE_URL + "/artists/";
	public static final String GET_ARTISTS = BASE_URL + "/artists?ids=";
	public static final String GET_ARTIST_ALBUMS = "/albums";
	public static final String GET_ARTIST_TOP_TRACKS = "/top-tracks";
	public static final String GET_ARTIST_RELATED_ARTISTS = "/related-artists";
	
	public static final String GET_AUDIO_ANALYSIS = BASE_URL + "/audio-analysis/";
	
	public static final String GET_AUDIO_FEATURES = BASE_URL + "/audio-features/";
	public static final String GET_AUDIOS_FEATURES = BASE_URL + "/audio-features?ids=";
	
	private static final String BROWSE = BASE_URL + "/browse";
	public static final String BROWSE_FEATURED_PLAYLISTS = BROWSE + "/featured-playlists";
	public static final String BROWSE_NEW_RELEASES = BROWSE + "/new-releases";
	public static final String BROWSE_CATEGORIES = BROWSE + "/categories";
	public static final String BROWSE_CATEGORY = BROWSE_CATEGORIES + "/";
	public static final String CATEGORY_PLAYLISTS = "/playlists";
	
	public static final String RECOMMENDATIONS = BASE_URL + "/recommendations";
	
	private static final String SEARCH = BASE_URL + "/search?type=";
	public static final String SEARCH_ALBUM = SEARCH + "album";
	public static final String SEARCH_ARTIST = SEARCH + "artist";
	public static final String SEARCH_PLAYLIST = SEARCH + "playlist";
	public static final String SEARCH_TRACK = SEARCH + "track";
	
	public static final String GET_TRACK = BASE_URL + "/tracks/";
	public static final String GET_TRACKS = BASE_URL + "/tracks?ids=";
}
