package org.test.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BaseClass {
	    //username---Tamilselvan04
	    //pass-----Tamil428
	
	public static void main(String[] args) throws IOException {
		  LaunchUrl("https://adactinhotelapp.com/");
		  driver.findElement(By.name("username")).sendKeys("Tamilselvan04");
		  driver.findElement(By.name("password")).sendKeys("tamil428");
		   driver.findElement(By.id("login")).click();
		   WebElement drop = driver.findElement(By.name("location"));   
		  Select ref=new Select(drop);
		        ref.selectByValue("Adelaide");
		   WebElement drop2 = driver.findElement(By.name("hotels"));
		   Select ref1=new Select(drop2);
		        ref1.selectByIndex(2);
		   WebElement drop3 = driver.findElement(By.id("room_type"));
		   Select ref2=new Select(drop3);
		        ref2.selectByVisibleText("Double");
		     WebElement drop4 = driver.findElement(By.id("room_nos"));
		     Select ref3=new Select(drop4);
		     ref3.selectByValue("2");
		     WebElement element = driver.findElement(By.id("datepick_in"));
		              element.clear();
		               element.sendKeys("29/06/2023");
		     WebElement element1 = driver.findElement(By.id("datepick_out"));
		              element1.clear();
		              element1.sendKeys("30/06/2023");
		     WebElement drop5 = driver.findElement(By.id("adult_room"));
		     Select ref4=new Select(drop5);
		     ref4.selectByVisibleText("2 - Two");
		     WebElement drop6 = driver.findElement(By.id("child_room"));
		     Select ref5=new Select(drop6);
		     ref5.selectByIndex(2);
		     driver.findElement(By.name("Submit")).click();
		     driver.findElement(By.id("radiobutton_0")).click();
		     driver.findElement(By.id("continue")).click();
		     driver.findElement(By.id("first_name")).sendKeys("Tamilselvan");
		     driver.findElement(By.id("last_name")).sendKeys("Baskaran");
		     driver.findElement(By.id("address")).sendKeys("pudur,vaniyambadi,vellore-635751");
		     driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		     WebElement drop7 = driver.findElement(By.id("cc_type"));
		             Select ref6=new Select(drop7);
		                  ref6.selectByValue("VISA");
		      WebElement drop8 = driver.findElement(By.id("cc_exp_month"));
		             Select ref7=new Select(drop8);
		                    ref7.selectByVisibleText("March");
		       WebElement drop9 = driver.findElement(By.id("cc_exp_year"));
		             Select ref8=new Select(drop9);
		                   ref8.selectByIndex(3);
		           driver.findElement(By.id("cc_cvv")).sendKeys("536");
		           driver.findElement(By.id("book_now")).click();
		           driver.findElement(By.id("my_itinerary")).click();
		               ScreenShot("snap");
		                   
		                   
		                   
		             
		                  
	}

}
