package com.pmurmor.spotifyAPI;

public class SpotifyCopyright {
	
	// Instance attributes
	private String text;
	private String type;
	
	public SpotifyCopyright(String text, String type) {
		this.text = text;
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public String getType() {
		return type;
	}
}
