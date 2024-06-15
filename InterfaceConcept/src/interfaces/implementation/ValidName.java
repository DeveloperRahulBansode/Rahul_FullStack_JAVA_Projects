package interfaces.implementation;

import interfaces.study.Validater;

public class ValidName implements Validater {

	@Override
	public boolean isValid(String property) {
		return (property.length()>8?true:false);
	}
	
	

}
