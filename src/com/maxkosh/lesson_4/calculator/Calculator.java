package com.maxkosh.lesson_4.calculator;

public class Calculator {
	private String mathExpression;
	private int firstNumber;
	private int secondNumber;
	private char mathSign;


	public void setMathExpression(String mathExpression) {
		this.mathExpression = mathExpression;
	}

	private void expressionParser() {
		String [] operands = mathExpression.split(" ");
		firstNumber = Integer.parseInt(operands[0]);
		mathSign = operands[1].charAt(0);
		secondNumber = Integer.parseInt(operands[2]);
	}

 	public void calculate() {
		expressionParser();

		switch(mathSign) {
			case '+':
				System.out.println("Result is: " + (firstNumber + secondNumber));
				break;
			case '-':
				System.out.println("Result is: " + (firstNumber - secondNumber));
				break;
			case '*':
				System.out.println("Result is: " + (firstNumber * secondNumber));
				break;
			case '/':
				System.out.println("Result is: " + ((double)firstNumber / secondNumber));
				break;
			case '%':
				System.out.println("Result is: " + (firstNumber % secondNumber));
				break;
			case '^':
				pow();
				break;
			default:
				System.out.println("Ошибка");
		}
	}

	private void pow () {
		int result = 1;
		for(int i = 0; i < secondNumber; i++) {
			result *= firstNumber;
		}
		System.out.println("Result is: " + result);
	}
}