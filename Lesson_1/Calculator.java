public class Calculator {
	public static void main(String[] args) {

		//Реализация калькулятора без ввода данных через консоль
		int firstInputNumber = 10;
		int secondInputNumber = 6;
		char sign = '%';
		int result;
		double devisionResult;

		if(sign == '+') {
			result = firstInputNumber + secondInputNumber;
			System.out.println("Result is: " + result);
		}
		else if(sign == '-') {
			result = firstInputNumber - secondInputNumber;
			System.out.println("Result is: " + result);
		}
		else if(sign == '*') {
			result = firstInputNumber * secondInputNumber;
			System.out.println("Result is: " + result);
		}
		else if(sign == '/') {
			devisionResult = (double) firstInputNumber / secondInputNumber;
			System.out.println("Result is: " + devisionResult);
		}
		else if(sign == '^') {
			result = firstInputNumber;
			for(int i = 2; i <= secondInputNumber; i++) {
				result = result * firstInputNumber;
			}
			
			System.out.println("Result is: " + result);
		}
		else if(sign == '%') {
			result = firstInputNumber % secondInputNumber;
			System.out.println("Result is: " + result);

		}

	}
}