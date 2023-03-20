package com.cyberfocus.desafio;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverInitializer {
	
	 
	   public static WebDriver createWebDriver() {
	        System.setProperty("webdriver.chrome.driver", "G:\\Google Chrome\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        return driver;
	    }
}
