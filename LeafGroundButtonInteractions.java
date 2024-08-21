package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteractions {
	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drive.get("https://leafground.com/button.xhtml");
		drive.findElement(By.xpath("//span[text()='Click']")).click();
		String title = drive.getTitle();
		if(title =="dashboard") {
		System.out.println(title);
		}else {
			System.out.println("Correct value is :"+title);
		}
		drive.navigate().back();
		System.out.println(drive.findElement(By.xpath("//div/h5[text()='Confirm if the button is disabled.']/following::button[1]")).isEnabled());
		//drive.findElement(By.xpath("//div/h5[text()='Confirm if the button is disabled.']/following::button[1]")).click();
		System.out.println(drive.findElement(By.xpath("//button[@type='button']/span[text()='Submit'][1]")).getLocation());
		String s=drive.findElement(By.xpath("//span[text()='Save']")).getCssValue("border-color");
		WebElement d=drive.findElement(By.xpath("//span[text()='Save']"));
		d.getSize();
		System.out.println(s);
	
		
	
	}
}
