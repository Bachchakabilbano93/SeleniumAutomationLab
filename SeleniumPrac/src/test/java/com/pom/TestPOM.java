package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPOM {
	
	static LoginClass login;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		login = new LoginClass(driver);
//		login.Login();
		login.Login("test","test@test.com");
//		login.ClearAllFields();
		
		

	}

}
