package com.samkeeleyong.blog.repository;

import org.springframework.data.repository.CrudRepository;
import com.samkeeleyong.blog.domain.BlogPost;

public interface BlogPostRepository extends CrudRepository<BlogPost, String>{

}
