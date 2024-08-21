package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drive.get("http://leaftaps.com/opentaps/");
		drive.findElement(By.id("username")).sendKeys("DemoSalesManager");
		drive.findElement(By.id("password")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.partialLinkText("CRM/SFA")).click();
		drive.findElement(By.xpath("//a[text()='Leads']/parent::div")).click();
		drive.findElement(By.xpath("//a[text()='Find Leads']")).click();
		drive.findElement(By.xpath("//span[text()='Phone']")).click();
		drive.findElement(By.xpath("//input[@name ='phoneNumber']")).sendKeys("9988776655");
		drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String s=drive.findElement(By.xpath("//div[@style='overflow: visible;']/div/div[1]/table/tbody/tr/td/div/a[@class='linktext'][1]")).getText();
		System.out.println(s);
		drive.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).click();
		drive.findElement(By.xpath("//a[text()='Delete']")).click();
		drive.findElement(By.xpath("//a[text()='Find Leads']")).click();
		drive.findElement(By.xpath("//div/label[text()='Lead ID:']/following::div/input[1]")).sendKeys(s);
		drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String n= drive.findElement(By.xpath("//div[text()='No records to display']")).getText();
			System.out.println(n);
		/*String l="No records to display";
		if (n=="No records to display") {
			System.out.println("No recors to display");
		}else {
			System.out.println("Delete action not performed");
		}*/
			
	}

}
