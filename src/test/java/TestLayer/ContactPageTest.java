package TestLayer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import UtilityLayer.ExcelReader;

public class ContactPageTest extends BaseClass {

	@Test(priority = 2, dataProvider = "getContactData")
	public void reg(String prefixid,String fname, String lname)	throws InterruptedException {
		
		
		
		
		driver.findElement(By.name("fName")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='lName']")).sendKeys(lname);
		driver.findElement(By.xpath("//div[@id='s2id_prefix']")).click();	
		
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='select2-result-label']/span"));
		for (WebElement abc: ls) {
			String a=abc.getText();
			
			if(a.equalsIgnoreCase(prefixid)) {
				abc.click();
				break;
			}
		}
	
		
		//driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(mobileno);
		/*driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(dob);
		driver.findElement(By.xpath("//div[@id='s2id_department']")).click();
		driver.findElement(By.xpath("(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='select2-choice'])[5]")).click();
		driver.findElement(By.xpath("(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[1]")).click();
	*/
	 
	 }
		

	@DataProvider
	public Object[][] getContactData() throws IOException {
		ExcelReader obj = new ExcelReader(
				System.getProperty("user.dir")+"\\src\\main\\java\\TestData\\New Microsoft Excel Worksheet.xlsx");

		Object[][] data = obj.getAllSheetData(0);

		return data;

	}

}
