package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyImage {
	// Instance attributes
	private int height;		// The image height in pixels
	private int width;		// The image width in pixels
	private String url;		// The source URL of the image
	
	/*public SpotifyImage(int height, int width, String url) {
		this.height = height;
		this.width = width;
		this.url = url;
	}*/
	
	public SpotifyImage(JSONObject object)
	{
		this.setHeight(object);
		this.setWidth(object);
		this.setUrl(object);
	}
	
	private void setHeight(JSONObject object)
	{
		this.height = object.getInt("height");
	}
	
	private void setWidth(JSONObject object)
	{
		this.width = object.getInt("width");
	}
	
	private void setUrl(JSONObject object)
	{
		this.url = object.getString("url");
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public String getUrl() {
		return url;
	}
}
