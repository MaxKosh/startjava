public class MyFirstGame {
	public static void main(String[] args) {
		
		//Компьютер загадывает число от 0 до 100, пользователь угадывает
		//Игра продолжается до тех пор, пока число не угадано
		int hiddenNumber = 50;
		int inputNumber = 50;
		boolean isGameOn = true;

		while(isGameOn) {
			if(inputNumber == hiddenNumber) {
				System.out.println("Вы угадали!");
				isGameOn = false;
			}
			else if (inputNumber > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				break; //используется для выхода из цикла, так как нет ввода с клавиатуры
			}
			else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				break; //используется для выхода из цикла, так как нет ввода с клавиатуры
			}
		}
	}
}