package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) {
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drive.get("https://www.leafground.com/radio.xhtml");
		drive.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		WebElement select =drive.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
		WebElement c =drive.findElement(By.xpath("(//h5[text()='Find the default select radio button']/following::div//td/div/div/input)[1]"));
		WebElement f=drive.findElement(By.xpath("(//h5[text()='Find the default select radio button']/following::div//td/div/div/input)[2]"));
		WebElement s=drive.findElement(By.xpath("(//h5[text()='Find the default select radio button']/following::div//td/div/div/input)[3]"));
		WebElement e=drive.findElement(By.xpath("(//h5[text()='Find the default select radio button']/following::div//td/div/div/input)[4]"));
		select.click();
		System.out.println(select.isSelected());
		System.out.println("Chrome is selected : "+ c.isSelected() );
		System.out.println("Firefox is selected : "+ f.isSelected() );
		System.out.println("Safari is selected : "+ s.isSelected() );
		System.out.println("Edge is selected : "+ e.isSelected() );
		WebElement age = drive.findElement(By.xpath("(//h5[text()='Select the age group (only if not selected)']/following::div/div/div/div/div/div/div/input)[2]"));
		if(age.isSelected()){
			
		}
		else{
			age.click();
			
		}
		System.out.println(age.isSelected());
		
		
		
		
		
		
	}
	

}
