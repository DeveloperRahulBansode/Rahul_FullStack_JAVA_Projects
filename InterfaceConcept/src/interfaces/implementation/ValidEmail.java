package interfaces.implementation;

import interfaces.study.Validater;

public class ValidEmail implements Validater {

	@Override
	public boolean isValid(String email) {
		return (email.matches("[a-z 0-9]*@[a-z]*.[a-z]*") ? true : false);
	}
}
