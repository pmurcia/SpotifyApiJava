package com.pmurmor.spotifyAPI.net;

import java.io.*;
import java.net.*;
import java.util.*;

import org.json.*;

public class SpotifyAuthClientCredentials {
	
	// Class attributes and methods
	private static String accessToken;
	private static int expiresIn;
	
	private static SpotifyToken clientToken;
	
	public static String getAccessToken()
	{
		return accessToken;
	}
	
	private static void setAccessToken(String type, String token)
	{
		SpotifyAuthClientCredentials.accessToken = new String(type + " " + token);
	}
	
	public static int getExpiresIn()
	{
		return expiresIn;
	}
	
	private static void setExpiresIn(int expiresIn)
	{
		SpotifyAuthClientCredentials.expiresIn = expiresIn;
	}
	
	public static SpotifyToken getClientToken()
	{
		return clientToken;
	}

	// Instance attributes and methods
	private String clientCredentials;
	private HttpURLConnection connection;

	public SpotifyAuthClientCredentials(String clientId, String clientSecret) throws MalformedURLException, IOException 
    {
		this.setCredentials(clientId, clientSecret);
        this.setUpUrl();
        this.parseJSONResponse(this.getResponseText());
        clientToken = new SpotifyToken(accessToken, expiresIn);
    }

	private void setCredentials(String clientId, String clientSecret)
	{
		String credentials = clientId + ":" + clientSecret;
		this.clientCredentials = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
	}
	
	private void setUpUrl() throws MalformedURLException, IOException
	{
		URL u = new URL(new String(SpotifyEndpoints.AUTH_API_TOKEN + "?grant_type=client_credentials"));
        connection = (HttpURLConnection) u.openConnection();
        
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Authorization", clientCredentials);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	}
	
	private String getResponseText() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        while(s != null)
        {
            sb.append(s + "\n");
            s = br.readLine();
        }
        
        return sb.toString();
	}
	
	private void parseJSONResponse(String responseText) {
		JSONObject response = new JSONObject(responseText);
		SpotifyAuthClientCredentials.setAccessToken(response.getString("token_type"), response.getString("access_token"));
		SpotifyAuthClientCredentials.setExpiresIn(response.getInt("expires_in"));
	}
}
