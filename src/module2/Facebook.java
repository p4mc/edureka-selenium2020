package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		// driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("abc@gmail.com");// will not work due to the space between 'inputext' and 'login'
		
		
		
		//LinkText
		 driver.findElement(By.linkText("Forgot account?")).click();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Navigate backward
		driver.navigate().back();
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//PartialLinktext
		 driver.findElement(By.partialLinkText("Forgot account?")).click();
		//Navigate backward
			driver.navigate().back();
		
		 //CSS
		 driver.findElement(By.cssSelector("#u_0_k")).sendKeys("1234567890");
		 
		 //TagName
		 List<WebElement> List = driver.findElements(By.tagName("a"));
		 System.out.println(List.size());
		 
		 //XPath //*[@id="u_0_p"] | full xpath /html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/form/div[1]/div[4]/div/div[1]/input (Password field)
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/form/div[1]/div[4]/div/div[1]/input")).sendKeys("qwe");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\'u_0_p\']")).sendKeys("2334");
		//driver.close();
		//driver.quit();

	}

}
