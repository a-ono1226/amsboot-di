package com.legendapl;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.legendapl.app.Calculator;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class AmsbootDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AmsbootDiApplication.class, args);

		//標準入力から数値を２つ入力する処理
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 2 numbers like 'a b' : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		scn.close();

		//Calculatorの実装クラスをgetBeanで取得
		//実装クラスはAppConfigの@BeanでDIコンテナに定義されているので、
		//ここでは意識する必要がない
		Calculator calc = context.getBean(Calculator.class);

		System.out.println("result = " +  calc.calc(a, b));

	}
}
