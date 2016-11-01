package com.legendapl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.legendapl.app.Argument;
import com.legendapl.app.ArgumentResolver;
import com.legendapl.app.Calculator;

//@SpringBootApplicationに各アノテーションが内包されている
@SpringBootApplication
public class AmsbootDiApplication implements CommandLineRunner {
	// ComandLineRunnderはコマンドラインアプリケーション用のインタフェース
	@Autowired
	ArgumentResolver argres;
	@Autowired
	Calculator calc;

	public static void main(String[] args) {
		SpringApplication.run(AmsbootDiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Frontendクラスの実行処理をこちらに移す
		System.out.println("Enter 2 numbers like 'a b' : ");
		Argument argsIn = argres.resolve(System.in);
		System.out.println("result = " + calc.calc(argsIn.getA(), argsIn.getB()));
	}
}
