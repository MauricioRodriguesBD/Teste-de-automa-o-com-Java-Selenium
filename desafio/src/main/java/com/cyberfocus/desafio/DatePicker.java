package com.cyberfocus.desafio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\\\\\Google Chrome\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Abre a página de registro

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Datepicker.html");

		// Localizar o elemento datepicker pelo id
		WebElement datepicker = driver.findElement(By.id("datepicker1"));

		// Verificar se o datepicker está desabilitado usando o atributo aria-disabled
		if (datepicker.getAttribute("aria-disabled") != null
				&& datepicker.getAttribute("aria-disabled").equals("true")) {
			// Imprimir uma mensagem informando que o datepicker está desabilitado
			System.out.println("O datepicker está desabilitado.");
		} else {
			// Imprimir uma mensagem informando que o datepicker está habilitado
			System.out.println("O datepicker está habilitado.");

			// Selecionar uma data usando JavascriptExecutor
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = '07/02/1997';", datepicker);

			// Localizar o elemento datepicker pelo id
			WebElement datepicker2 = driver.findElement(By.id("datepicker2"));

			// Enviar a data desejada para o elemento datepicker usando sendKeys
			datepicker2.sendKeys("07/02/1997");
		}
	}
}
