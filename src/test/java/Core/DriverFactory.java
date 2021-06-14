package Core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver(){


		if(driver == null) {
			switch (Propriedades.browser) {
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: driver = new ChromeDriver(); break;

			}

			ChromeOptions options = new ChromeOptions(); //config para usar azuredevops
			//options.addArguments("--headless"); //config para usar azuredevops
//			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			//driver.manage().window().setSize(new Dimension(1200, 765));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}


		return driver;


	}

	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
