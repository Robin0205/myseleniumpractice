package myseleniumpractice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinks {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws MalformedURLException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());

		int brokenlinks = 0;

		for (WebElement element : alllinks)

		{
			String url = element.getAttribute("href"); // if this condition is false then it will go for next step try n
														// catch block

			if (url == null || url.isEmpty())

			{
				System.out.println("url is empty");

				continue;
			}

			URL link = new URL(url);

			try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();

				if (httpconn.getResponseCode() >= 400) {
					System.out.println(httpconn.getResponseCode() + url + "  is" + "  broken link");
					brokenlinks++;

				}

				else {
					System.out.println(httpconn.getResponseCode() + url + "  is" + "valid link");
				}

			} catch (Exception e) {
			}
		}

		System.out.println("number of broken links:" + brokenlinks);
		driver.quit();

	}

}
