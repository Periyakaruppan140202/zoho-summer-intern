package com.operations;

public class Operation {
	public static OP getInstance(String str) {
		if(str.equals("add")) {
			return new Addition();
		}
		else if(str.equals("sub")) {
			return new Subtraction();
		}
		else {
			return new Multiplication();
		}
	}
}
