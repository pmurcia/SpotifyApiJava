package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyCategory {
	private String href;			// A link to the Web API endpoint returning full details of the category
	private SpotifyImage icons[];	// The category icon, in various sizes
	private String id;				// The Spotify category ID
	private String name;			// The name of the category
	
	/*public SpotifyCategory(String href, SpotifyImage[] icons, String id, String name) {
		this.href = href;
		this.icons = icons;
		this.id = id;
		this.name = name;
	}*/
	
	public SpotifyCategory(JSONObject object)
	{
		this.setHref(object);
		this.setIcons(object);
		this.setId(object);
		this.setName(object);
	}

	private void setHref(JSONObject object) {
		this.href = object.getString("href");
	}

	private void setIcons(JSONObject object) {
		this.icons = object
						.getJSONArray("icons")
						.toList()
						.stream()
						.toArray(SpotifyImage[]::new);
	}

	private void setId(JSONObject object) {
		this.id = object.getString("id");
	}

	private void setName(JSONObject object) {
		this.name = object.getString("name");
	}

	public String getHref() {
		return href;
	}

	public SpotifyImage[] getIcons() {
		return icons;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
