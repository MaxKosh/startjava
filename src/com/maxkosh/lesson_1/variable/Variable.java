package com.maxkosh.lesson_1.variable;

public class Variable {
	public static void main(String[] args) {
		byte coresCount = 4;
		short graphicsMemory = 1536;
		int pixelsCount = 2073600;
		long procFreq = 2300000000L;
		float ssdFreeSpace = 300.63f;
		double ssdTotalSpace = 499.90;
		char procName = 'i';
		boolean isSwitchedOn = true;

		System.out.println("Cores count = " + coresCount + "\nGraphics Memory = " + graphicsMemory +
		 "\nPixels Count = " + pixelsCount + "\nProcessor Frequency = " + procFreq + 
		 "\nSSD FreeSpace = " + ssdFreeSpace + "\nSSD TotalSpace = " + ssdTotalSpace +
		 "\nProcessor Name = " + procName + "7" + "\nIs Switched ON = " + isSwitchedOn);
	}
}