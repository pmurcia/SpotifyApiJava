package com.pmurmor.spotifyAPI.net;

import java.net.*;
import java.util.*;
import java.io.*;

public class SpotifyAuthClientCredentials {

	private String clientCredentials;
	private HttpURLConnection connection;
	
	public SpotifyAuthClientCredentials(String clientId, String clientSecret) throws MalformedURLException, IOException 
    {
		this.setCredentials(clientId, clientSecret);
        this.setUpUrl();
        System.out.println(this.getResponseText());
    }
	
	public void setUpUrl() throws MalformedURLException, IOException
	{
		URL u = new URL(new String(SpotifyLinks.AUTH_API_TOKEN + "?grant_type=client_credentials"));
        connection = (HttpURLConnection) u.openConnection();
        
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Authorization", clientCredentials);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	}
	
	public void setCredentials(String clientId, String clientSecret)
	{
		String credentials = clientId + ":" + clientSecret;
		this.clientCredentials = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
	}
	
	public String getResponseText() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        while(s!=null)
        {
            sb.append(s + "\n");
            s = br.readLine();
        }
        
        return sb.toString();
	}
}
