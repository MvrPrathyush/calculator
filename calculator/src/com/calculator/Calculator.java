package com.calculator;

public class Calculator {
	private int number1;
	private int number2;
	
	public Calculator(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int add(int... values) {
		int sum = 0;
		for (int eachNum: values) {
			sum = sum + eachNum;
		}
		
		return sum;
	}

	public int multiply() {
		return number1*number2;
	}
	
	
	
	
	
	
	
	
}
