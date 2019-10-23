

public class GuessNumber {
	
	public boolean guess(int inputNumber, int hiddenNumber) {
		if(inputNumber == hiddenNumber) {
			System.out.println("Вы угадали! (" + hiddenNumber + ")");
			return true;
		} else if(inputNumber > hiddenNumber) {
			System.out.println("Введенное вами число больше того, что загадал компьютер (" + hiddenNumber + ")");
			return false;
		} else {
			System.out.println("Введенное вами число меньше того, что загадал компьютер (" + hiddenNumber + ")");
			return false;
		}
	}
}