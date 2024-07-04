package myseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tooltipmultipleswindow {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// to get the tooltip


		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement inputbox=driver.findElement(By.xpath("//*[@id=\"age\"]"));
		String tooltip=inputbox.getAttribute("title");
		System.out.println(tooltip);


		//how to open link(url) in new tab


		driver.get("https://www.amazon.in/");

		String  tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Mobiles")).sendKeys(tab);
		Thread.sleep(3000);
		driver.close();


		//how to open url in multiple windows

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver.switchTo().newWindow(WindowType.WINDOW);

 		driver.get("https://www.meesho.com/");
		Thread.sleep(3000);

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//driver.close();          //close method will close the current tab or winodw
		driver.quit();            //quit method will close all the tabs or window


		 //get loction and sizw of the element
		 // location gives the x and y axes location of the web element


		driver.findElement(By.xpath("")).getLocation();
		driver.findElement(By.xpath("")).getSize();











	}

}
