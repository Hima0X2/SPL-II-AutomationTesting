package AutomationTesting;

import org.openqa.selenium.WebDriver;

public class PageDriver {
public static final ThreadLocal<WebDriver> webdriver=new ThreadLocal<WebDriver>();
public static PageDriver instance=null;
PageDriver(){
	
}
public static PageDriver getInstance() {
	if(instance==null) {
		instance=new PageDriver();
	}
	return instance;
}
public WebDriver getDrive() {
	return webdriver.get();
}
public void setDrive(WebDriver driver) {
	webdriver.set(driver);
}
public static WebDriver getCurrentDriver() {
	return getInstance().getDrive();
}
}
