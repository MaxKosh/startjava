package com.maxkosh.lesson_2_3.calculator;

public class Calculator {
	public void calculate (int firstNumber, String sign, int secondNumber) {
		switch(sign) {
			case ("+"): 
				System.out.println("Result is: " + (firstNumber + secondNumber));
				break;
			case ("-"): 
				System.out.println("Result is: " + (firstNumber - secondNumber));
				break;
			case ("*"): 
				System.out.println("Result is: " + (firstNumber * secondNumber));
				break;
			case ("/"): 
				System.out.println("Result is: " + ((double)firstNumber / secondNumber));
				break;
			case ("%"): 
				System.out.println("Result is: " + (firstNumber % secondNumber));
				break;
			case ("^"): 
				int result = 1;
				for(int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
				System.out.println("Result is: " + result);
				break;
		}
	}
}