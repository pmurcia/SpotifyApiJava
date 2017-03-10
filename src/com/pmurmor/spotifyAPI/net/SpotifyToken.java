package com.pmurmor.spotifyAPI.net;

import java.util.*;

public class SpotifyToken {
	private static String token;
	private static int expiresIn;
	private static Date createdAt;
	
	public SpotifyToken(String token, int expiresIn)
	{
		SpotifyToken.token = token;
		SpotifyToken.expiresIn = expiresIn;
		createdAt = new Date();
	}
	
	public static String getToken()
	{
		return token;
	}
	
	public static int getExpiresIn()
	{
		return expiresIn;
	}
	
	public static boolean hasExpired()
	{
		return (new Date().getTime() - createdAt.getTime())>expiresIn;
	}
	
	@Override
	public String toString()
	{
		return SpotifyToken.token + "\nExpires in " + SpotifyToken.expiresIn + " seconds";
	}
}
