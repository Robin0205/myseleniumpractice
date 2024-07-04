package myseleniumpractice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class synchronizationtypesofwaits {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.google.com/");
		// driver.manage().window().maximize();

		// implicitlywait-------wait for all the elements in page until the web
		// application close

		/*
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * driver.findElement(By.name("q")).sendKeys("selenium");
		 * driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
		 * driver.close();
		 */

		// Explicit wait-------element specific method

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("");
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.RETURN);

		WebElement element = mywait.until(ExpectedConditions
     	.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")));
		element.click();

		// generic method for multiple webelemets(explicit waits)

		/*
		 * @SuppressWarnings("unused") public static void main(String[] args) {
		 * WebDriverManager.chromedriver().setup(); WebDriver driver= new
		 * ChromeDriver();
		 * 
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.name("q")).sendKeys("selenium",Keys.RETURN);
		 * 
		 * By elelocator=By.xpath(
		 * "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3");
		 * 
		 * waitforelementpresent(driver,elelocator,10) .click(); }
		 * 
		 * public static WebElement waitforelementpresent(WebDriver driver, By locator,
		 * int timeout) {
		 * 
		 * WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		 * 
		 * mywait.until(ExpectedConditions.visibilityOfElementLocated(locator)); return
		 * driver.findElement(locator);
		 */

		// Fluent wait ------same as of explicitwait with more flexibility in polling
		// time and ignoring exception

		// fluent wait declaration

		/*
		 * Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(30)
		 * .ignoring(NoSuchElementException.class));
		 * 
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.name("q")).sendKeys("selenium");
		 * driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		 * 
		 * //usuage of fluentwait
		 * 
		 * 
		 * WebElement element=mywait.until(new Function<webdrievr, WebElement>(){
		 * 
		 * public WebElement apply(WebDriver drievr) { return
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")); }
		 * 
		 * }); element.click();
		 */
	}
}
