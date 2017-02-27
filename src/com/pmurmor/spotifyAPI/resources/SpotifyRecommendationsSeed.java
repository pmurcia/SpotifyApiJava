package com.pmurmor.spotifyAPI.resources;

public class SpotifyRecommendationsSeed {
	private int afterFilteringSize;
	private int afterRelinkingSize;
	private String href;
	private String id;
	private int initialPoolSize;
	private String type;
	public SpotifyRecommendationsSeed(int afterFilteringSize, int afterRelinkingSize, String href, String id,
			int initialPoolSize, String type) {
		this.setAfterFilteringSize(afterFilteringSize);
		this.setAfterRelinkingSize(afterRelinkingSize);
		this.setHref(href);
		this.setId(id);
		this.setInitialPoolSize(initialPoolSize);
		this.setType(type);
	}
	public int getAfterFilteringSize() {
		return afterFilteringSize;
	}
	public void setAfterFilteringSize(int afterFilteringSize) {
		this.afterFilteringSize = afterFilteringSize;
	}
	public int getAfterRelinkingSize() {
		return afterRelinkingSize;
	}
	public void setAfterRelinkingSize(int afterRelinkingSize) {
		this.afterRelinkingSize = afterRelinkingSize;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getInitialPoolSize() {
		return initialPoolSize;
	}
	public void setInitialPoolSize(int initialPoolSize) {
		this.initialPoolSize = initialPoolSize;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
