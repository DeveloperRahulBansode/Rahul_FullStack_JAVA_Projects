package interfaces.implementation;

import interfaces.study.Validater;

public class ValidMobileNumber implements Validater {

	@Override
	public boolean isValid(String number) {
		return (number.matches("[6-9][0-9]{9}") ? true : false);
	}

}
