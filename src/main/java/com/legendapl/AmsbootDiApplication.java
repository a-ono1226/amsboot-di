package com.legendapl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.legendapl.app.Frontend;

@EnableAutoConfiguration
@ComponentScan
public class AmsbootDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AmsbootDiApplication.class, args);
		Frontend frontend = context.getBean(Frontend.class);
		frontend.run();
	}
}
