package myseleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linksinselenium {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// to find single link in webbrowser
		//driver.findElement(By.linkText("Mobiles")).click();
		
		
		// to find all links in webbrowser
		List<WebElement>all=driver.findElements(By.tagName("a"));
		
		
		//for loop
		
	/*	for( i=0;i<=all.size();i++)
		{
		
		System.out.println(all.get(i).getText());
		System.out.println(all.get(i).getAttribute("href"));

		
		}*/
		
		//for each loop(for every element)
		
		/*for(WebElement link:all)
		{
			System.out.println(link.getText());
		System.out.println(link.getAttribute("href"));
			
		}*/
		
		
		
		
		
		
	}
}
