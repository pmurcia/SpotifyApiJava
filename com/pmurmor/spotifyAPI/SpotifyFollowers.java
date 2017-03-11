package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyFollowers {
	private String href;
	private int total;
	
	/*public SpotifyFollowers(String href, int total) {
		this.href = href;
		this.total = total;
	}*/
	
	public SpotifyFollowers(JSONObject object)
	{
		this.setHref(object);
		this.setTotal(object);
	}
	
	private void setHref(JSONObject object)
	{
		this.href = object.getString("href");
	}
	
	private void setTotal(JSONObject object)
	{
		this.total = object.getInt("total");
	}

	public String getHref() {
		return href;
	}
	
	public int getTotal() {
		return total;
	}
}
