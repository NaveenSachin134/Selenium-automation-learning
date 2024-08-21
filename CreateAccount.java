package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.navigate().to(" http://leaftaps.com/opentaps/");
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Accounts")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.id("accountName")).sendKeys("NAVEEN1");
		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		 driver.findElement(By.id("numberEmployees")).sendKeys("3");
		 driver.findElement(By.id("officeSiteName")).sendKeys("leaftaps");
		 driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		 System.out.println(driver.getTitle());
		 System.out.println((driver.getTitle().equals("Account Details | opentaps CRM")));
		 driver.quit();
		 
		 
	}

}
