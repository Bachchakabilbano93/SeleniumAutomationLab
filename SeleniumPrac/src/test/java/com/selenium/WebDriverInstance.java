package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String URL = "https://www.google.com/";
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Images")).click();
//		driver.findElement(By.partialLinkText("Images")).click();
		driver.findElement(By.className("tdPRye")).click();
		driver.findElement(By.partialLinkText("Upload an image")).click();
		driver.findElement(By.name("encoded_image")).click();

	}

}
