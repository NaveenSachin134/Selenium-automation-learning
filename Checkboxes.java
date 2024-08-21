package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkboxes {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver drive=new ChromeDriver();
		
	drive.manage().window().maximize();
	drive.get("https://leafground.com/checkbox.xhtml");
	drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	drive.findElement(By.xpath("//div/input[@aria-label='Basic']/following :: div[1]")).click();
	drive.findElement(By.xpath("//div/input[@aria-label='Ajax']/following :: div[1]")).click();
	String a= drive.findElement(By.xpath("//span[text()='Checked']")).getText();
	String b="Checked";
	if (a==b) {
		System.out.println(a);
	}else {
		System.out.println("Notification is not displayed");
	}
	
	drive.findElement(By.xpath("//div/input[@value='java']/following::div[1]")).click();
	drive.findElement(By.xpath("//div/input[contains(@name,'ajaxTriState_input')]/following::div[1]")).click();
	String value=drive.findElement(By.xpath("//span[text()='State has been changed.']/following::p")).getText();
	String verify="1";
	if (verify==value) {
		System.out.println("Value ="+value);
	}else {
		System.out.println("Value has been changed or different");
	}
	drive.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	String Toggle=drive.findElement(By.xpath("//span[text()='Checked']")).getText();
	String switc="Checked";
	if (Toggle==switc) {
		System.out.println(Toggle);
	}else {
		System.out.println("Notification is not displayed");
	}
	boolean isD=drive.findElement(By.xpath("//span[text()='Disabled']/parent::div")).isSelected();
	System.out.println(isD);
	drive.findElement(By.xpath("//div/label[text()='Amsterdam']/following::ul[@data-label='Cities']")).click();
	drive.findElement(By.xpath("//li[@data-item-value='Paris']/label")).click();
	drive.findElement(By.xpath("//li[@data-item-value='London']/label")).click();
	
	Thread.sleep(3000);
	
	drive.close();
	
	
	}
	
	
	

	

}
