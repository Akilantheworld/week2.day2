package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOptional {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		 driver.get("https://WWW.opencart.com/index.php?route=account/register");
		 driver.findElement(By.id("input-username")).sendKeys("Akilan");
		 driver.findElement(By.name("firstname")).sendKeys("Akilan");
		 driver.findElement(By.name("lastname")).sendKeys("Jayaraman");
		 driver.findElement(By.id("input-email")).sendKeys("akilanjais@gmail.com");
		 WebElement countryid = driver.findElement(By.id("input-country")); 
		 
		 new Select(countryid).selectByVisibleText("India");
		 
		 driver.findElement(By.id("input-password")).sendKeys("akilan@25");
		 driver.findElement(By.className("bg-info")).click();
		 driver.findElement(By.xpath("html[1]")).click();
		 
		 Thread.sleep(10000);
		 driver.close();

		
	}

}
