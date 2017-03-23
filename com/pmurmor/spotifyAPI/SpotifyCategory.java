package com.pmurmor.spotifyAPI;

import java.util.ArrayList;

import org.json.*;

public class SpotifyCategory extends SpotifyItem {
	private SpotifyImage icons[];	// The category icon, in various sizes
	private String name;			// The name of the category
	
	/*public SpotifyCategory(String href, SpotifyImage[] icons, String id, String name) {
		this.href = href;
		this.icons = icons;
		this.id = id;
		this.name = name;
	}*/
	
	public SpotifyCategory(JSONObject object)
	{
		super(object);
		this.setIcons(object);
		this.setName(object);
	}

	private void setIcons(JSONObject object) {
		ArrayList<SpotifyImage> categoryIcons = new ArrayList<SpotifyImage>();
		
		object
			.getJSONArray("icons")
			.forEach(icon -> categoryIcons.add(new SpotifyImage((JSONObject) icon)));
		
		this.icons = categoryIcons.toArray(new SpotifyImage[categoryIcons.size()]);
	}

	private void setName(JSONObject object) {
		this.name = object.getString("name");
	}

	public SpotifyImage[] getIcons() {
		return icons;
	}

	public String getName() {
		return name;
	}
}
