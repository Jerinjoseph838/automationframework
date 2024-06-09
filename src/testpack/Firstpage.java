package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Firstpage {
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeClass (groups= {"sanity", "regression"})
	public void lauchbrowser () {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://c-design.in/");
		
		
	}
	

	@Test (groups= {"sanity", "regression"})
	public void firstpage () {
		
		driver.findElement(By.xpath("(//a[@class='nav-link'])[2]")).click();
		
	}
	
	
	
	
	@Test (groups= {"sanity", "regression"})
	public void secondtestcase () {
		
		driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle' and @data-bs-toggle='dropdown'])[1]")).click();
	driver.findElement(By.xpath("(//a[@class='dropdown-item'])[2]")).click();
		
		
		
	}
	
	@Test
	public void portfolio () {
		
		WebElement portfolio = driver.findElement(By.xpath("(//a[@class='nav-link'])[3]"));
		portfolio.click();
	}

}

