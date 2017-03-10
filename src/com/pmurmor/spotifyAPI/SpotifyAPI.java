package com.pmurmor.spotifyAPI;

import java.io.IOException;

import com.pmurmor.spotifyAPI.net.*;

public class SpotifyAPI {
	
	private static SpotifyToken apiToken;

	public static void main(String args[])
	{
		new SpotifyAPI("60c0e854a63b418f938dac56be914df5","8f03ae72344648cab8f1ed4a2c943d9e");
		System.out.println(SpotifyAPI.getAPIToken());
	}
	
	public SpotifyAPI(String clientId, String clientSecret)
	{
		try {
			new SpotifyAuthClientCredentials(clientId, clientSecret);
			SpotifyAPI.setApiToken(SpotifyAuthClientCredentials.getClientToken());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SpotifyToken getAPIToken()
	{
		return apiToken;
	}
	
	private static void setApiToken(SpotifyToken apiToken)
	{
		SpotifyAPI.apiToken = apiToken;
	}
}
