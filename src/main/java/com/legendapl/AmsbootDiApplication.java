package com.legendapl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.legendapl.app.Frontend;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class AmsbootDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AmsbootDiApplication.class, args);
		Frontend frontend = context.getBean(Frontend.class);
		frontend.run();
	}
}
