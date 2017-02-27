package com.pmurmor.spotifyAPI.resources;

public class SpotifyCopyright {
	
	// Instance attributes
	private String text;
	private String type;
	
	// Constructor method
	public SpotifyCopyright(String text, String type) {
		this.setText(text);
		this.setType(type);
	}

	// Method that returns the text of the copyright
	public String getText() {
		return text;
	}

	// Method that sets the textof the copyright
	public void setText(String text) {
		this.text = text;
	}

	// Method that returns the type of object copyright is
	public String getType() {
		return type;
	}

	// Method that sets the type of object copyright is
	public void setType(String type) {
		this.type = type;
	}
}
