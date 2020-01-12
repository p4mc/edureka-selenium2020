package Module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalBoxTest {

	public static void main(String[] args) {
		//Instantiate a Browser - Open Browser
		//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marco\\Documents\\Jars and Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();

	}

}
