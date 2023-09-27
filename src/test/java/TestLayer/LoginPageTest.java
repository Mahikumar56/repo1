package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class LoginPageTest extends BaseClass{

	@BeforeTest
	public void setup()
	{
		BaseClass.initialization();
	}
	@Test(priority=1)
	public void validateLoginFunctionality() 
{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("admin1");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		driver.findElement(By.linkText("Menu")).click();
		driver.findElement(By.id("ehat_module_1")).click();
		driver.findElement(By.xpath("//span[text()='Registration']")).click();
		
		}
	}

