package com.pmurmor.spotifyAPI.resources;

public class SpotifyImage {
	// Instance attributes
	private int height;		// The image height in pixels
	private int width;		// The image width in pixels
	private String url;		// The source URL of the image
	
	// Constructor method
	public SpotifyImage(int height, String url, int width)
	{
		this.setHeight(height);
		this.setURL(url);
		this.setWidth(width);
	}
	
	// Method that gets the height of the image
	public int getHeight()
	{
		return height;
	}
	
	// Method that sets a new height of the image
	private void setHeight(int height)
	{
		this.height = height;
	}
	
	// Method that gets the width of the image
	public int getWidth()
	{
		return width;
	}
	
	// Method that sets a new width of the image
	private void setWidth(int width)
	{
		this.width = width;
	}
	
	// Method that gets the URL of the image
	public String getURL()
	{
		return url;
	}

	// Method that sets a new URL of the image
	private void setURL(String url)
	{
		this.url = url;
	}
}
