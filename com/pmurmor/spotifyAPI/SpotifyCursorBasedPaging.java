package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyCursorBasedPaging<T extends SpotifyItem> extends SpotifyAbstractPaging<T> {
	private SpotifyCursor cursors;
	
	/*public SpotifyCursorBasedPaging(String href, Object[] items, int limit, String next, SpotifyCursor cursors,
			int total) {
		this.href = href;
		this.items = items;
		this.limit = limit;
		this.next = next;
		this.cursors = cursors;
		this.total = total;
	}*/
	
	public SpotifyCursorBasedPaging(JSONObject object, Class<T> klazz) throws NoSuchMethodException, SecurityException
	{
		super(object, klazz);
		this.setCursors(object);
	}

	private void setCursors(JSONObject object) {
		this.cursors = new SpotifyCursor(object.getJSONObject("cursors"));
	}

	public SpotifyCursor getCursors() {
		return cursors;
	}
}
