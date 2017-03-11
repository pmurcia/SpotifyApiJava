package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyError {
	private int status;
	private String message;
	
	/*public SpotifyError(int status, String message) {
		this.status = status;
		this.message = message;
	}*/
	
	public SpotifyError(JSONObject object)
	{
		this.setStatus(object);
		this.setMessage(object);
	}

	private void setStatus(JSONObject object)
	{
		this.status = object.getInt("status");
	}
	
	private void setMessage(JSONObject object)
	{
		this.message = object.getString("message");
	}
	
	public int getStatus() {
		return status;
	}
	
	public String getMessage() {
		return message;
	}
}
