package com.maxkosh.lesson_1.unicode;

//вывод в консоль Unicode символов
public class Unicode {
	public static void main(String[] args) {
		char unicodeSymbol;

		for(unicodeSymbol = 9398; unicodeSymbol <= 10178; unicodeSymbol++) {
			System.out.println(unicodeSymbol);
		}
		
		for(unicodeSymbol = 33; unicodeSymbol <= 126; unicodeSymbol++) {
			System.out.println(unicodeSymbol);
		}
	}
}