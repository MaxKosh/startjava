import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String inputAnswer = "Да";
		
		while(inputAnswer.equals("Да")) {
			System.out.print("Введите первое число: ");
			int firstInputNumber = scan.nextInt();

			scan.nextLine();

			System.out.print("Введите знак математической операции: ");
			String inputSign = scan.nextLine();

			System.out.print("Введите второе число: ");
			int secondInputNumber = scan.nextInt();

			calc.calculate(firstInputNumber, inputSign, secondInputNumber);

			scan.nextLine();

			do {
				System.out.print("Хотите продолжить? [Да/Нет]: ");
				inputAnswer = scan.nextLine();

				if(inputAnswer.equals("Нет")) {
					break;
				} 
			} while(!inputAnswer.equals("Да"));
		}
	}
}