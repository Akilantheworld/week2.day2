package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSalesForce {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Akilan");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Jayaraman");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("akilanjais@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9087654321");
		
		
		 WebElement userTitle = driver.findElement(By.name("UserTitle")); 
		 new Select(userTitle).selectByVisibleText("Sales Manager");
		 driver.findElement(By.name("CompanyName")).sendKeys("victor");
		 WebElement companyEmployees = driver.findElement(By.name("CompanyEmployees")); 
		 new Select(companyEmployees).selectByVisibleText("15 - 100 employees"); 
		 driver.findElement(By.name("UserPhone")).sendKeys("");
		 WebElement companyCountry = driver.findElement(By.name("CompanyCountry")); 
		 new Select(companyCountry).selectByVisibleText("India"); 
		 driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		 Thread.sleep(10000);
		 driver.close();

	}

}
