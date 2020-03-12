package com.vega.springit;

import com.vega.springit.Repository.CommentRepository;
import com.vega.springit.Repository.LinkRepository;
import com.vega.springit.domain.Comment;
import com.vega.springit.domain.Link;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

//	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link = new Link("Getting Started with Spring Boot 2", "https://therealdavega.com/spring-boot-2");
			linkRepository.save(link);

			Comment comment = new Comment("This Spring Boot 2 link is awesome!", link);
			commentRepository.save(comment);
			link.addComment(comment);

			System.out.println("We just inserted a link into and comment");
			System.out.println("=================================================");

//			Link firstLink = linkRepository.findByTitle("Getting Started with Spring Boot 2");
//			System.out.println(firstLink.getTitle());

		};
	}

}
