package com.my.calculator;

public class OpFactorial implements Operation{
	double res = 1;
	public double exec(double valueOne, double valueToo) {
		if (valueOne == 0){
			res = 0;
		}
		else {
			if (valueOne<0){
				System.out.println("Ви ввели від'ємне значення! Була виконана операція модулю.");
				valueOne = Math.abs(valueOne); 
			}
					while (valueOne>0){
						res*=valueOne--;
		   }
		}
       return (res);
    }
}
