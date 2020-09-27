package userRegistrationUC11;

public class UserRegistration {
	public boolean validateEmail(String email) {
		boolean x = email.matches("[a-zA-Z0-9+_-]+(.[a-zA-Z0-9+_-]*)[^.][@]([\\w])+[.][\\w]{2,}([.][\\w]{3,}.?|[.][a-zA-Z]{2}.?)?");
		return x;
	}
}
