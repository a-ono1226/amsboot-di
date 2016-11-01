package com.legendapl.app;

import lombok.Data;

@Data
public class Argument {
	//finalなので、setterは実装されない（コンストラクタのみ）
	private final int a;
	private final int b;
}
