import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
	private Player firstPlayer;
	private Player secondPlayer;

	public GuessNumber(Player firstPlayer, Player secondPlayer){
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	Scanner scan = new Scanner(System.in);

	public void startGame() {
		int hiddenNumber = (int) (Math.random() * 101);
		while(true) {
			System.out.print("Введите число от 0 до 100: ");
			int number = scan.nextInt();
			if(number == hiddenNumber) {
				System.out.println("Вы угадали! (" + hiddenNumber + ")");
				scan.nextLine();
				break;
			} else if(number > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер (" + hiddenNumber + ")");
			} else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер (" + hiddenNumber + ")");
			}
		}
	}	
}