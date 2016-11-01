package com.legendapl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.legendapl.app.AddCalculatorImpl;
import com.legendapl.app.Calculator;

@Configuration
public class AppConfig {
	@Bean
	Calculator calculator() {
		return new AddCalculatorImpl();
	}

}
