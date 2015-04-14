package com.samkeeleyong.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(value = { "com.samkeeleyong.blog" })
@EnableAutoConfiguration(exclude = { FreeMarkerAutoConfiguration.class })
@EnableJpaRepositories(basePackages = { "com.samkeeleyong.blog.repository" })
@EntityScan(basePackages = { "com.samkeeleyong.blog.domain" })
@EnableConfigurationProperties
@SpringBootApplication
public class Application {
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
