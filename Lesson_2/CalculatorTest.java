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

			while(inputAnswer.equals("Да")) {
				System.out.print("Хотите продолжить? [Да/Нет]: ");
				inputAnswer = scan.nextLine();

				if(inputAnswer.equals("Да") || inputAnswer.equals("Нет")) {
					break;
				} else {
					inputAnswer = "Да";
				}
			}
		}
	}
}