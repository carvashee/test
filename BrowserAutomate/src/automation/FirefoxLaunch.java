package automation;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirefoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CarvaShe\\Documents\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		

		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='email_create']")));
		
		Select sel = new Select(driver.findElement(By.id("")));
		sel.selectByVisibleText("");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id(""))).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File.utils.copyFile(src,(""));
		
		
				
		
	}

}
