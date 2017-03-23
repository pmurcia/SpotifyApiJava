package com.pmurmor.spotifyAPI;

import org.json.*;

public class SpotifyPaging<T extends SpotifyItem> extends SpotifyAbstractPaging<T> {
	
	private int offset;
	private String previous;
	
	/*public SpotifyPaging(String href, Object[] items, int limit, String next, int offset, String previous, int total) {
		this.href = href;
		this.items = items;
		this.limit = limit;
		this.next = next;
		this.offset = offset;
		this.previous = previous;
		this.total = total;
	}*/
	
	public SpotifyPaging(JSONObject object, Class<T> klazz)
	{
		super(object, klazz);
		this.setOffset(object);
		this.setPrevious(object);	
	}

	private void setOffset(JSONObject object) {
		this.offset = object.getInt("offset");
	}

	private void setPrevious(JSONObject object) {
		try
		{
			this.previous = object.getString("previous");
	
		} catch(Exception e){}
	}

	public int getOffset() {
		return offset;
	}

	public String getPrevious() {
		return previous;
	}
}
