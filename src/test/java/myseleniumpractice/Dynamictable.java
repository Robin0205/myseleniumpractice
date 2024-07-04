package myseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamictable {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//*[@id=\"input-username\"]"));
		username.sendKeys("demo");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();


		driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"collapse-4\"]/li[1]/a")).click();


		//find total number of pages in page

		WebElement totalpages=driver.findElement(By.xpath("//*[@id=\"form-order\"]/div[2]/div[2]"));
		System.out.println(totalpages.getText());

		

		//int	value=Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("pages")-1));
		// System.out.println("text shows is :"+value);



		//find how many rows in each pages


		for( int p = 1;p <=10; p++)

		{
			WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li/span"));

			System.out.println( "Active page:"+active_page.getText());
			active_page.click();

			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
			System.out.println("number of rows:"+rows);
		}

		//read all the rows from each page


		for(int r=1;r<=r;r++) 
		{

			String store=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr['+r+']/td[3]")).getText();
			String customer_id=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr['+r+']/td[4]")).getText();
			String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr['+r+']/td[5]")).getText();

			if(status.equals("Pending"))


				System.out.println(store+"       "+"customer_id"+"       "+"pending");

		}

	int p = 0;
	String	pageno=Integer.toString(p+1);
	driver.findElement(By.xpath("ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();

	}



}



