package com.amazon.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonPOM {
	WebDriver driver;
	
	public amazonPOM(WebDriver driver) {
		this.driver = driver;
	}
	private By Signinbtn = By.id("nav-link-accountList"); 
	private String URL = "https://www.amazon.in/";
	
	public void LoginAbir() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(Signinbtn).click();
		
	}
}
