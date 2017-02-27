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
	
	public void setHref(String href) {
		this.href = href;
	}
	
	public Object[] getItems() {
		return items;
	}
	
	public void setItems(Object[] items) {
		this.items = items;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public String getNext() {
		return next;
	}
	
	public void setNext(String next) {
		this.next = next;
	}
	
	public SpotifyCursor getCursors() {
		return cursors;
	}
	
	public void setCursors(SpotifyCursor cursors) {
		this.cursors = cursors;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
}
