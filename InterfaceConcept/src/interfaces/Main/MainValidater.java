package interfaces.Main;

import interfaces.implementation.ValidAge;
import interfaces.implementation.ValidEmail;
import interfaces.implementation.ValidName;
import interfaces.study.Validater;

public class MainValidater {

	public static void main(String[] args) {
		Validater valid = new ValidName();
		// Name validation
		String name = "rahul";
		if (valid.isValid(name)) {
			System.out.println(name + " " + "is Valid Property");
		} else {
			System.out.println(name + " " + "is Not Valid Property");
		}

		// Number Validation
		Validater validNumber = new ValidName();
		String number = "9876543210";
		if (validNumber.isValid(number)) {
			System.out.println(number + " " + "is Valid Number");
		} else {
			System.out.println(number + " " + "is Not Valid Mobile Number");
		}

		// Age Validation
		Validater validAge = new ValidAge();
		String age = "22";
		if (validAge.isValid(age)) {
			System.out.println(age + " " + "Age is Valid ");
		} else {
			System.out.println(age + " " + "Age is Not Valid");

		}
		// Email Validation
		Validater validEmail = new ValidEmail();
		String email = "rahul@gmail.com";
		if (validEmail.isValid(email)) {
			System.out.println(email + " " + "Email is Valid ");
		} else {
			System.out.println(email + " " + "Email is Not Valid");

		}

	}
}
