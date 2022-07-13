package com.operations;

import com.operations.OP;
public class Addition implements OP {
	public String name = "Addition";
	@Override
	public int calculate(int a, int b) {
		return a+b;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
