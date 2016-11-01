package com.legendapl.app;

import org.springframework.stereotype.Component;

@Component
public class AddCalculatorImpl implements Calculator {

	@Override
	public int calc(int a, int b) {
		return a + b;
	}

}
