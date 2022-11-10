package com.example.galleria.model;

import javax.persistence.Column;
import javax.persistence.Id;

@Table
@Entity
public class UserGallery {
	
	@Column
	private String username;
	
	@Id
	@Column
	private String url;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
