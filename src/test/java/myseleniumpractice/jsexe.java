package myseleniumpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsexe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//creating javascriptexecuotr reference and assigning driver to js esxecutor

		JavascriptExecutor jsex = (JavascriptExecutor) driver;
		
		/*WebElement ele = (WebElement) jsex.executeScript("return document.getElementById('email')");
        ele.sendKeys("ramesh");
        Thread.sleep(5000);
        driver.close();*/
		
		jsex.executeScript("document.getElementById('email').value='Ram';");      //sendkeys
		jsex.executeScript("document.getlEmentById('email'.value;)");             //to get attribute of webelement
		
		jsex.executeScript("document.getlEmentById('email'.click;)");              //to do the click action 
		
		
	}

}
