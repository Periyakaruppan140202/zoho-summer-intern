package com.operations;

import com.operations.OP;
public class Addition implements OP {

	@Override
	public int calculate(int a, int b) {
		return a+b;
	}

}
