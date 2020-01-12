package Module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		//Instantiate a Browser - Open Browser
				//Chrome
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marco\\Documents\\Jars and Drivers\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Open AUT
				driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
				
				Select oSelect = new Select(driver.findElement(By.id("continents")));
				oSelect.selectByIndex(2);

	}

}
