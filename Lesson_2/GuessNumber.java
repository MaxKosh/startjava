import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
	private Player firstPlayer;
	private Player secondPlayer;
	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player firstPlayer, Player secondPlayer){
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void startGame() {
		int hiddenNumber = (int) (Math.random() * 101);
		while(true) {
			System.out.print(firstPlayer.getName() + ", введите число от 0 до 100: ");
			firstPlayer.setNumber(scan.nextInt());
			if(firstPlayer.getNumber() == hiddenNumber) {
				System.out.println(firstPlayer.getName() + ", вы угадали! (" + hiddenNumber + ")");
				scan.nextLine();
				break;
			} else if(firstPlayer.getNumber() > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер (" + hiddenNumber + ")");
			} else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер (" + hiddenNumber + ")");
			}

			System.out.print(secondPlayer.getName() + ", введите число от 0 до 100: ");
			secondPlayer.setNumber(scan.nextInt());
			if(secondPlayer.getNumber() == hiddenNumber) {
				System.out.println(secondPlayer.getName() + ", вы угадали! (" + hiddenNumber + ")");
				scan.nextLine();
				break;
			} else if(secondPlayer.getNumber() > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер (" + hiddenNumber + ")");
			} else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер (" + hiddenNumber + ")");
			}
		}
	}	
}