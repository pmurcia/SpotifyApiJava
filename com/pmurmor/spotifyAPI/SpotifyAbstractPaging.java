package com.pmurmor.spotifyAPI;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

import org.json.*;

public abstract class SpotifyAbstractPaging<T extends SpotifyObject> {
	private String href;
	private T[] items;
	private int limit;
	private String next;
	private int total;
	
	private Constructor<T> constructor;
	
	public SpotifyAbstractPaging(JSONObject object, Class<T> clazz)
	{
		try
		{
			constructor = clazz.getDeclaredConstructor(JSONObject.class);
			this.setHref(object);
			this.setItems(object);
			this.setLimit(object);
			this.setNext(object);
			this.setTotal(object);
		} catch(Exception e)
		{
			System.out.println("Error in SpotifyAbstractPaging class");
		}
	}
	
	private void setHref(JSONObject object) {
		this.href = object.getString("href");
	}

	// TODO needs to save in T type
	@SuppressWarnings("unchecked")
	private void setItems(JSONObject object) {
		ArrayList<T> pagingItems = new ArrayList<T>();
		
		object
			.getJSONArray("items")
			.forEach(item -> {
				try {
					T auxT = constructor.newInstance(item);
					pagingItems.add(auxT);
				} catch(Exception e)
				{
					e.printStackTrace();
				}
			});
		
		this.items = pagingItems.toArray((T[]) new SpotifyObject[pagingItems.size()]);
		System.out.println(pagingItems);
	}

	private void setLimit(JSONObject object) {
		this.limit = object.getInt("limit");
	}

	private void setNext(JSONObject object) {
		try
		{
			this.next = object.getString("next");
		} catch(JSONException e)
		{}
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
