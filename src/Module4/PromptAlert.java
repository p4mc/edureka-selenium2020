package Module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		//Instantiate a Browser - Open Browser
				//Chrome
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marco\\Documents\\Jars and Drivers\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//get url
				driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
				
				//click on alert button
				driver.findElement(By.xpath("//*[@id='prompt' and @onclick='promptBox()']")).click();;
				
				//initialize the alert class and switch the focus of webdriver to the alert
				Alert pA = driver.switchTo().alert();
				
				//type into the textbox in the alert
				pA.sendKeys("Marc Paul");
				
				//click on the OK button in the alert
				pA.accept();

	}

}
