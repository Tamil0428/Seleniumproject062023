package Adactin.com.adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	static WebDriver driver;
	
	static Select drop;
	public static void browserLaunch() {
		System.setProperty(Utils.chromedriver,"C:\\Users\\tamil\\eclipse-workspace\\Project1\\Chrome Driver\\chromedriver.exe" );
		  driver = new ChromeDriver();
		   driver.get("https://adactinhotelapp.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	//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
	
	public static WebElement nameLocator(String name) {
		return driver.findElement(By.name(name));
	}
	 public static WebElement idLocator(String id) {
		  return  driver.findElement(By.id(id));
	 }
	
	public static void dropdown(WebElement element, int index) {
		drop=new Select(element);
		drop.selectByIndex(index);
		
	}
	public static void dropdown1(WebElement element,String text) {
		drop=new Select(element);
		drop.selectByVisibleText(text);
	}
	public static void dropdown2(WebElement element,String val) {
		drop=new Select(element);
		drop.selectByValue(val);
	}
	public static void screenshot(String output) throws IOException {
		   TakesScreenshot ts= (TakesScreenshot) driver;     
   		
   		File source = ts.getScreenshotAs(OutputType.FILE);
   				
   		File destination = new File("Screenshot\\output.png");
   				
   		FileUtils.copyFile(source, destination);
	}
	
	
	
	
	
	
}
