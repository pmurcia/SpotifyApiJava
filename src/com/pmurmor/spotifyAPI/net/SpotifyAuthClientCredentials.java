package com.pmurmor.spotifyAPI.net;

import java.net.*;
import java.util.*;

public class SpotifyAuthClientCredentials {
	
	public static void main(String args[])
	{
		try {
			URL authorizationURL = new URL("https://accounts.spotify.com/api/token");
			HttpURLConnection connection = (HttpURLConnection) authorizationURL.openConnection();
			
			String userCredentials = "client_id:consumer_id";
			String basicAuth = "Basic " + Base64.getEncoder().encodeToString(userCredentials.getBytes());

			System.out.println(Base64.getEncoder().encodeToString(userCredentials.getBytes()));
			System.out.println(basicAuth);
						
			connection.setRequestProperty("Authorization", basicAuth);
			connection.setRequestMethod("GET");
			
			connection.connect();
			
			System.out.println(connection.getRequestProperties());
			
			System.out.println(connection.getHeaderField(0));
			System.out.println(connection.getRequestMethod());
			System.out.println(connection.getHeaderFields());			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
