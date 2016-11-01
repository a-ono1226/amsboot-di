package com.legendapl.app;

import java.io.InputStream;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class ScannerArgumentResolverImpl implements ArgumentResolver {

	@Override
	public Argument resolve(InputStream stream) {
		// 標準入力から数値を２つ入力する処理
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		scn.close();
		return new Argument(a, b);
	}

}
