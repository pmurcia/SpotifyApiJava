package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyCursor {
	// Instance attributes
	private String after;
	
	// Constructor method
	/*public SpotifyCursor(String after) {
		this.after = after;
	}*/
	
	public SpotifyCursor(JSONObject object)
	{
		this.setAfter(object);
	}
	
	private void setAfter(JSONObject object)
	{
		this.after = object.getString("after");
	}

	// Method that returns the after of the cursor
	public String getAfter() {
		return after;
	}
}
