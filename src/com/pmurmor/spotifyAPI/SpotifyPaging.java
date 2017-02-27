package com.pmurmor.spotifyAPI;

public class SpotifyPaging {
	
	private String href;
	private Object items[];	// TODO see if it can be more specific
	private int limit;
	private String next;
	private int offset;
	private String previous;
	private int total;
	
	public SpotifyPaging(String href, Object[] items, int limit, String next, int offset, String previous, int total) {
		this.setHref(href);
		this.setItems(items);
		this.setLimit(limit);
		this.setNext(next);
		this.setOffset(offset);
		this.setPrevious(previous);
		this.setTotal(total);
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
	
	public int getOffset() {
		return offset;
	}
	
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	public String getPrevious() {
		return previous;
	}
	
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
}
