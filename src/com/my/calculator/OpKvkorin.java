package com.my.calculator;

public class OpKvkorin implements Operation {
	double res;
	
	public double exec(double valueOne, double valueToo) {
		double res = Math.sqrt(valueOne);
        return (res);
	}
}
