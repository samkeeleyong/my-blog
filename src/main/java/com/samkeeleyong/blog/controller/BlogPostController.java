package com.samkeeleyong.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.samkeeleyong.blog.domain.BlogPost;
import com.samkeeleyong.blog.http.response.BlogPostQueryResponse;
import com.samkeeleyong.blog.repository.BlogPostRepository;

@RestController
@RequestMapping("/blogpost")
public class BlogPostController {
	
	@Autowired
	BlogPostRepository blogPostRepository;
	
	@RequestMapping(value = "/blogpost", method=RequestMethod.POST)
	public  HttpEntity<BlogPostQueryResponse> postContent(@RequestParam(value = "content", required = true) String content){
		BlogPost post = new BlogPost();
		post.setPostContent(content);
		
		blogPostRepository.save(post);
		
		BlogPostQueryResponse response = new BlogPostQueryResponse();
		
		return new ResponseEntity<BlogPostQueryResponse>(response, HttpStatus.OK);
	}
}
