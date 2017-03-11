package com.pmurmor.spotifyAPI;

import java.util.*;
import org.json.*;

public class SpotifyAudioAnalysis {

	private Map<String,Object> data;
	
	public SpotifyAudioAnalysis(JSONObject object)
	{
		this.setData(object);
	}
	
	public Map<String,Object> getData()
	{
		return data;
	}
	
	private void setData(JSONObject object)
	{
		this.data = object.toMap();
	}
}
