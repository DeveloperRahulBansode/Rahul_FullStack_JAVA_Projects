package interfaces.implementation;

import interfaces.study.Validater;

public class ValidAge implements Validater {
	@Override
	public boolean isValid(String age) {
		Integer age1 = Integer.parseInt(age);

		return (age.matches("[0-9]*") && (age1 > 21 && age1 < 50)) ? true : false;

	}

}
