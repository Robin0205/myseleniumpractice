package myseleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestdropdown {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/");
		driver.findElement(By.name("q")).sendKeys("flipkart");
		List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println("size of auto suggestion:"+list.size());
		
	String text = "online shopping";
	
		for(WebElement listitem:list)
		
		{
			if(listitem.getText().contains(text))
				
					{listitem.click();
					break;
					}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	





