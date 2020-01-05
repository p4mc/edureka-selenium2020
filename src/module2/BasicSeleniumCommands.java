package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		
		//Instantiate a Browser - Open Browser
		//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marco\\Documents\\Jars and Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Quit & Close
		driver.quit();  // this will close all the open windows during the current instance and will also close the driver.exe from...
		driver.close(); // this only closes the active window
		
		//Get Commands
		driver.get("URL"); // to open URL of the AUT on the Browser
		driver.getTitle(); // to get the title of the current page
		driver.getCurrentUrl(); // to get the current page URL
		driver.getWindowHandle(); // to get the name of the window
		
		//Navigation Commands
		driver.navigate().back(); // previous page from the history
		driver.navigate().forward(); // next page from the history
		driver.navigate().refresh(); // refresh the page
		
		//Element Handling
		driver.findElement(By.id("")).click(); // to click - button, link, checkbox, radio button
		driver.findElement(By.id("")).sendKeys(""); // to type into a text box
		driver.findElement(By.id("")).clear(); // to erase everything from a text box
		driver.findElement(By.id("")).getText(); // to get the text from a location 

	}

}
