package com.cyberfocus.desafio;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.*;


public class Cadastro   {
	
	
	  private WebDriver driver;
	  
	    
	    public Cadastro() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "G:\\\\Google Chrome\\\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.automationtesting.in/Register.html");
	        
	        Thread.sleep(5000); // Espera explícita de 5 segundos
	        driver.navigate().refresh(); // Executa o Ctrl + F5
	        Thread.sleep(5000); // Espera explícita de 5 segundos
	    }

	    public Cadastro(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void preencherFormulario(String firstName,
	                                    String lastName,
	                                    String address,
	                                    String email,
	                                    String phone,
	                                    String genderValue,
	                                    String hobbiesValue,
	                                    String languageValue,
	                                    String skillValue,
	                                    String countryValue,
	                                    String yearValue,
	                                    String monthValue,
	                                    String dayValue,
	                                    String password) {
	        // preencher first name
	        WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	        firstNameField.sendKeys(firstName);

	        // preencher last name
	        WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	        lastNameField.sendKeys(lastName);

	        // preencher address
	        WebElement addressField = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	        addressField.sendKeys(address);

	        // preencher email
	        WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
	        emailField.sendKeys(email);

	        // preencher phone
	        WebElement phoneField = driver.findElement(By.xpath("//input[@type='tel']"));
	        phoneField.sendKeys(phone);

	        // selecionar gênero
	        WebElement gender = driver.findElement(By.xpath("//input[@value='" + genderValue + "']"));
	        gender.click();

	        // selecionar hobbies
	        WebElement hobbies = driver.findElement(By.xpath("//input[@value='" + hobbiesValue + "']"));
	        hobbies.click();

	        // Selecionar o idioma
	        WebElement languagesDropdown = driver.findElement(By.xpath("//div[@id='msdd']"));
	        languagesDropdown.click();

	        // Selecionar a opção de idioma
	        WebElement languageOption = driver.findElement(By.xpath("//a[contains(text(), '" + languageValue + "')]"));
	        languageOption.click();

	        // Selecionar habilidades
	        WebElement skills = driver.findElement(By.xpath("//*[@id='Skills']"));
	        Select skillsDropdown = new Select(skills);
	        skillsDropdown.selectByVisibleText(skillValue);

	        // Selecionar país
	        WebElement country = driver.findElement(By.id("country"));
	        Select countryDropdown = new Select(country);
	        countryDropdown.selectByVisibleText(countryValue);

	        // Selecionar ano
	        WebElement year = driver.findElement(By.id("yearbox"));
	        Select yearDropdown = new Select(year);
	        yearDropdown.selectByVisibleText(yearValue);

	        // Selecionar mês
	        WebElement month = driver.findElement(By.cssSelector("select[placeholder='Month']"));
	        Select monthDropdown = new Select(month);
	        monthDropdown.selectByValue(monthValue);

	        // Selecionar dia
	        WebElement day = driver.findElement(By.id("daybox"));
	        Select dayDropdown = new Select(day);
	        dayDropdown.selectByValue(dayValue);

	        // Selecionar senha
	        WebElement passwordField1 = driver.findElement(By.id("firstpassword"));
	        passwordField1.sendKeys(password);

	        // Confirmar senha
	        WebElement passwordField2 = driver.findElement(By.id("secondpassword"));
	        passwordField2.sendKeys(password);
    }
    

}

