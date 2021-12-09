package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginpage {

	private WebDriver driver;

	public loginpage(WebDriver driver) {
		this.driver=driver;
	}

	public void login() {
		System.out.println("login succsful");
		driver.get("https://www.google.com");
		
	}

	public void asset() {
		System.out.println("login succsful");
		Assert.assertEquals(driver.getTitle(), "login");
		//System.out.println(driver.getTitle());
		
	}
	
	

}
