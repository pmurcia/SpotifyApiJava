package com.pmurmor.spotifyAPI.resources;

public class SpotifyPaging {
	
	private String href;
	private Object items[];	// TODO see if it can be more specific
	private int limit;
	private String next;
	private int offset;
	private String previous;
	private int total;
	
	public SpotifyPaging(String href, Object[] items, int limit, String next, int offset, String previous, int total) {
		this.href = href;
		this.items = items;
		this.limit = limit;
		this.next = next;
		this.offset = offset;
		this.previous = previous;
		this.total = total;
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
