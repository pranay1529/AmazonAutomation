package Basicclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
	driver.findElement(By.xpath("//input[@type='submit']")).click();	
    WebElement element = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[19]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("arguments[0].scrollIntoView(true);",element);
     driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[19]")).click();
     WebElement cart = driver.findElement(By.xpath("(//span//input[@id='add-to-cart-button'])[2]"));
     JavascriptExecutor js1 = (JavascriptExecutor)driver;
     js1.executeScript("arguments[0].scrollIntoView(true);",cart);
     cart.click();
  
	
	
	}

}
