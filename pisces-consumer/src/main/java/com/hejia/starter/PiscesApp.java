package com.hejia.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages="com.hejia.pisces")
@ImportResource(value = {"classpath:dubbo-consumer.xml"})
public class PiscesApp extends SpringBootServletInitializer{
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(PiscesApp.class, args);
    }

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(PiscesApp.class);
	}
}
