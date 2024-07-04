package myseleniumpractice;

/* As these pop-ups come from browser so we cannot find any element and we cant inspect anything related these popups
 * 
 */
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsandpopups {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//Alert window wid ok button
		
	/*	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();*/
		
		
		//Alert window with ok and  cancel button
		
	
	/*	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.close();*/
			
		// Alert window with input box, capture text from alert
		
		 driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		 Thread.sleep(3000);
		 
		Alert alertwindow=driver.switchTo().alert();
		System.out.println("text from the alert winow is:"+alertwindow.getText());
		alertwindow.sendKeys("welcome");
		alertwindow.accept();
		 driver.close();    
	}
	
}
	


      
      
      
      
      
      
      
		
	

	


	