package com.maxkosh.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String inputAnswer = "Да";

		System.out.println("Калькулятор запущен.");
		
		while(inputAnswer.equals("Да")) {
			System.out.print("Введите математическое выражение: ");
			calc.setMathExpression(scan.nextLine());

			calc.calculate();

			do {
				System.out.print("Хотите продолжить? [Да/Нет]: ");
				inputAnswer = scan.nextLine();
			} while(!inputAnswer.equals("Да") && !inputAnswer.equals("Нет"));
		}

		System.out.println("Калькулятор завершен.");
	}
}