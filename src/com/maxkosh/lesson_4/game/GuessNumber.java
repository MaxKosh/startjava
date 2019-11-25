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
				showEnterNumbers();
			}
		}
		firstPlayer.setTriesCount(0);
		secondPlayer.setTriesCount(0);
	}

	private void showEnterNumbers() {
		System.out.print(firstPlayer.getName() + " ввёл числа: ");
		for(int k : firstPlayer.getInputNumbers()) {
			System.out.print(k + " ");
		}
		System.out.println(" ");

		System.out.print(secondPlayer.getName() + " ввёл числа: ");
		for(int j : secondPlayer.getInputNumbers()) {
			System.out.print(j + " ");
		}
		System.out.println(" ");
	}

	private void inputNumber(Player player, int numberOfTry) {
		System.out.print(player.getName() + ", введите число от 0 до 100: ");
		player.setInputNumbers(numberOfTry, scan.nextInt());
		player.setTriesCount(player.getTriesCount() + 1);
	}

	private boolean compareNumbers(Player player, int numberOfTry, int hiddenNumber) {
		if(player.getInputNumbers()[numberOfTry] == hiddenNumber) {
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getInputNumbers()[numberOfTry] + " с попытки " + player.getTriesCount());
			showEnterNumbers();
			scan.nextLine();
			return true;
		} else if(player.getInputNumbers()[numberOfTry] > hiddenNumber) {
			System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер (" + hiddenNumber + ")");
			return false;
		} else {
			System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер (" + hiddenNumber + ")");
			return false;
		}
	}
}