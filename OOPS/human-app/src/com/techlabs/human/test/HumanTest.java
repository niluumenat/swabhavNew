package com.techlabs.human.test;

import com.techlabs.human.GenderCategory;
import com.techlabs.human.Human;

public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human("nilesh", GenderCategory.Male, 20);
		display(h1);
		System.out.println("After Eating:");
		h1.eat();
		display(h1);
		System.out.println("After Workout");
		h1.workOut();
		display(h1);

		
		Human h2 = new Human("nilam", GenderCategory.Female, 22, 1.2f, 55.3f);
		display(h2);

	}

	private static void display(Human h1) {
		System.out.println("Name: " + h1.getName() + " Gender Category is: " + h1.getGender() + " age is: "
				+ h1.getAge() + " Height is: " + h1.getHeight() + " Weight is: " + h1.getWeight() + " BMI is:"
				+ h1.calculateBMI() + " Body Category is: " + h1.getBodyCategory());
	}
}