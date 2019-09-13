package com.techlabs.bookmarks;

import java.io.Serializable;

public class Bookmark implements Serializable{
	private String url;
	private String description;
	
	public Bookmark() {
		this.url = url;
		this.description = description;
	}
	
	public String getUrl() {
		return url;
	}
	public String getDescription() {
		return description;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
