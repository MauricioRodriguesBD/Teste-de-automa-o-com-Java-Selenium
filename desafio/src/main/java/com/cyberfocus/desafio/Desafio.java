package com.cyberfocus.desafio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.time.Duration;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Desafio {
	
	public static void main(String[] args) throws InterruptedException  {
		
			Cadastro cadastro = new Cadastro();

			cadastro.preencherFormulario("Mauricio", "Rodrigues", "Rua abc, 123", "mauricio.rodriguesbd@gmail.com", "11999999999", "Male", "Cricket", "English", "Java", "Japan", "2000", "February", "15", "senha123");

//			driver.quit();
			
			
		}

		}
	      














