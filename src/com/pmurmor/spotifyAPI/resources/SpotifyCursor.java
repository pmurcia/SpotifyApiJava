package com.pmurmor.spotifyAPI.resources;

public class SpotifyCursor {
	// Instance attributes
	private String after;
	
	// Constructor method
	public SpotifyCursor(String after) {
		this.after = after;
	}

	// Method that returns the after of the cursor
	public String getAfter() {
		return after;
	}
}
