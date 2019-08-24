package com.techlabs.human;

public class Human {
	private final String name;
	private final GenderCategory gender;
	private final int age;
	private float height;
	private float weight;

	public Human(String name, GenderCategory gender, int age, float height, float weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Human(String name, GenderCategory gender, int age) {
		this(name, gender, age, 5, 50);
	}

	public String getName() {
		return name;
	}

	public GenderCategory getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public void eat() {
		weight = weight + 0.02f * weight;
	}

	public void workOut() {
		weight = weight - 0.01f * weight;
		height = height + 0.005f * height;
	}

	public float calculateBMI() {
		float bmi;
		bmi = weight / (height * height);
		return bmi;
	}

	public String getBodyCategory() {
		float bmi = calculateBMI();
		String bodyCategory = "Obese";
		if (bmi < 18.5) {
			bodyCategory = "UnderWeight";
		}
		if (bmi > 18.5 && bmi < 24.9) {
			bodyCategory = "Normal";
		}
		if (bmi > 25 && bmi < 29.9) {
			bodyCategory = "OverWeight";
		}

		return bodyCategory;
	}
}
