package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	public static void main(String[] args) {
		
	ChromeDriver drive =new ChromeDriver();
	drive.manage().window().maximize();
	drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	drive.get("http://leaftaps.com/opentaps/");
	drive.findElement(By.id("username")).sendKeys("DemoSalesManager");
	drive.findElement(By.id("password")).sendKeys("crmsfa");
	drive.findElement(By.className("decorativeSubmit")).click();
	drive.findElement(By.partialLinkText("CRM/SFA")).click();
	drive.findElement(By.xpath("//a[text()='Leads']/parent::div")).click();
	drive.findElement(By.xpath("//a[text()='Create Lead']")).click();
	drive.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
	drive.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Naveen");
	drive.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sundharamoorthy");
	drive.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Prasath");
	drive.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	drive.findElement(By.id("createLeadForm_description")).sendKeys("Testing Automation");
	drive.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("naveen018@gmail.com");
	WebElement state =drive.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
	state.click();
	Select stateOption=new Select(state);
	stateOption.selectByVisibleText("Florida");
	drive.findElement(By.xpath("//input[@value ='Create Lead']")).click();
	drive.findElement(By.xpath("//a[text()='Edit']")).click();
	drive.findElement(By.id("updateLeadForm_description")).clear();
	drive.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test");
	drive.findElement(By.xpath("//input[@value='Update']"));
	System.out.println(drive.getTitle());
	
	drive.close();
	
	
	
	
	
	
	
	
	
	
	
	}
}
