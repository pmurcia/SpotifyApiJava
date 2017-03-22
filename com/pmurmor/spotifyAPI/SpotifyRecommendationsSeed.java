package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyRecommendationsSeed {
	private int afterFilteringSize;
	private int afterRelinkingSize;
	private String href;
	private String id;
	private int initialPoolSize;
	private String type;
	
	/*public SpotifyRecommendationsSeed(int afterFilteringSize, int afterRelinkingSize, String href, String id,
			int initialPoolSize, String type) {
		this.afterFilteringSize = afterFilteringSize;
		this.afterRelinkingSize = afterRelinkingSize;
		this.href = href;
		this.id = id;
		this.initialPoolSize = initialPoolSize;
		this.type = type;
	}*/
	
	public SpotifyRecommendationsSeed(JSONObject object)
	{
		this.setAfterFilteringSize(object);
		this.setAfterRelinkingSize(object);
		this.setHref(object);
		this.setId(object);
		this.setInitialPoolSize(object);
		this.setType(object);
	}

	private void setAfterFilteringSize(JSONObject object) {
		this.afterFilteringSize = object.getInt("afterFilteringSize");
	}

	private void setAfterRelinkingSize(JSONObject object) {
		this.afterRelinkingSize = object.getInt("afterRelinkingSize");
	}

	private void setHref(JSONObject object) {
		try
		{
			this.href = object.getString("href");
		} catch(Exception e){}
	}

	private void setId(JSONObject object) {
		this.id = object.getString("id");
	}

	private void setInitialPoolSize(JSONObject object) {
		this.initialPoolSize = object.getInt("initialPoolSize");
	}

	private void setType(JSONObject object) {
		this.type = object.getString("type");
	}

	public int getAfterFilteringSize() {
		return afterFilteringSize;
	}

	public int getAfterRelinkingSize() {
		return afterRelinkingSize;
	}

	public String getHref() {
		return href;
	}

	public String getId() {
		return id;
	}

	public int getInitialPoolSize() {
		return initialPoolSize;
	}

	public String getType() {
		return type;
	}
}
