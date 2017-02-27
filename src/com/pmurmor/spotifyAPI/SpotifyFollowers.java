package com.pmurmor.spotifyAPI;

public class SpotifyFollowers {
	private String href;
	private int total;
	
	public SpotifyFollowers(String href, int total) {
		this.setHref(href);
		this.setTotal(total);
	}

	public String getHref() {
		return href;
	}
	
	public void setHref(String href) {
		this.href = href;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
}
