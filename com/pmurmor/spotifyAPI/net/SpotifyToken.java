package com.pmurmor.spotifyAPI.net;

import java.util.*;

public class SpotifyToken {
	private String token;
	private int expiresIn;
	private Date createdAt;
	
	public SpotifyToken(String token, int expiresIn)
	{
		this.token = token;
		this.expiresIn = expiresIn;
		this.createdAt = new Date();
	}
	
	public String getToken()
	{
		return token;
	}
	
	public int getExpiresIn()
	{
		return expiresIn;
	}
	
	public boolean hasExpired()
	{
		return (new Date().getTime() - createdAt.getTime())>expiresIn;
	}
	
	@Override
	public String toString()
	{
		return this.token + "\nExpires in " + this.expiresIn + " seconds";
	}
}
