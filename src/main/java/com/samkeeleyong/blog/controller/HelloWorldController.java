package com.samkeeleyong.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.samkeeleyong.blog.domain.HelloWorld;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody HelloWorld sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name){
		return new HelloWorld(name);
	}
	
}
