package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String URL = "http://localhost:8080/examples/jsp/cal/login.html";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("test");
		driver.findElement(By.name("email")).sendKeys("test");
		driver.findElement(By.name("action")).click();
		Thread.sleep(2000);
		
		WebElement tble = driver.findElement(By.xpath("//table[@bgcolor='lightblue']"));
		List<WebElement> ROWS = tble.findElements(By.xpath(".//tr"));
		System.out.println(ROWS.size());
		for (int cnt = 1; cnt < ROWS.size(); cnt++) {
			List<WebElement> COLS = ROWS.get(cnt).findElements(By.tagName("td"));
			System.out.println(COLS.get(0).findElement(By.tagName("a")).getText());
			
		}
		

	}

}
