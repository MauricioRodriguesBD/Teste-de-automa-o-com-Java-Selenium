package com.cyberfocus.desafio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DatePicker {

	WebDriver driver = ChromeDriverInitializer.createWebDriver();
	
	 public DatePicker(WebDriver driver, String url) {
	        this.driver = driver;
	        this.driver.get(url);
	    }

	public DatePicker() {
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}

	public  void selecionarData(String data) throws InterruptedException {
	    // Localizar o elemento datepicker pelo id
	    
	    WebElement datepicker = driver.findElement(By.id("datepicker1"));

	    // Verificar se o datepicker está desabilitado usando o atributo aria-disabled
	    if (datepicker.getAttribute("aria-disabled") != null && datepicker.getAttribute("aria-disabled").equals("true")) {
	        // Imprimir uma mensagem informando que o datepicker está desabilitado
	        System.out.println("O datepicker está desabilitado.");
	    } else {
	        // Imprimir uma mensagem informando que o datepicker está habilitado
	        System.out.println("O datepicker está habilitado.");

	        // Selecionar uma data usando JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value = '" + data + "';", datepicker);
	    }
	}



	public  void selecionarData2( String data) throws InterruptedException {
		// Localizar o elemento datepicker pelo id
		WebElement datepicker2 = driver.findElement(By.id("datepicker2"));

		// Enviar a data desejada para o elemento datepicker usando sendKeys
		datepicker2.sendKeys(data);
		
		Thread.sleep(5000); // Espera explícita de 5 segundos
		driver.quit();
		
	}
	

}
