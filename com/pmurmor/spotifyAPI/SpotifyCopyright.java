package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyCopyright {
	
	// Instance attributes
	private String text;
	private String type;
	
	/*public SpotifyCopyright(String text, String type) {
		this.text = text;
		this.type = type;
	}*/
	
	public SpotifyCopyright(JSONObject object)
	{
		this.setText(object);
		this.setType(object);
	}

	private void setText(JSONObject object) {
		this.text = object.getString("text");
	}

	private void setType(JSONObject object) {
		this.type = object.getString("type");
	}

	public String getText() {
		return text;
	}

	public String getType() {
		return type;
	}
}
