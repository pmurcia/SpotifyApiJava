package com.pmurmor.spotifyAPI;

import org.json.*;

import java.util.Map;

public class SpotifyExternalId {
	private Map<String,String> ids;
	
	/*public SpotifyExternalId(String[] keys, String[] values) {
		this.keys = keys;
		this.values = values;
	}*/
	
	public SpotifyExternalId(JSONObject object)
	{
		this.setIds(object);
	}

	public Map<String, String> getIds() {
		return ids;
	}

	private void setIds(JSONObject object) {
		String keys[] = JSONObject.getNames(object);
		for(int i = 0; i < object.length(); i++)
		{
			this.ids.put(keys[i], object.getString(keys[i]));
		}
	}
}
