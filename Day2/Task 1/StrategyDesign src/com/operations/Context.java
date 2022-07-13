package com.operations;

public class Context {
	OP strategy;
	public Context (OP op) {
		this.strategy = op;
	}
	public String executeContext(int a, int b) {
		return "The "+strategy.getName()+" of " + a + " & " + b + " is: "+ strategy.calculate(a, b);
	}
}
