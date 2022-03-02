package USTBlueconch.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QATechnicalAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "F:\\BlueconchTraining\\Training\\Drivers\\chromedriver.exe");

		 driver = new ChromeDriver();

		// Launch website
		 driver.get("https://sleek.com/sg/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 //Verify the Home page is displayed
		 driver.findElement(By.xpath("//a//img[@class='attachment-full size-full']")).isDisplayed();
		 
		 //Click on Pricing link
		 driver.findElement(By.linkText("Pricing")).click();
		 
		 //Click on learn more link
		 driver.findElement(By.linkText("home-lets-talk")).click();
		 
	}

}
