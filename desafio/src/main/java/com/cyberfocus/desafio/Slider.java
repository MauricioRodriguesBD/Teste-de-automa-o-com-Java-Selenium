package com.cyberfocus.desafio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Slider {

	WebDriver driver = ChromeDriverInitializer.createWebDriver();

	public Slider() throws InterruptedException {

		driver.get("https://demo.automationtesting.in/Slider.html");

	}

	public Slider(WebDriver driver) {
		this.driver = driver;
	}

	public void moverBarra(String valorLeft) throws InterruptedException {
		// Localizar o elemento handle pelo atributo class
		WebElement handle = driver.findElement(By.cssSelector("a.ui-slider-handle.ui-state-default.ui-corner-all"));

		// Criar um objeto JavascriptExecutor para executar scripts no navegador
		JavascriptExecutor jsc = (JavascriptExecutor) driver;

		// Alterar o atributo style do elemento handle para mover o handle para o valor
		// desejado da barra usando js.executeScript
		String script = String.format("arguments[0].setAttribute('style', 'left: %s;')", valorLeft);
		jsc.executeScript(script, handle);

		Thread.sleep(5000); // Espera explícita de 5 segundos
		
		driver.quit();
	}
}
