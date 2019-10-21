import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		boolean isFinished = false;
		while(true) {
			System.out.print("Введите первое число: ");
			int firstInputNumber = scan.nextInt();

			String emptyLineKeeper = scan.nextLine(); //фиктивный стринг для того, чтобы отловить \n

			System.out.print("Введите знак математической операции: ");
			String inputSign = scan.nextLine();

			System.out.print("Введите второе число: ");
			int secondInputNumber = scan.nextInt();

			calc.mathResult(firstInputNumber, inputSign, secondInputNumber);

			emptyLineKeeper = scan.nextLine(); //фиктивный стринг для того, чтобы отловить \n

			while(true) {
				System.out.print("Хотите продолжить? [Да/Нет]: ");
				String inputAnswer = scan.nextLine();

				if(inputAnswer.equals("Да")) {
					break;
				} else if(inputAnswer.equals("Нет")) {
					isFinished = true;
					break;
				} else {
					continue;
				}
			}

			if(isFinished) {
				scan.close();
				break;
			}
		}
	}
}