package com.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "https://www.amazon.in/";
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("twotabsearchtextbox"))));
		
//Error		WebDriverWait wait = new WebDriverWait(driver, 4);
//			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("twotabsearchtextbox1"))));
		
//		WebDriverWait wait = new WebDriverWait(driver, 4);
//		try {
//			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("twotabsearchtextbox1")));
//		} catch (TimeoutException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

}
