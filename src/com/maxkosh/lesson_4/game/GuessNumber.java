package com.maxkosh.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Player firstPlayer;
	private Player secondPlayer;

	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player firstPlayer, Player secondPlayer){
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void startGame() {
		firstPlayer.setTriesCount(0);
		secondPlayer.setTriesCount(0);

		int hiddenNumber = (int) (Math.random() * 101);
		for(int i = 0; i < 10; i++) {
			if(startGuess(firstPlayer, i, hiddenNumber) || startGuess(secondPlayer, i ,hiddenNumber)) {
				break;
			}
			if(i == 9) {
				System.out.println("У игроков " + firstPlayer.getName() + ", " + secondPlayer.getName() + " закончились попытки.");
				showEnterNumbers();
			}
		}
	}

	private void showEnterNumbers() {
		int[] copyOfArray1 = Arrays.copyOf(firstPlayer.getInputNumbersArray(), firstPlayer.getTriesCount());
		System.out.print(firstPlayer.getName() + " ввёл числа: ");
		for(int k : copyOfArray1) {
			System.out.print(k + " ");
		}
		System.out.println(" ");

		int[] copyOfArray2 = Arrays.copyOf(secondPlayer.getInputNumbersArray(), secondPlayer.getTriesCount());
		System.out.print(secondPlayer.getName() + " ввёл числа: ");
		for(int j : copyOfArray2) {
			System.out.print(j + " ");
		}
		System.out.println(" ");
	}

	private boolean startGuess(Player player, int numberOfTry, int hiddenNumber) {
		System.out.print(player.getName() + ", введите число от 0 до 100: ");
		player.setInputNumbersArray(numberOfTry, scan.nextInt());
		player.setTriesCount(player.getTriesCount() + 1);

		if(player.getInputNumbersArray(numberOfTry) == hiddenNumber) {
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getInputNumbersArray(numberOfTry) + " с попытки " + player.getTriesCount());
			showEnterNumbers();
			scan.nextLine();
			return true;
		} else if(player.getInputNumbersArray(numberOfTry) > hiddenNumber) {
			System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер (" + hiddenNumber + ")");
			return false;
		} else {
			System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер (" + hiddenNumber + ")");
			return false;
		}
	}
}