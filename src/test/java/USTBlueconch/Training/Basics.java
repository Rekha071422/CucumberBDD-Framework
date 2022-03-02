package USTBlueconch.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Invoke Chrome Browser

Open URL: https://www.google.co.in/
	
Get Page Title name and Title length
	
Print Page Title and Title length on the Eclipse Console
	
Get page URL and verify whether it is the desired page or not
	
Get page Source and Page Source length
	
Print page Length on Eclipse Console.*/
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration and instantiation of objects/variables

		System.setProperty("webdriver.chrome.driver", "F:\\BlueconchTraining\\Training\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Launch website

		String url="https://www.facebook.com/";
		driver.get(url);

		/*// Get Page Title name and Title length
		String title=driver.getTitle();
		int length=title.length();
		
		//Print Page Title and Title length on the Eclipse Console
		System.out.println("Title :"+title);
		System.out.println("Length of title is :"+length);
		
		//Get page URL and verify whether it is the desired page or not		
		driver.getCurrentUrl();
		if(url.equals(driver.getCurrentUrl()))
		{
			System.out.println("it is the desired page");
		}
		
		
		//Get page Source and Page Source length
		String pageSource=driver.getPageSource();
		int lenght=pageSource.length();
		
		System.out.println("pageSource :"+pageSource);
		System.out.println("Length of pagesource :"+length);*/
		
		driver.findElement(By.linkText("")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		driver.close();

	}

}
