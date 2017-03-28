package com.pmurmor.spotifyAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.ArrayList;

import org.json.*;

import com.pmurmor.spotifyAPI.net.*;

public class SpotifyAPI {
	// Class attributes and methods
	private static SpotifyToken apiToken;
	
	public SpotifyAPI(String clientId, String clientSecret) throws IOException
	{
		new SpotifyAuthClientCredentials(clientId, clientSecret);
		SpotifyAPI.setApiToken(SpotifyAuthClientCredentials.getClientToken());
	}
	
	public static SpotifyToken getAPIToken()
	{
		return apiToken;
	}
	
	private static void setApiToken(SpotifyToken apiToken)
	{
		SpotifyAPI.apiToken = apiToken;
	}
	
	// Search methods
	public static SpotifyAlbum getAlbum(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ALBUM + id);
		JSONObject response = SpotifyAPI.search(searchURL);
		
		return new SpotifyAlbum(response);
	}
	
	public static SpotifyAlbum[] getAlbums(String[] ids) throws IOException
	{
		String searchIds = SpotifyAPI.parseArrayToString(ids);
		URL searchURL = new URL(SpotifyEndpoints.GET_ALBUMS + searchIds.toString());
		JSONObject response = SpotifyAPI.search(searchURL);
		
		ArrayList<SpotifyAlbum> albums = new ArrayList<SpotifyAlbum>();
		
		response
			.getJSONArray("albums")
			.forEach(album -> albums.add(new SpotifyAlbum((JSONObject) album)));
		
		return albums.toArray(new SpotifyAlbum[albums.size()]);
	}
	
	public static SpotifyPaging<SpotifyTrackSimplified> getAlbumTracks(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ALBUM + id + SpotifyEndpoints.GET_ALBUM_TRACKS);
		JSONObject response = SpotifyAPI.search(searchURL);
		
		return new SpotifyPaging<SpotifyTrackSimplified>(response,SpotifyTrackSimplified.class);
	}
	
	public static SpotifyArtist getArtist(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ARTIST + id);
		JSONObject response = SpotifyAPI.search(searchURL);
		
		return new SpotifyArtist(response);
	}
	
	public static SpotifyArtist[] getArtists(String[] ids) throws IOException
	{
		String searchIds = SpotifyAPI.parseArrayToString(ids);
		URL searchURL = new URL(SpotifyEndpoints.GET_ARTISTS + searchIds.toString());
		JSONObject response = SpotifyAPI.search(searchURL);

		ArrayList<SpotifyArtist> artists = new ArrayList<SpotifyArtist>();
		
		response
			.getJSONArray("artists")
			.forEach(artist -> artists.add(new SpotifyArtist((JSONObject) artist)));
		
		return artists.toArray(new SpotifyArtist[artists.size()]);
	}
	
	public static SpotifyPaging<SpotifyAlbumSimplified> getArtistAlbums(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ARTIST + id + SpotifyEndpoints.GET_ARTIST_ALBUMS);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyPaging<SpotifyAlbumSimplified>(response,SpotifyAlbumSimplified.class);
	}
	
	public static SpotifyTrack[] getArtistTopTracks(String id,String country) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ARTIST + id + SpotifyEndpoints.GET_ARTIST_TOP_TRACKS + "?country=" + country);
		JSONObject response = SpotifyAPI.search(searchURL);

		ArrayList<SpotifyTrack> tracks = new ArrayList<SpotifyTrack>();
		
		response
			.getJSONArray("tracks")
			.forEach(track -> tracks.add(new SpotifyTrack((JSONObject) track)));
		
		return tracks.toArray(new SpotifyTrack[tracks.size()]);
	}
	
	public static SpotifyArtist[] getArtistRelatedArtists(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ARTIST + id + SpotifyEndpoints.GET_ARTIST_RELATED_ARTISTS);
		JSONObject response = SpotifyAPI.search(searchURL);

		ArrayList<SpotifyArtist> artists = new ArrayList<SpotifyArtist>();
		
		response
			.getJSONArray("artists")
			.forEach(artist -> artists.add(new SpotifyArtist((JSONObject) artist)));
		
		return artists.toArray(new SpotifyArtist[artists.size()]);
	}
	
	public static SpotifyAudioAnalysis getAudioAnalysis(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_AUDIO_ANALYSIS + id);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyAudioAnalysis(response);
	}
	
	public static SpotifyAudioFeatures getAudioFeatures(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_AUDIO_FEATURES + id);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyAudioFeatures(response);
	}
	
	public static SpotifyAudioFeatures[] getAudioFeatures(String[] ids) throws IOException
	{
		String searchIds = SpotifyAPI.parseArrayToString(ids);
		URL searchURL = new URL(SpotifyEndpoints.GET_AUDIOS_FEATURES + searchIds);
		JSONObject response = SpotifyAPI.search(searchURL);

		ArrayList<SpotifyAudioFeatures> audioFeatures = new ArrayList<SpotifyAudioFeatures>();
		
		response
			.getJSONArray("audio_features")
			.forEach(audioFeature -> audioFeatures.add(new SpotifyAudioFeatures((JSONObject) audioFeature)));
		
		return audioFeatures.toArray(new SpotifyAudioFeatures[audioFeatures.size()]);
	}
	
	public static SpotifyPaging<SpotifyPlaylistSimplified> browseFeaturedPlaylists() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_FEATURED_PLAYLISTS);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyPaging<SpotifyPlaylistSimplified>(response.getJSONObject("playlists"),SpotifyPlaylistSimplified.class);
	}

	public static SpotifyPaging<SpotifyAlbumSimplified> browseNewReleases() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_NEW_RELEASES);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyPaging<SpotifyAlbumSimplified>(response.getJSONObject("albums"),SpotifyAlbumSimplified.class);
	}
	
	public static SpotifyPaging<SpotifyCategory> browseCategories() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_CATEGORIES);
		JSONObject response = SpotifyAPI.search(searchURL);
		
		return new SpotifyPaging<SpotifyCategory>(response.getJSONObject("categories"),SpotifyCategory.class);
	}
	
	public static SpotifyCategory browseCategory(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_CATEGORY + id);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyCategory(response);
	}
	
	public static SpotifyPaging<SpotifyPlaylistSimplified> browseCategoryPlaylists(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_CATEGORY + id + SpotifyEndpoints.CATEGORY_PLAYLISTS);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyPaging<SpotifyPlaylistSimplified>(response.getJSONObject("playlists"),SpotifyPlaylistSimplified.class);
	}
	
	public static SpotifyRecommendations getRecommendations(String arguments) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.RECOMMENDATIONS + "?" + arguments);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyRecommendations(response);
	}
	
	public static SpotifyPaging<SpotifyAlbumSimplified> searchAlbums(String q) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.SEARCH_ALBUM + "&q=" + q);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyPaging<SpotifyAlbumSimplified>(response.getJSONObject("albums"),SpotifyAlbumSimplified.class);
	}
	
	public static SpotifyPaging<SpotifyArtistSimplified> searchArtists(String q) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.SEARCH_ARTIST + "&q=" + q);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyPaging<SpotifyArtistSimplified>(response.getJSONObject("artists"),SpotifyArtistSimplified.class);
	}
	
	public static SpotifyPaging<SpotifyPlaylistSimplified> searchPlaylists(String q) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.SEARCH_PLAYLIST + "&q=" + q);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyPaging<SpotifyPlaylistSimplified>(response.getJSONObject("playlists"),SpotifyPlaylistSimplified.class);
	}
	
	public static SpotifyPaging<SpotifyTrack> searchTracks(String q) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.SEARCH_TRACK + "&q=" + q);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyPaging<SpotifyTrack>(response.getJSONObject("tracks"),SpotifyTrack.class);
	}
	
	public static SpotifyTrack getTrack(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_TRACK + id);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyTrack(response);
	}
	
	public static SpotifyTrack[] getTracks(String[] ids) throws IOException
	{
		String searchIds = SpotifyAPI.parseArrayToString(ids);
		URL searchURL = new URL(SpotifyEndpoints.GET_TRACKS + searchIds);
		JSONObject response = SpotifyAPI.search(searchURL);

		ArrayList<SpotifyTrack> tracksSearch = new ArrayList<SpotifyTrack>();
		
		response
			.getJSONArray("tracks")
			.forEach(track -> tracksSearch.add(new SpotifyTrack((JSONObject) track)));
		
		return tracksSearch.toArray(new SpotifyTrack[tracksSearch.size()]);
	}
	
	private static JSONObject search(URL searchURL) throws IOException
	{
		// TODO Delete
		System.out.println(searchURL);
		HttpURLConnection connection = (HttpURLConnection) searchURL.openConnection();
		
		connection.setRequestMethod("GET");
		connection.setDoInput(true);
		connection.setRequestProperty("Authorization", apiToken.getToken());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        while(s != null)
        {
            sb.append(s + "\n");
            s = br.readLine();
        }
        
        // TODO Delete
		System.out.println(sb.toString());

        return new JSONObject(sb.toString());
	}
	
	private static String parseArrayToString(String[] array)
	{
		StringBuilder sb = new StringBuilder("");
		
		for(int i = 0; i < array.length; i++)
		{
			sb.append(array[i]);
			if(i == array.length - 1) break;
			else sb.append(",");
		}
		
		return sb.toString();
	}
	
}
