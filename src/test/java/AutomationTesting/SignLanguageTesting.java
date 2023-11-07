package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignLanguageTesting extends BaseDrive{
	String url="http://localhost/spl/";
	@Test
	public void name() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		WebElement slide = driver.findElement(By.id("toggleSidebar"));
		slide.click();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sanjidasamanta277@gmail.com");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("1234");
		pass.click();
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		submit.click();
		Thread.sleep(2000);
		WebElement convertToTextBtn = driver.findElement(By.id("convertToTextBtn"));
		convertToTextBtn.click();
		Thread.sleep(2000);
		WebElement letters = driver.findElement(By.id("letters"));
		letters.sendKeys("Sam");
		Thread.sleep(2000);
		WebElement convertsign = driver.findElement(By.xpath("//button[contains(text(),'Convert to Sign Language')]"));
		convertsign.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement Dconvertsign = driver.findElement(By.xpath("//button[contains(text(),'Dynamic Sign Language')]"));
		Dconvertsign.click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
		
		WebElement brailletToTextBtn = driver.findElement(By.id("convertTobralBtn"));
		brailletToTextBtn.click();
		Thread.sleep(2000);
		WebElement entertext = driver.findElement(By.xpath("//textarea[@id='english-text']"));
		entertext.sendKeys("Hello");
		Thread.sleep(2000);
		WebElement convert = driver.findElement(By.xpath("//body/div[1]/form[1]/input[1]"));
		convert.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement convertTobrlBtn = driver.findElement(By.id("convertTobrlBtn"));
		convertTobrlBtn.click();
		Thread.sleep(2000);
		WebElement S = driver.findElement(By.id("S"));
		S.click();
		Thread.sleep(2000);
		WebElement A = driver.findElement(By.id("A"));
		A.click();
		Thread.sleep(2000);
		WebElement M = driver.findElement(By.id("M"));
		M.click();
		Thread.sleep(2000);
		A.click();
		Thread.sleep(2000);
		WebElement N = driver.findElement(By.id("N"));
		N.click();
		Thread.sleep(2000);
		WebElement T = driver.findElement(By.id("T"));
		T.click();
		Thread.sleep(2000);
		A.click();
		Thread.sleep(2000);
		WebElement convertbrltotxt = driver.findElement(By.xpath("//body/form[1]/input[2]"));
		convertbrltotxt.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
}
