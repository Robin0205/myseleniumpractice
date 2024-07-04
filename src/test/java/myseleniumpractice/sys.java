package myseleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/*---------------------MAVEN----------------------
 *Maven is a built automation tool form Apache software foundation and is commnly used to handle java projects.
 *Maven is a build tool and project managment tool, which is used to build, deploy,publish, and deploy several projects at once
 *for better project managment.
 *Maven tool gives the info about the configration detils of the porject and it contains the dependencies and whole life cycle of the project.
 

 --------find and finds elements-----------
 
 * driver.findelement---it returns one element --if single web element present
 * --it retunrs the first web elemnt--when u use this method when multiple elements are present
 * --can acess dat element directly
 * whne u use this method if no element is present it will throw no such element exception.
 * --------------
 * driver.findelements --this method will return the multiple webelements dat in form of list <webelements> it is return type
 * to access dat we have to iterate the list of elements
 * when elements are not presner and still using this method it will return zero in console
 * it return all the elements when web elements are multiple in  number.
 * 
 * 
 * find element()--- method returns the first matching element on the current page 
 * if the element is not found it will throw no such element found exception
 * 
 * 
 * find elements()-- method returns  all the multiple matching elements on current web page and doesnt throw any exception if the element is not found
 * instead it throws zero elements.
 * 
 */

/* there are 2 ways to integrate the selemium in java
 * 1.system.setproperty 2.webdrivermanager.chromedriver().setup();
 * 
 */

public class sys {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		
		//type-1 by using system.set property("", "");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Robin\\eclipse-workspace\\Hello world\\Resources.exe");  //webdriver.gecko.driver  //webdriver.ede.driver
		//WebDriver driver=new ChromeDriver();  //creating object at interface level
		//driver.get("");
		
		
		
		//type-2  by using webdrivermanager
		
	/* webdriver is an interface driver is a local variable ,new keyword is use create an object chromedriver () is a constructor
	 * we are calling chrome driver class by constructor which has all the methods to do actions on chrome(might be any browser).
	 * =new chrome  we are creating object for chromedriver class() by callig default constructor.
	 * this object will open the chrome browser , so after opeing browser we want to perform some actions on browser
	 * to perform some actions we should have that instance the browser
	 * so instance is stored in some variable called driver varibale
	 * by using this driver we can perform actions on browser.
	 * 
	 * 
	 * webdriver is a interface which is implemeted by the remote webbdriver class.
	 * and remote webdriver class is extends by chromedriver,edgedriver,firefox driver,opera driver classes.
	 * 
	 * 
	 * -------------HEIRARCHY OF SELENIUM-------------
	 * 
	 * Search context extends webriver whereas webdriver has its inner interfaces(navigation, target locator,window,imehandler,options)
	 * webrdiver(interface) implemets remote webdriver.
	 * javascript executor, take scheenshot this both interfaces are implemented by remote webdriver.
	 * Remote webdriver is extend by the chromedriver(chrome driver),firefox driver,edge driver, safari dirver.
	 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();             //creating object at interface level
		driver.get("https://www.google.com/");
		Thread.sleep(3000);;
		driver.quit();
		
		

	}

}
