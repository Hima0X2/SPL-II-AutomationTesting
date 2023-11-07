package AutomationTesting;

import java.net.MalformedURLException; 
import java.net.URL;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Test1{

String url="https://www.lambdatest.com/selenium-playground/";
WebDriver driver=null;
@BeforeSuite
public void start() {
	String browser=System.getProperty("browser","chrome");
	if(browser.contains("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	else if(browser.contains("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}
	else {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	}
}
@Test
public void ButtonTest() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(3000);
	WebElement radio=driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]"));
	radio.click();
	Thread.sleep(3000);
	WebElement female=driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]/input[1]"));
	female.click();
	Thread.sleep(3000);
	WebElement check=driver.findElement(By.xpath("//button[@id='buttoncheck']"));
	check.click();
	System.out.println();
	Thread.sleep(3000);
	WebElement messageElement = driver.findElement(By.className("radiobutton"));
    String message = messageElement.getText();
	 String expectedMessage = "Radio button 'Female' is checked";
     if (message.equals(expectedMessage)) {
         System.out.println("Validation successful. Message matches the expected message.");
     } else {
         System.out.println("Validation failed. Expected: '" + expectedMessage + "', Actual: '" + message + "'");
     }
}
@AfterSuite
public void close() {
	driver.close();
}
}

