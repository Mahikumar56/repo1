package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static	WebDriver driver;
		public static void initialization()
		{
			 driver=new ChromeDriver();
			driver.get("http://43.241.39.47:8080/MAHAHMIS/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
	}
