package com.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {
	
	WebDriver driver;
	
	public LoginClass(WebDriver driver) {
		this.driver = driver;
	}
	
	private By name = By.name("name");
	private By email = By.name("email");
	private By submit = By.name("action");
	private String URL = "http://localhost:8080/examples/jsp/cal/login.html";
	
	public void Login() {
		driver.get(URL);
		driver.findElement(name).sendKeys("test");
		driver.findElement(email).sendKeys("test");
		driver.findElement(submit).click();
		
	}
	
	public void Login(String strname, String stremail) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(name).sendKeys(strname);
		Thread.sleep(2000);
		driver.findElement(email).sendKeys(stremail);
		Thread.sleep(1000);
		driver.findElement(submit).click();
		
	}
	
	public void ClearAllFields() throws InterruptedException {
		driver.get(URL);
		try {
			Thread.sleep(8000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(name).clear();
		driver.findElement(email).clear();
		
	}

	
	
	

}
