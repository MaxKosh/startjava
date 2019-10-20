//Реализация калькулятора без ввода данных через консоль
public class Calculator {
	public static void main(String[] args) {
		int firstInputNumber = 10;
		int secondInputNumber = 6;
		char sign = '^';

		if(sign == '+') {
			System.out.println("Result is: " + (firstInputNumber + secondInputNumber));
		} else if(sign == '-') {
			System.out.println("Result is: " + (firstInputNumber - secondInputNumber));
		} else if(sign == '*') {
			System.out.println("Result is: " + (firstInputNumber * secondInputNumber));
		} else if(sign == '/') {
			System.out.println("Result is: " + ((double)firstInputNumber/secondInputNumber));
		} else if(sign == '^') {
			int result = firstInputNumber;
			for(int i = 2; i <= secondInputNumber; i++) {
				result *= firstInputNumber;
			}
			System.out.println("Result is: " + result);
		} else if(sign == '%') {
			System.out.println("Result is: " + (firstInputNumber % secondInputNumber));
		}
	}
}