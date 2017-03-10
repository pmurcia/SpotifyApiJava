package com.pmurmor.spotifyAPI;

public class SpotifyRecommendationsSeed {
	private int afterFilteringSize;
	private int afterRelinkingSize;
	private String href;
	private String id;
	private int initialPoolSize;
	private String type;
	
	public SpotifyRecommendationsSeed(int afterFilteringSize, int afterRelinkingSize, String href, String id,
			int initialPoolSize, String type) {
		this.afterFilteringSize = afterFilteringSize;
		this.afterRelinkingSize = afterRelinkingSize;
		this.href = href;
		this.id = id;
		this.initialPoolSize = initialPoolSize;
		this.type = type;
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
