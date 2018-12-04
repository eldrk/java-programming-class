package edu.iot.part3.chapter15_20180807;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class AuthenticationTest {
	Authentication auth;
	
	@Before
	public void setup() {
		auth = new Authentication();
	}
	
	@Test
	public void testLoginSuccess() throws LoginFailException{
		User user = auth.login("spring","12");
		assertNotNull(user);
		assertEquals(user.getUserId(),"spring");
	}
	
	@Test(expected=LoginFailException.class)
	public void testLoginFailUserId() throws LoginFailException{
		auth.login("spr","12");
	}
	
	@Test(expected=LoginFailException.class)
	public void testLoginFailPassword() throws LoginFailException{
		auth.login("spring","1234");
	}
}
