package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://primaluxury.shtdevops.xyz/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement searchproperty = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div[2]/button"));
		searchproperty.click();
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
		
		Thread.sleep(3000);
		WebElement property = driver.findElement(By.xpath("/html/body/div/section/div[2]/div[3]/div[1]/div/a/div/h2"));
		property.click();
		
		Thread.sleep(3000);
		WebElement back = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div[1]/div/div[1]/div[1]/p"));
		back.click();
		
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("/html/body/div/section/div[1]/div/div[2]/div[2]/div[3]/div/input"));
		price.sendKeys("245034.00");
		
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(3000);
		WebElement apply = driver.findElement(By.xpath("/html/body/div/section/div[1]/div/div[2]/div[2]/div[10]/button[2]"));
		apply.click();
		

	}

}
