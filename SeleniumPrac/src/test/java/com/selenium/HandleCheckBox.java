package com.selenium;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		String URL = "http://localhost:8080/examples/jsp/checkbox/check.html"; //check only fruits in the array
		String arrayfruits[] = {"melons","grapes"}; 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		Thread.sleep(4000);
		
//		Other fruits are unchecked
		List<WebElement> lstCH = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement ch : lstCH) {
//			System.out.println(ch.getAttribute("value"));
//			boolean CHECK = false;
			String reqfruitName = ch.getAttribute("value");
			if (Arrays.asList(arrayfruits).contains(reqfruitName)) {
//				CHECK = true;
				if (!ch.isSelected()) {
					ch.click();
					
				}
				
			}
			else {
				if (ch.isSelected()) {
					ch.click();
				}
			}
			
		}
		
		

	}

}
