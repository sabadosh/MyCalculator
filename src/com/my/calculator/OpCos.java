package com.my.calculator;

public class OpCos implements Operation {
int res;
	
	public double exec(double valueOne, double valueToo) {
		double res = Math.cos(valueOne);
        return (res);
	}
}
