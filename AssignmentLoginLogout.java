package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentLoginLogout {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		
		System.out.println("page Title is: " + driver.getTitle());
		driver.findElement(By.linkText("Log Out")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
