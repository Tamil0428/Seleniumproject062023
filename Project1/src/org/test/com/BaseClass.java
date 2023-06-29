package org.test.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
  
	      static WebDriver driver;
   public static void LaunchUrl(String url) {
			System.setProperty("webdriver.chrome.driver","Chrome Driver\\chromedriver.exe" );
			  driver = new ChromeDriver();
			   driver.get(url);
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   }
   public static void ScreenShot(String snap) throws IOException {
	 
	   TakesScreenshot ts= (TakesScreenshot) driver;     
		
		File source = ts.getScreenshotAs(OutputType.FILE);
				
		File destination = new File("Screenshot\\"+snap+".png");
				
		FileUtils.copyFile(source, destination);
		
   }}
