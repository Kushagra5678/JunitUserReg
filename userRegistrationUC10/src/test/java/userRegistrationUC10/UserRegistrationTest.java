package userRegistrationUC10;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class UserRegistrationTest {
	public static UserRegistration ur=null;
	@Test
	public void TestFirstName_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validateFirstName("Sunny");
		assertTrue(result);
	}
	@Test
	public void TestFirstName_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validateFirstName("sunny");
		assertFalse(result);
	}
	@Test
	public void TestLastName_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validateLastName("Agg");
		assertTrue(result);
	}
	@Test
	public void TestLastName_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validateLastName("agg");
		assertFalse(result);
	}
	@Test
	public void TestEmail_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc@gmail.com");
		assertTrue(result);
	}
	@Test
	public void TestEmail_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc.gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestPhoneNumber_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validatePhoneNumber("919876543456");
		assertTrue(result);
	}
	@Test
	public void TestPhoneNumber_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validatePhoneNumber("9198765434");
		assertFalse(result);
	}
	@Test
	public void TestPassword_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validatePassword("Boo9@123467");
		assertTrue(result);
	}
	@Test
	public void TestPassword_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validatePassword("Boo9123467");
		assertFalse(result);
	}
	
}
