package com.cyberfocus.desafio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.*;




public class Frame {
	public static void main(String[] args) throws InterruptedException {

		// desafio 2

		System.setProperty("webdriver.chrome.driver", "G:\\\\\\\\Google Chrome\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Abre a página de registro

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		// Encontrar o frame pelo ID
		WebElement frame = driver.findElement(By.id("singleframe"));

		// Mudar o foco do driver para o frame
		driver.switchTo().frame(frame);

		// Localizar o elemento input dentro do frame e enviar o texto desejado
		WebElement input = driver.findElement(By.tagName("input"));
		input.sendKeys("Texto de exemplo");
	}
}
