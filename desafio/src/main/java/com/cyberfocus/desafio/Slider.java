package com.cyberfocus.desafio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "G:\\Google Chrome\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       // Abre a página de registro
     

       driver.manage().window().maximize();
       driver.get("https://demo.automationtesting.in/Slider.html");
       
       
	  	 // Localizar o elemento handle pelo atributo class
	  	    WebElement handle = driver.findElement(By.cssSelector("a.ui-slider-handle.ui-state-default.ui-corner-all"));


	  	      // Criar um objeto JavascriptExecutor para executar scripts no navegador
	  	      JavascriptExecutor jsc = (JavascriptExecutor) driver;
	  	      
	  	    // Alterar o atributo style do elemento handle para mover o handle para 50% da barra usando js.executeScript
	  	    jsc.executeScript("arguments[0].setAttribute('style', 'left: 50%;')", handle);
}
}
