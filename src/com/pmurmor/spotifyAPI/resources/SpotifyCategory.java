package com.pmurmor.spotifyAPI.resources;

public class SpotifyCategory {
	private String href;			// A link to the Web API endpoint returning full details of the category
	private SpotifyImage icons[];	// The category icon, in various sizes
	private String id;				// The Spotify category ID
	private String name;			// The name of the category
	
	// Constructor method
	public SpotifyCategory(String href, SpotifyImage[] icons, String id, String name) {
		this.setHref(href);
		this.setIcons(icons);
		this.setId(id);
		this.setName(name);
	}
	
	// Method that returns the href of a category
	public String getHref() {
		return href;
	}

	// Method that sets the href of a category
	public void setHref(String href) {
		this.href = href;
	}

	// Method that returns the icons of a category
	public SpotifyImage[] getIcons() {
		return icons;
	}

	// Method that sets the icons of a category
	public void setIcons(SpotifyImage[] icons) {
		this.icons = icons;
	}

	// Method that returns the Spotify ID of a category
	public String getId() {
		return id;
	}

	// Method that sets the Spotify ID of a category
	public void setId(String id) {
		this.id = id;
	}

	// Method that returns the name of a category
	public String getName() {
		return name;
	}

	// Method that sets the name of a category
	public void setName(String name) {
		this.name = name;
	}
}
