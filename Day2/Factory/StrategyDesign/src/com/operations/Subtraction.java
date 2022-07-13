package com.operations;

public class Subtraction implements OP {
	public String name = "Subtraction";
	@Override
	public int calculate(int a, int b) {
		return a-b;
	}
	@Override
	public String getName() {
		return this.name;
	}
	

}
