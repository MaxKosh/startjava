package com.maxkosh.lesson_4.game;

public class Player {
	private String name;
	private int triesCount;
	private int[] inputNumbersArray = new int[10];

	public void setInputNumbersArray (int arraySlot, int inputNumber) {
		this.inputNumbersArray[arraySlot] = inputNumber;
	}

	public int[] getInputNumbersArray() {
		return inputNumbersArray;
	}

	public int getInputNumbersArray(int arraySlot) {
		return inputNumbersArray[arraySlot];
	}

	public Player(String name) {
		this.name = name;
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