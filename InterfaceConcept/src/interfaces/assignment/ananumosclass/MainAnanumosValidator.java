
package interfaces.assignment.ananumosclass;

public class MainAnanumosValidator {

	public static void main(String[] args) {
		AnanumosValidator valid = new AnanumosValidator() {

			@Override
			public boolean validNumber(String number) {
				return (number.matches("[6-9][0-9]{9}") ? true : false);
			}

			@Override
			public boolean validName(String name) {
				return (name.length() >= 5) ? true : false;
			}

			@Override
			public boolean validEmailId(String email) {
				return (email.matches("[a-z][a-z]*@[a-z]*.[a-z]*") ? true : false);
			}

			@Override
			public boolean validAge(int age) {
				return (age > 18) ? true : false;
			}
		};
		// Name validation
		String name = "rahul";
		if (valid.validName(name)) {
			System.out.println(name + " " + "is Valid Property");
		} else {
			System.out.println(name + " " + "is Not Valid Property");
		}

		// Number Validation
		String number = "9876543210";
		if (valid.validNumber(number)) {
			System.out.println(number + " " + "is Valid Number");
		} else {
			System.out.println(number + " " + "is Not Valid Mobile Number");
		}

		// Age Validation
		int age = 22;
		if (valid.validAge(age)) {
			System.out.println(age + " " + "Age is Valid ");
		} else {
			System.out.println(age + " " + "Age is Not Valid");

		}
		// Email Validation
		String email = "rahul@gmail.com";
		if (valid.validEmailId(email)) {
			System.out.println(email + " " + "Email is Valid ");
		} else {
			System.out.println(email + " " + "Email is Not Valid");

		}
	}

}
