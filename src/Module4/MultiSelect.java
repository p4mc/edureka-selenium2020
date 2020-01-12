package Module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate a Browser - Open Browser
				//Chrome
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marco\\Documents\\Jars and Drivers\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Open AUT
				driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
				
				Select oSelect = new Select(driver.findElement(By.id("selenium_commands")));
				oSelect.selectByIndex(2);
				
				Thread.sleep(5000);
				oSelect.deselectByVisibleText("Switch Commands");
				
				//Part 2
				//to run the list loop to select and deselect all options one by one
				List<WebElement> oList = oSelect.getOptions();
				//
				int oListTotal = oList.size();
				for(int i=0; i<oListTotal; i++){
					// to get the text of the options available
					String oValue = oList.get(i).getText();
					System.out.println(oValue);
					oSelect.selectByIndex(i);
					
					Thread.sleep(5000);
					
					//oSelect.deselectByIndex(i);
		
				}
				
				//Part 3
				oSelect.deselectAll();

	}

}
