package com.legendapl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.legendapl.app.Argument;
import com.legendapl.app.ArgumentResolver;
import com.legendapl.app.Calculator;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class AmsbootDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AmsbootDiApplication.class, args);

		//ArgumentResolverの実装クラスをgetBeanで取得
		ArgumentResolver argres =  context.getBean(ArgumentResolver.class);

		System.out.println("Enter 2 numbers like 'a b' : ");
		Argument argsIn = argres.resolve(System.in);

		//Calculatorの実装クラスをgetBeanで取得
		//実装クラスはAppConfigの@BeanでDIコンテナに定義されているので、
		//ここでは意識する必要がない
		Calculator calc = context.getBean(Calculator.class);

		System.out.println("result = " +  calc.calc(argsIn.getA(), argsIn.getB()));

	}
}
