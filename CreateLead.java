package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.navigate().to(" http://leaftaps.com/opentaps/");
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naveen");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Cretae Lead");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 System.out.println(driver.getTitle());
		 if(driver.getTitle().equals("View Lead | opentaps CRM")) {
			 System.out.println("TRUE");
		 };
		 Thread.sleep(3000);
		 driver.close();
		//input[@class='smallSubmit']
		 
		 
	}

}
