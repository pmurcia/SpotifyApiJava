package com.pmurmor.spotifyAPI;

public class SpotifyCursorBasedPaging {
	private String href;
	private Object items[];
	private int limit;
	private String next;
	private SpotifyCursor cursors;
	private int total;
	
	public SpotifyCursorBasedPaging(String href, Object[] items, int limit, String next, SpotifyCursor cursors,
			int total) {
		this.href = href;
		this.items = items;
		this.limit = limit;
		this.next = next;
		this.cursors = cursors;
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
	
	public SpotifyCursor getCursors() {
		return cursors;
	}
	
	public int getTotal() {
		return total;
	}
}
