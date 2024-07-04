package myseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sliderlocsize {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // price range slider
		// driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7989329816");
		// driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Robin@2806");
		// driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();

		/*
		 * WebElement searchbox=driver.findElement(By.xpath(
		 * "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"))
		 * ; searchbox.sendKeys("mobiles"); searchbox.sendKeys(Keys.RETURN);
		 * 
		 * 
		 * WebElement min_slider=driver.findElement(By.className("_31Kbhn _28DFQy"));
		 * 
		 * System.out.println("location of the slider:"+ min_slider.getLocation());
		 * System.out.println("size of the slider:"+ min_slider.getSize()); //action is
		 * interface ,whereas actions is class
		 *  Actions act =new Actions(driver); //build
		 * just creates action and written action bt perform will complete action
		 * 
		 * act.dragAndDropBy(min_slider,100, 300).perform();
		 * System.out.println("location of the slider:"+ min_slider.getLocation());
		 * System.out.println("size of the slider:"+ min_slider.getSize());
		 */

		driver.get("https://codepen.io/ProsantaMazumder/pen/LgvrWE");
		driver.manage().window().maximize();

		WebElement min_slider = driver.findElement(By.xpath(
		"//div[@class='editor-header EditorHeader-module_root-cpo0V header-wrap HeaderWrap-module_root-sV1Mb']"));
		System.out.println("location of the min slider" + min_slider.getLocation());
		System.out.println("height and width of the slider" + min_slider.getSize());

		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 0).perform();
		System.out.println("location of the min slider after action" + min_slider.getLocation());
		System.out.println("height and width of the slider after action" + min_slider.getSize());

	}

}
