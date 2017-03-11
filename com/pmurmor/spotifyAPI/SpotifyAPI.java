package com.pmurmor.spotifyAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;

import org.json.*;

import com.pmurmor.spotifyAPI.net.*;

public class SpotifyAPI {
	// Class attributes and methods
	private static SpotifyToken apiToken;

	public static void main(String args[])
	{
		try{
			new SpotifyAPI("60c0e854a63b418f938dac56be914df5","8f03ae72344648cab8f1ed4a2c943d9e");
		} catch (Exception e)
		{
			System.out.println("Error");
		}
		System.out.println(SpotifyAPI.getAPIToken());
	}
	
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
	// TODO Have to change the info the request receives from the server
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
		
		return response
				.getJSONArray("albums")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyAlbum::new)
				.toArray(SpotifyAlbum[]::new);
			
	}
	
	public static SpotifyTrackSimplified[] getAlbumTracks(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ALBUM + id + SpotifyEndpoints.GET_ALBUM_TRACKS);
		JSONObject response = SpotifyAPI.search(searchURL);
		
		return response
				.getJSONArray("tracks")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyTrackSimplified::new)
				.toArray(SpotifyTrackSimplified[]::new);
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

		return response
				.getJSONArray("artists")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyArtist::new)
				.toArray(SpotifyArtist[]::new);
	}
	
	public static SpotifyAlbumSimplified[] getArtistAlbums(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ARTIST + id + SpotifyEndpoints.GET_ARTIST_ALBUMS);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("albums")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyAlbumSimplified::new)
				.toArray(SpotifyAlbumSimplified[]::new);	}
	
	public static SpotifyTrack[] getArtistTopTracks(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ARTIST + id + SpotifyEndpoints.GET_ARTIST_TOP_TRACKS);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("tracks")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyTrack::new)
				.toArray(SpotifyTrack[]::new);
	}
	
	public static SpotifyArtist[] getArtistRelatedArtists(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_ARTIST + id + SpotifyEndpoints.GET_ARTIST_RELATED_ARTISTS);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("artists")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyArtist::new)
				.toArray(SpotifyArtist[]::new);
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

		return response
				.getJSONArray("audio_features")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyAudioFeatures::new)
				.toArray(SpotifyAudioFeatures[]::new);
	}
	
	public static SpotifyPlaylist[] browseFeaturedPlaylists() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_FEATURED_PLAYLISTS);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("playlists")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyPlaylist::new)
				.toArray(SpotifyPlaylist[]::new);
	}

	public static SpotifyAlbumSimplified[] browseNewReleases() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_NEW_RELEASES);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("albums")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyAlbumSimplified::new)
				.toArray(SpotifyAlbumSimplified[]::new);
	}
	
	public static SpotifyCategory[] browseCategories() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_CATEGORIES);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("categories")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyCategory::new)
				.toArray(SpotifyCategory[]::new);
	}
	
	public static SpotifyCategory browseCategory(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_CATEGORY + id);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyCategory(response);
	}
	
	public static SpotifyPlaylistSimplified[] browseCategoryPlaylists(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.BROWSE_CATEGORY + id + SpotifyEndpoints.CATEGORY_PLAYLISTS);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("playlists")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyPlaylistSimplified::new)
				.toArray(SpotifyPlaylistSimplified[]::new);
	}
	
	public static SpotifyRecommendations getRecommendations() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.RECOMMENDATIONS);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyRecommendations(response);
	}
	
	public static SpotifyAlbumSimplified[] searchAlbums() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.SEARCH_ALBUM);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("albums")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyAlbumSimplified::new)
				.toArray(SpotifyAlbumSimplified[]::new);
	}
	
	public static SpotifyArtist[] searchArtists() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.SEARCH_ARTIST);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("artists")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyArtist::new)
				.toArray(SpotifyArtist[]::new);
	}
	
	public static SpotifyPlaylistSimplified[] searchPlaylists() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.SEARCH_PLAYLIST);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("playlists")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyPlaylistSimplified::new)
				.toArray(SpotifyPlaylistSimplified[]::new);
	}
	
	public static SpotifyTrack[] searchTracks() throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.SEARCH_TRACK);
		JSONObject response = SpotifyAPI.search(searchURL);

		return response
				.getJSONArray("tracks")
				.toList()
				.stream()
				.map(obj -> (JSONObject) obj)
				.map(SpotifyTrack::new)
				.toArray(SpotifyTrack[]::new);
	}
	
	public static SpotifyTrack getTrack(String id) throws IOException
	{
		URL searchURL = new URL(SpotifyEndpoints.GET_TRACK + id);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyTrack(response);
	}
	
	public static SpotifyTrack getTracks(String[] ids) throws IOException
	{
		String searchIds = SpotifyAPI.parseArrayToString(ids);
		URL searchURL = new URL(SpotifyEndpoints.GET_AUDIO_FEATURES + searchIds);
		JSONObject response = SpotifyAPI.search(searchURL);

		return new SpotifyTrack(response);
	}
	
	private static JSONObject search(URL searchURL) throws IOException
	{
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
        
        return new JSONObject(sb.toString());
	}
	
	private static String parseArrayToString(String[] array)
	{
		return array.toString().replaceAll(", ", ",").replace("[", "").replace("]", "");
	}
	
}
