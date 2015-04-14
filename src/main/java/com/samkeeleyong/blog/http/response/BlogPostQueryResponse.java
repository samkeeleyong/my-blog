package com.samkeeleyong.blog.http.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlogPostQueryResponse {
	@JsonProperty(value = "content")
	private String postContent;
	
	@JsonProperty(value = "date_created")
	private Date date;

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
