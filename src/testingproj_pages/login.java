package testingproj_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {

public WebDriver driver;
	
	public login(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id='navbar']/ul/li[7]/a")
	public WebElement login_btn;
	
	@FindBy(id="bG9naW5Vc2VybmFtZUVsZW1lbnQ")
	public WebElement user_name;
	
	@FindBy(id="bG9naW5QYXNzd29yZEVsZW1lbnQ")
	public WebElement paswrd;
	
	@FindBy(id="bG9naW5CdG4")
	public WebElement sub_btn;
	
	
	public void login(String username, String password) throws InterruptedException{
		login_btn.click();
		user_name.sendKeys(username);
		paswrd.sendKeys(password);
		sub_btn.click();
		Thread.sleep(3000);
	}
	
	
}
