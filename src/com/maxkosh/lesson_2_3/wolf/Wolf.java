package com.maxkosh.lesson_2_3.wolf;

public class Wolf {
 	private String sex;
 	private String name;
 	private int weight;
 	private int age;
 	private String color;

 	public void walk() {

 	}

 	public void run() {

 	}

 	public void sit() {

 	}

 	public String howl() {
 		return "Whoooooo";
 	}

 	public void hunt() {

 	}

 	public String getSex() {
 		return sex;
 	}

 	public void setSex(String sex) {
 		this.sex = sex;
 	}

 	public String getName() {
 		return name;
 	}

 	public void setName(String name) {
 		this.name = name;
 	}

 	public int getWeight() {
 		return weight;
 	}

 	public void setWeight(int weight) {
 		this.weight = weight;
 	}

 	public int getAge() {
 		return age;
 	}

 	public void setAge(int age) {
 		if (age > 8) {
 			System.out.println("Некорректный возраст.");
 		} else {
 			this.age = age;
 		}
 	}

 	public String getColor() {
 		return color;
 	}

 	public void setColor(String color) {
 		this.color = color;
 	}
} 