package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Test1 {
	WebDriver driver;
	@Test
	public void flipkart() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.close();
	}
	@Test
	public void grocery() throws Exception {
		//driver.findElement(By.xpath("//div[contains(text(),'Grocery')]")).click();
		System.out.println("grocery page open");
		Thread.sleep(1000);
	}
	@Test
	public void mobiles() throws Exception {
		//driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		System.out.println("mobile page open sucessfully");
		Thread.sleep(1200);
	}
}
