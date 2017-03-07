package com.pmurmor.spotifyAPI;

import com.pmurmor.spotifyAPI.resources.SpotifyImage;

public class SpotifyCategory {
	private String href;			// A link to the Web API endpoint returning full details of the category
	private SpotifyImage icons[];	// The category icon, in various sizes
	private String id;				// The Spotify category ID
	private String name;			// The name of the category
	
	public SpotifyCategory(String href, SpotifyImage[] icons, String id, String name) {
		this.href = href;
		this.icons = icons;
		this.id = id;
		this.name = name;
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
