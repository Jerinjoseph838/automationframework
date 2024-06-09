package Newdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Homepage {
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass 
	public void loginfunction() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		 
	}
	
	
	@Test (dataProvider = "crenditals")
	public void firstpage (String emailpicker, String pwdpicker) {
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(emailpicker);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys(pwdpicker);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
	
	
	@DataProvider ( name = "crenditals")
	public Object[][] multipleusers () {
		
		Object [][] input = new Object [3][2];
		
		input [0][0] = "test1@gmail.com";
		input [0][1] = "pass22";
		
		input [1][0] = "test2@gmail.com";
		input [1][1] = "pass33";
		
		input [2][0] = "test3@gmail.com";
		input [2][1] = "pass44";
		
		return input;
		
		
		
		
	}
	
}
