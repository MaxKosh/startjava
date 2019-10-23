import java.lang.Math;
import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GuessNumber guessNumber = new GuessNumber();
		String inputAnswer = "Да";
		
		while(inputAnswer.equals("Да")) {
			int hiddenNumber = (int) (Math.random() * 101);
		
			System.out.print("Введите имя 1-го игрока: ");
			String firstPlayerName = scan.nextLine();
			System.out.print("Введите имя 2-го игрока: ");
			String secondPlayerName = scan.nextLine();

			Player firstPlayer = new Player(firstPlayerName);
			Player secondPlayer = new Player(secondPlayerName);

			boolean isNormalAnswer = false;
			while(inputAnswer.equals("Да") && !isNormalAnswer) {
				System.out.print(firstPlayer.getName() + ", введите число от 0 до 100: ");
				firstPlayer.setNumber(scan.nextInt());
				if(guessNumber.guess(firstPlayer.getNumber(), hiddenNumber)) {
					while(true) {
						System.out.print(firstPlayer.getName() + " выиграл! Сыграем еще раз? [Да/Нет]:");
						scan.nextLine();
						inputAnswer = scan.nextLine();
							if(inputAnswer.equals("Да")){
								isNormalAnswer = true;
								break;
							} else if (inputAnswer.equals("Нет")) {
								isNormalAnswer = true;
								break;
							}
					}
				break;
				}

				System.out.print(secondPlayer.getName() + ", введите число от 0 до 100: ");
				secondPlayer.setNumber(scan.nextInt());
				if(guessNumber.guess(secondPlayer.getNumber(), hiddenNumber)) {
					while(true) {
						System.out.print(secondPlayer.getName() + " выиграл! Сыграем еще раз? [Да/Нет]:");
						scan.nextLine();
						inputAnswer = scan.nextLine();
						if(inputAnswer.equals("Да")){
							isNormalAnswer = true;
							break;
						} else if (inputAnswer.equals("Нет")) {
							isNormalAnswer = true;
							break;
						}
					}
				break;
				}
			}
		}
	}
}