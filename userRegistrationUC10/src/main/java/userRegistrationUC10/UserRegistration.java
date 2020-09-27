package userRegistrationUC10;
import java.util.*;
public class UserRegistration {

	public boolean validateFirstName(String fName) {
		boolean x = fName.matches("[A-Z][a-z]{2,}");
		return x;
	}	
	
	public boolean validateLastName(String lName) {
		boolean x = lName.matches("[A-Z][a-z]{2,}");
		return x;
	}
	
	public boolean validateEmail(String email) {
		boolean x = email.matches("[a-zA-Z0-9+_-]+(.[a-zA-Z0-9+_-]*)@([^\\s])+[.][\\w]{1,}([.][\\w]{3,}.?|[.][a-zA-Z]{2}.?)?");
		return x;
	}
	
	public boolean validatePhoneNumber(String pNumber) {
		boolean x = pNumber.matches("(91)[7-9][0-9]{9}");
		return x;
	}
	
	public boolean validatePassword(String password) {
		boolean x = password.matches("(?=.*[^\\w])(?=.*[0-9])(?=.*[A-Z])[^\\s].{8,}");
		return x;	
	}

}
