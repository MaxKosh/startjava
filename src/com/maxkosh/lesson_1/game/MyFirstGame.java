package com.maxkosh.lesson_1.game;

//Компьютер загадывает число от 0 до 100, пользователь угадывает
//Игра продолжается до тех пор, пока число не угадано
public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 50;
		int inputNumber = 35;

		while(inputNumber != hiddenNumber) {
			if(inputNumber > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				inputNumber--;
			} else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				inputNumber++;
			}
		}
		System.out.println("Вы угадали!");
	}
}