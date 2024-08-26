package bulu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Parallel1 {
	WebDriver driver;
	@Test
	public void verifyTitle() throws Exception
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void verifylogo() throws Exception
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		WebElement logo =driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed()); 
		Thread.sleep(5000);
		driver.quit();
	}
}