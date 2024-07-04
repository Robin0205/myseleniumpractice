package myseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardactions {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"target\"]"));
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);

		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		driver.quit();
		
		act.sendKeys(Keys.DELETE).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.NUMPAD8).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		
		
		
		
		//Text copied from one box to another box using tab key( BYDOING KEYBOARD ACTONS)
	/*	
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
	WebElement	input1=driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
	WebElement	input2=driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
			
	 input1.sendKeys("welcome to java programming");

		Actions act=new Actions(driver);		
		
		//CTRL A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);

		act.perform();
		
		//CTRL C

		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);

		act.perform();
		

		
		
       //to press tab button
		
		act.sendKeys(Keys.TAB);	
		act.perform();

		//to paste the text copied from input1
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

		
		//compare text
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
		System.out.println("text copied");
		
		else
			   System.out.println("text not copied");  */
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

