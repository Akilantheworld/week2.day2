package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(40));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nalika");
		driver.findElement(By.name("lastname")).sendKeys("HappyPerson");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']"
				+ "/following::input")).sendKeys("8630648957");
		
		driver.findElement(By.id("password_step_input")).sendKeys("nalika@25");
		driver.findElement(By.id("day")).sendKeys("10");
		driver.findElement(By.id("month")).sendKeys("May");
		driver.findElement(By.id("year")).sendKeys("1997");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();

		Thread.sleep(10000);
		 driver.close();
	}

}
