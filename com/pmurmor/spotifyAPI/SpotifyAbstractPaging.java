package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyAbstractPaging<T extends SpotifyObject> {
	private String href;
	private T[] items;
	private int limit;
	private String next;
	private int total;
	
	public SpotifyAbstractPaging(JSONObject object)
	{
		this.setHref(object);
		this.setItems(object);
		this.setLimit(object);
		this.setNext(object);
		this.setTotal(object);
	}

	private void setHref(JSONObject object) {
		this.href = object.getString("href");
	}

	@SuppressWarnings("unchecked")
	private void setItems(JSONObject object) {
		this.items = (T[]) object
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

	private void setTotal(JSONObject object) {
		this.total = object.getInt("total");
	}

	public String getHref() {
		return href;
	}

	public T[] getItems() {
		return items;
	}

	public int getLimit() {
		return limit;
	}

	public String getNext() {
		return next;
	}

	public int getTotal() {
		return total;
	}
}
