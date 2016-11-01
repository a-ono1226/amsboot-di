package com.legendapl.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Frontend {
	// 明示的にgetBeanではなく、DIコンテナに自動でワイヤリングしてもらう
	@Autowired
	ArgumentResolver argres;
	@Autowired
	Calculator calc;

	public void run() {
		System.out.println("Enter 2 numbers like 'a b' : ");
		Argument argsIn = argres.resolve(System.in);
		System.out.println("result = " + calc.calc(argsIn.getA(), argsIn.getB()));
	}
}
