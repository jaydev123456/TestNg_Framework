package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Test3 {
WebDriver driver;
@Test
public void Myntra() throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.myntra.com");
	driver.manage().window().maximize();
	System.out.println("Myntra site open successfully");
	Thread.sleep(1200);
}
@Test
public void myntrajeans() {
	System.out.println("jeans page open");
	driver.close();
}
}
