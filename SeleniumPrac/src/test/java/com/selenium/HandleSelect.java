package com.selenium;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		String URL = "http://localhost:8080/examples/jsp/sessions/carts.html"; //check only fruits in the array
		String arrayfruits[] = {"melons","grapes"}; 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
//		Thread.sleep(4000);
		
		Select selProd = new Select(driver.findElement(By.name("item")));
//		selProd.selectByIndex(0);
//		Thread.sleep(2000);
//		selProd.selectByIndex(2);
//		Thread.sleep(2000);
//		selProd.selectByIndex(4);
		Thread.sleep(2000);
		selProd.selectByVisibleText("NIN CD");
		Thread.sleep(2000);
		selProd.selectByVisibleText("Switch blade");
		Thread.sleep(2000);
		selProd.selectByVisibleText("Twin peaks tapes");
		

	}

}
