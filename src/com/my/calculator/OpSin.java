package com.my.calculator;

public class OpSin implements Operation {
int res;
	
	public double exec(double valueOne, double valueToo) {
		double res = Math.sin(valueOne);
        return (res);
	}
}

