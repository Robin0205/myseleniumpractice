package myseleniumpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotcapture {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();        //to take screenshot we have (taks screenshot interface)in dat (get screesnshot as is the method)
		WebDriver driver=new ChromeDriver();           //by dat method we can capture the screenshots of the page section or specific web element
		//driver.get("https://www.nopcommerce.com/en/demo");
		//driver.manage().window().maximize();

		//take screenshot of full page (we cannot directly assign the driver(instance of webdriver) instance to ts instace variable so dat we have to 
		//do the typecasting of the takesscreenshot

		//full page screenshot

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		TakesScreenshot ts=(TakesScreenshot)driver;

	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File trg=new File(".\\screenshot\\homepage2.png");
	    FileUtils.copyFile(src, trg);

		//get screenshot of portion or section of the page

		WebElement img=driver.findElement(By.xpath(" /html/body/div[6]/div[3]/div/div/div/div/div[3]/div/div[1]/div/div/a/img"));
		File src1=img.getScreenshotAs(OutputType.FILE);
		File trg1=new File(".\\screenshot\\featured products.png");
		FileUtils.copyFile(src1, trg1);
		Thread.sleep(3000);
		driver.close();






	}
}


























