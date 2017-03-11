package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyCursorBasedPaging {
	private String href;
	private SpotifyObject items[];
	private int limit;
	private String next;
	private SpotifyCursor cursors;
	private int total;
	
	/*public SpotifyCursorBasedPaging(String href, Object[] items, int limit, String next, SpotifyCursor cursors,
			int total) {
		this.href = href;
		this.items = items;
		this.limit = limit;
		this.next = next;
		this.cursors = cursors;
		this.total = total;
	}*/
	
	public SpotifyCursorBasedPaging(JSONObject object)
	{
		this.setCursors(object);
		this.setHref(object);
		this.setItems(object);
		this.setLimit(object);
		this.setNext(object);
		this.setTotal(object);
	}

	private void setHref(JSONObject object) {
		this.href = object.getString("href");
	}

	private void setItems(JSONObject object) {
		this.items = object
						.getJSONArray("items")
						.toList()
						.stream()
						.toArray(SpotifyObject[]::new);
	}

	private void setLimit(JSONObject object) {
		this.limit = object.getInt("limit");
	}

	private void setNext(JSONObject object) {
		this.next = object.getString("next");
	}

	private void setCursors(JSONObject object) {
		this.cursors = new SpotifyCursor(object.getJSONObject("cursors"));
	}

	private void setTotal(JSONObject object) {
		this.total = object.getInt("total");
	}

	public String getHref() {
		return href;
	}
	
	public Object[] getItems() {
		return items;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public String getNext() {
		return next;
	}
	
	public SpotifyCursor getCursors() {
		return cursors;
	}
	
	public int getTotal() {
		return total;
	}
}
