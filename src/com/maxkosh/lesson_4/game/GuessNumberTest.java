package com.maxkosh.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Игра началась. У вас 10 попыток!");
		System.out.print("Введите имя первого игрока: ");
		Player firstPlayer = new Player(scan.nextLine());
		System.out.print("Введите имя второго игрока: ");
		Player secondPlayer = new Player(scan.nextLine());

		GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);

		String inputAnswer = "Да";
		while(inputAnswer.equals("Да")) {
			guessNumber.startGame();
			do {
				System.out.print("Хотите продолжить? [Да/Нет]: ");
				inputAnswer = scan.nextLine();
			} while(!inputAnswer.equals("Да") && !inputAnswer.equals("Нет"));
		}
	}
}