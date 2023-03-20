package com.cyberfocus.desafio;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.*;

public class Frame {

	WebDriver driver = ChromeDriverInitializer.createWebDriver();

	public Frame() throws InterruptedException {	
		driver.get("https://demo.automationtesting.in/Frames.html");
	}

	  public Frame(WebDriver driver, String url) {
	        this.driver = driver;
	        this.driver.get(url);
	    }

	    public void sendTextToFrame(String inputText) throws InterruptedException {
	        WebElement frame = driver.findElement(By.id("singleframe"));
	        driver.switchTo().frame(frame);
	        WebElement input = driver.findElement(By.tagName("input"));
	        input.sendKeys(inputText);
	        driver.switchTo().defaultContent();
	        
	        Thread.sleep(5000); // Espera explícita de 5 segundos
	        
	        driver.quit();
	        
	        
			
	        
	}
	    

}
