package USTBlueconch.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\BlueconchTraining\\Training\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Launch website

		String url="https://twitter.com/";
		driver.get(url);
		//Maximize window
		driver.manage().window().maximize();
		//Delete all cookies
		driver.manage().deleteAllCookies();
		//Wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("signupButton")).click();
		driver.close();
	}

}
