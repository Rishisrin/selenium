package test_cases;

import org.testng.annotations.Test;

import testingproj_pages.login;

public class Test_login extends browser_init{
	
@Test
public void log() throws InterruptedException{
	login log= new login(driver);
	log.login("rishisree425@gmail.com", "qwerty");
}




}
