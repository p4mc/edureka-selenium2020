package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// Open Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marco\\Documents\\Jars and Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		
		//Open AUT
		driver.get("https://www.facebook.com/");
		
		//Interact with my elements on FB AUT (application under testing)
		
		//ID
		driver.findElement(By.id("u_0_f")).sendKeys("Marc");
		
		//Name
		driver.findElement(By.name("lastname")).sendKeys("Paul");
		
		
		//ClassName
		driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("abc@gmail.com");
		
		//LinkText
		
		//Navigate backward
		
		//PartialLinktext
		
		driver.close();

	}

}
