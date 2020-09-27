package userRegistrationUC11;
import java.util.*;
import org.junit.Test;

import static org.junit.Assert.*;
public class UserRegistrationTest {
	public static UserRegistration ur=null;
	@Test
	public void TestEmail_trueCase1() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc-100@1.com");
		assertTrue(result);
	}
	@Test
	public void TestEmail_trueCase2() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc.100@gmail.com");
		assertTrue(result);
	}
	@Test
	public void TestEmail_trueCase3() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc111@abc.com");
		assertTrue(result);
	}
	@Test
	public void TestEmail_trueCase4() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc+100@1.com.in");
		assertTrue(result);
	}
	@Test
	public void TestEmail_falseCase1() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc.@gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase2() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc@gmail.c");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase3() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc@gmail.com.1");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase4() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail(".abc.@gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase5() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc.@.gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase6() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc@%*.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase7() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc()*@gmail@gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase8() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("abc.@gmail.com.in.aa");
		assertFalse(result);
	}
}
