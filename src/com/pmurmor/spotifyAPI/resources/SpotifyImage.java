package com.pmurmor.spotifyAPI.resources;

public class SpotifyImage {
	// Instance attributes
	private int height;		// The image height in pixels
	private int width;		// The image width in pixels
	private String url;		// The source URL of the image
	
	public SpotifyImage(int height, int width, String url) {
		this.height = height;
		this.width = width;
		this.url = url;
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
