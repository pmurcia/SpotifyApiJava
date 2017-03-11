package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyPaging {
	
	private String href;
	private SpotifyObject items[];
	private int limit;
	private String next;
	private int offset;
	private String previous;
	private int total;
	
	/*public SpotifyPaging(String href, Object[] items, int limit, String next, int offset, String previous, int total) {
		this.href = href;
		this.items = items;
		this.limit = limit;
		this.next = next;
		this.offset = offset;
		this.previous = previous;
		this.total = total;
	}*/
	
	public SpotifyPaging(JSONObject object)
	{
		this.setHref(object);
		this.setItems(object);
		this.setLimit(object);
		this.setNext(object);
		this.setOffset(object);
		this.setPrevious(object);
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

	private void setOffset(JSONObject object) {
		this.offset = object.getInt("offset");
	}

	private void setPrevious(JSONObject object) {
		this.previous = object.getString("previous");
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

	public int getOffset() {
		return offset;
	}

	public String getPrevious() {
		return previous;
	}

	public int getTotal() {
		return total;
	}
}
