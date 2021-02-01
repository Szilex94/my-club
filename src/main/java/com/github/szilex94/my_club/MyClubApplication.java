package com.github.szilex94.my_club;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.github.szilex94.my_club.*")
public class MyClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyClubApplication.class, args);
	}

}
