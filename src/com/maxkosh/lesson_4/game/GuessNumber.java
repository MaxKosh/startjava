package com.maxkosh.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {
	private Player firstPlayer;
	private Player secondPlayer;
	private int hiddenNumber;

	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void startGame() {
		hiddenNumber = (int) (Math.random() * 101);

		for(int i = 0; i < 10; i++) {
			inputNumber(firstPlayer, i);
			if(compareNumbers(firstPlayer, i, hiddenNumber)) {
				break;
			}
			inputNumber(secondPlayer, i);
			if(compareNumbers(secondPlayer, i, hiddenNumber)) {
				break;
			}
			if(i == 9) {
				System.out.println("У игроков " + firstPlayer.getName() + ", " + secondPlayer.getName() + " закончились попытки.");
				showEnterNumbers(firstPlayer);
				showEnterNumbers(secondPlayer);
			}
		}
		firstPlayer.setTriesCount(0);
		secondPlayer.setTriesCount(0);
	}

	private void inputNumber(Player player, int numberOfTry) {
		System.out.print(player.getName() + ", введите число от 0 до 100: ");
		player.setInputNumber(numberOfTry, scan.nextInt());
	}

	private boolean compareNumbers(Player player, int numberOfTry, int hiddenNumber) {
		int number = player.getInputNumbers()[numberOfTry];
		if(number == hiddenNumber) {
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getInputNumbers()[numberOfTry] + " с попытки " + player.getTriesCount());
			showEnterNumbers(firstPlayer);
			showEnterNumbers(secondPlayer);
			scan.nextLine();
			return true;
		} else if(number > hiddenNumber) {
			System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер (" + hiddenNumber + ")");
		} else {
			System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер (" + hiddenNumber + ")");
		}
		return false;
	}

	private void showEnterNumbers(Player player) {
		System.out.print(player.getName() + " ввёл числа: ");
		for(int k : player.getInputNumbers()) {
			System.out.print(k + " ");
		}
		System.out.println(" ");
	}
}