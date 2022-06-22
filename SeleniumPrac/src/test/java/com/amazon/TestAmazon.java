package com.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazon {
	
	public static void main(String[] args) throws InterruptedException {
		String URL = "https://www.amazon.in/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		List<WebElement> lstDiv = driver.findElements(By.xpath("//div[contains(@class,'s-card-container')]"));
		for (WebElement parentDiv : lstDiv) {
			List<WebElement> lstLnks = parentDiv.findElements(By.xpath(".//a[contains(@class,'s-underline-link-text')]"));
			if (lstLnks.size()> 0) {
				System.out.println(lstLnks.get(0).getText());
				
			}
			
		}
	}

}
