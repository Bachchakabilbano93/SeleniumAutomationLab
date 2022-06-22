package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibScreenshot {

	public static void main(String[] args) throws IOException {
		
		String URL = "https://www.rediff.com/";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println(driver.getTitle());
		TakesScreenshot ss = ((TakesScreenshot)driver);
		File ssfile = ss.getScreenshotAs(OutputType.FILE);
		
		
		File evfile = new File("/home/abirbhattachary/tmpFiles/Evid1.png");
		evfile.createNewFile();
		FileUtils.copyFile(ssfile, evfile);
		
	}

}
