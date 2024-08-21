package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook extends BasePage{
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.navigate().to("https://en-gb.facebook.com/");
		 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Naveen");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7339255860");
		 driver.findElement(By.xpath("//input[@id='password_step_input']"));
		 WebElement j=null;
		 byVisible(j=driver.findElement(By.xpath("//select[@id='day']")),"28");
		 byValue(j=driver.findElement(By.xpath("//select[@id='month']")),"5");
		 byVisible(j=driver.findElement(By.xpath("//select[@id='year']")),"1997");
		 driver.findElement(By.xpath("(//label[text()='Male']/following::input)[1]")).click();
		 System.out.println (driver.findElement(By.xpath("(//label[text()='Male']/following::input)[1]")).isSelected());
		 
		 driver.close();
		 
		 
	}

}
