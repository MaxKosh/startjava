package com.maxkosh.lesson_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int triesCount;
	int[] inputNumbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public void setInputNumbers(int index, int inputNumber) {
		inputNumbers[index] = inputNumber;
	}

	public int[] getInputNumbers() {
		int[] copy = Arrays.copyOf(inputNumbers, triesCount);
		return copy;
	}

	public String getName() {
		return name;
	}

	public void setTriesCount(int triesCount) {
		this.triesCount = triesCount;
	}

	public int getTriesCount() {
		return triesCount;
	}
}