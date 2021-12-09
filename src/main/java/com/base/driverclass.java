package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverclass {
	
	static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
	
	public WebDriver init(String browser) {
		
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tdriver.set(new ChromeDriver());
		} else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			tdriver.set(new FirefoxDriver());
		}
		return getDriver();
		
	}
	
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
	
	
	

}
