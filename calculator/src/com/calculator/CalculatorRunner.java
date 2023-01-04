package com.calculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		Calculator calculator  = new Calculator(2,3);
		System.out.println(calculator.add(1,2,3,4,5));
		System.out.println(calculator.multiply());
		

	}

}
