package com.pmurmor.spotifyAPI;

public class SpotifyFollowers {
	private String href;
	private int total;
	
	public SpotifyFollowers(String href, int total) {
		this.href = href;
		this.total = total;
	}

	public String getHref() {
		return href;
	}
	
	public int getTotal() {
		return total;
	}
}
