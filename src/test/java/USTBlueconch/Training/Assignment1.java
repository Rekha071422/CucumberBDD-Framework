package USTBlueconch.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Chro  me
		System.setProperty("webdriver.chrome.driver", "F:\\BlueconchTraining\\Training\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Launch website

		String url="https://www.netflix.com/in/";
		driver.get(url);
		// System.out.println("navigated");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.className("nfTextField")).sendKeys("Movies");
		driver.findElement(By.className("cta-btn-txt")).click();
		driver.close();
	}

}
