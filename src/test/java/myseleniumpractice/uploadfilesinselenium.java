package myseleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadfilesinselenium {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, AWTException {
		 
		
	//we can use sendkeys,robot class methods to uploadfiles in selenium rather than we can use third party tools autoit, sikuli 
    //with which we can integrate wid selenium and upload  files
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div[1]/a[2]")).click();
		
		//upload  files by using sendkeys method
		
		driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("C:\\Users\\Robin\\OneDrive\\Documents\\BOSCH.docx");
		Thread.sleep(3000);
		driver.close();
		
		// uploading files using robot class methods
		//javascriptexcutor is a interface it contains executescript method , with this method we can execute javascript statements through webdriver
		
				//uploading files using robot class methods
				 WebElement button =driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
				JavascriptExecutor js=(JavascriptExecutor) driver;              
				 js.executeScript("arguments[0].click()",button);               //click on button
				
				/*  1.copy the path
				 * 2.ctrl+v
				 * 3.enter
				
				 */
				 
				//in html if u have type=file u can directly use sendkeys method if not u should go for robot class
				//creaintg robot class
				Robot rb= new Robot();
				rb.delay(2000);

				//put path to file in clipboard
				
				StringSelection ss=new StringSelection("C:\\Users\\Robin\\OneDrive\\Documents\\BOSH.docx");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				
				
				//ctrl+v
				
				rb.keyPress(KeyEvent.VK_CONTROL);               //Press the ctrl key
				rb.keyPress(KeyEvent.VK_V);                     //press the v key
				
				
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V); 
				rb.delay(2000);

				
				//ENTER
				
				rb.keyPress(KeyEvent.VK_ENTER);                //press enter key
				rb.keyRelease(KeyEvent.VK_ENTER);              //release enter key
				rb.delay(2000);

			}

			
				
			}

				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
