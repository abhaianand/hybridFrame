package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class Rough extends BaseClass{
 @Test(priority=1,groups= {"sanity","master"})
   void test1() throws InterruptedException {
	 
	String a = driver.getCurrentUrl();
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("hhhhhhhhhhhhhhh");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	
	Assert.assertEquals("https://tutorialsninja.com/demo/", a);
   
   }
    }

