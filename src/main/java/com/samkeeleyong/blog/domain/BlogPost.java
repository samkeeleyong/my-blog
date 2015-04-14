package com.samkeeleyong.blog.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "posts")
public class BlogPost {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "post_id")
	private String id;
	
	@Column(name = "post_content")
	private String postContent;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "post_date")
	private Date postDate;

	@PrePersist
	public void prePersist(){
		this.postDate = new Date();
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
}
