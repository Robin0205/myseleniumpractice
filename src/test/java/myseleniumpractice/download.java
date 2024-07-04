package myseleniumpractice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class download {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) throws InterruptedException {
		
		
		//String location = System.getProperty("user.dir") + "\\Downloads\\";
		
		//CHROME
	/*	HashMap preferences = new HashMap();
	    preferences.put("plugins.always_open_pdf_externally",true);  //for pdf download
		preferences.put("downlaod.default_directory", location);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		Thread.sleep(10000);
		driver.close(); */
		
		
		//EDGE
		
		
	/*	HashMap preferences = new HashMap();
	   preferences.put("plugins.always_open_pdf_externally",true);  //for pdf download
		preferences.put("downlaod.default_directory", location);

		EdgeOptions options = new EdgeOptions();
		options.setExperimentalOption("prefs", preferences);

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		Thread.sleep(10000);
		driver.close(); */
		
		//FIREFOX
		
		
		/*FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("pdfjs.disables",true); //pdf  to save in other format check the mime of the file in browser
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");
		profile.setPreference("browser.download.folderList",2);//0-desktop 1-download 2-location given by user
		profile.setPreference("browser.download.dir",location);
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		Thread.sleep(10000);
		driver.close(); */
		
		
		

	}

}
