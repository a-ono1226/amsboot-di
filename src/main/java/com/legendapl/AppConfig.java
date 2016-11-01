package com.legendapl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.legendapl.app.AddCalculatorImpl;
import com.legendapl.app.ArgumentResolver;
import com.legendapl.app.Calculator;
import com.legendapl.app.Frontend;
import com.legendapl.app.ScannerArgumentResolverImpl;

@Configuration
public class AppConfig {
	@Bean
	Calculator calculator() {
		return new AddCalculatorImpl();
	}

	@Bean
	ArgumentResolver resolver() {
		return new ScannerArgumentResolverImpl();
	}

	@Bean
	Frontend frontend() {
		return new Frontend();
	}
}
