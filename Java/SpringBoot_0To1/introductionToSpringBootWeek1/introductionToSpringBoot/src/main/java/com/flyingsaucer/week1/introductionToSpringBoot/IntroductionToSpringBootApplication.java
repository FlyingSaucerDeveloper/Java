package com.flyingsaucer.week1.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication {
	@Autowired
	static  Apple obj;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);



		System.out.println("New Way using Spring Annotation :\n");
		obj.eatApple();

	}


}
