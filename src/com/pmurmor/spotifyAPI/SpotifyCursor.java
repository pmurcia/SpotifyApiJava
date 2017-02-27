package com.pmurmor.spotifyAPI;

public class SpotifyCursor {
	// Instance attributes
	private String after;
	
	// Constructor method
	public SpotifyCursor(String after) {
		this.setAfter(after);
	}

	// Method that returns the after of the cursor
	public String getAfter() {
		return after;
	}

	// Method that sets the after of the cursor
	public void setAfter(String after) {
		this.after = after;
	}
}
