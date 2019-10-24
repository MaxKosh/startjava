import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);

	static int playersCount = 1;
	int hiddenNumber = (int) (Math.random() * 101);

	public String enterPlayerName() {
		System.out.print("Введите имя " + playersCount + "-го игрока: ");
		String playerName = scan.nextLine();
		playersCount++;
		return playerName;
	}

	public boolean startTheGame(Player player) {
		System.out.print(player.getName() + ", введите число от 0 до 100: ");
		player.setNumber(scan.nextInt());

		if(player.getNumber() == hiddenNumber) {
			System.out.println(player.getName() + ", вы угадали! (" + hiddenNumber + ")");
			scan.nextLine();
			return true;
		} else if(player.getNumber() > hiddenNumber) {
			System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер (" + hiddenNumber + ")");
			return false;
		} else {
			System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер (" + hiddenNumber + ")");
			return false;
		}
	}

	public boolean repeatTheGame() {
		while(true) {
		System.out.print("Хотите сыграть еще раз? [Да/Нет]: ");
			String answer = scan.nextLine();
			if(answer.equals("Да")) {
				hiddenNumber = (int) (Math.random() * 101);
				return true;
			} else if(answer.equals("Нет")) {
				return false;
			} else { 
				continue;
			}
		}
	}
}