package myseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*------------------MOUSE ACITONS ,MOUSE OVER ACTIONS(actions is a class and action is a interface ----------
 *1. mouse actions (right,double,drag and drop, mouse over)
 *2.mouse over actions 
 */

public class mouseadnkeyboardactions {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		//driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

	/*	WebElement	button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act=new Actions(driver);
		act.contextClick(button).perform();                                                         //Right click action

		WebElement bt=driver.findElement(By.xpath("//*[@id=\"main\"]/p[1]/a"));

		Actions act1=new Actions(driver);
		act.doubleClick(bt).perform();          */                                                     //Doble click action

/*
		WebElement	washington=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement	unitedstates=driver.findElement(By.xpath("//*[@id=\"box103\"]"));                //Drop and drag action
		Actions act2=new Actions(driver);
		act2.dragAndDrop(washington, unitedstates).perform();
		Thread.sleep(3000);
		driver.close();  */



		driver.get("https://demo.opencart.com/");                                                   	//mouseover action
		WebElement components=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/a"));
		WebElement printers=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[3]/a"));
		Actions act3= new Actions(driver);
		act3.moveToElement(components).moveToElement(printers).click().perform();

		WebElement	text=driver.findElement(By.xpath("//p[contains(text(),'There are no products to list in this category.')]"));
		System.out.println(  text.getText());


		Thread.sleep(03000);
		driver.close();

	}
}











