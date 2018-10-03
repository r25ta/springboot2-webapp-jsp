package net.guides.springboot2.springboot2webappjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Springboot2webappjspApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Springboot2webappjspApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Springboot2webappjspApplication.class, args);
	}
}
