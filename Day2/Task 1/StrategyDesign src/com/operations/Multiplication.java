package com.operations;

public class Multiplication implements OP {
	public String name = "Multiplication";
	@Override
	public int calculate(int a, int b) {
		return a*b;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
