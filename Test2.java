package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Test2 {
WebDriver driver;
@Test
public void ajio() throws Throwable {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.ajio.com/");
	System.out.println("ajio url launch");
	Thread.sleep(1300);
	driver.close();
}
}
