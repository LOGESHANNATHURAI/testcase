package knoovs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class kavya {
	public WebDriver driver;
	
	public void precondition(){
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void postcondition() {
		driver.manage().window().minimize();
		driver.quit();
	}
	                   
	                 //concatination operation
	@Test
		public void concatination() throws Throwable {
		precondition();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 1000).perform();
		WebElement build = driver.findElement(By.xpath("//select[@onchange='buildChanged(this.preset)']"));
		Select concatebuild = new Select(build);
		concatebuild.selectByValue("1");
		WebElement firstnumber = driver.findElement(By.xpath("//input[@name='number1']"));
		firstnumber.sendKeys("25");
		WebElement secondnumber = driver.findElement(By.xpath("//input[@name='number2']"));
		secondnumber.sendKeys("1");
		WebElement operation = driver.findElement(By.xpath("//select[@onchange='operationChanged(this.preset)']"));
		Select concatinationbuild = new Select(operation);
		concatinationbuild.selectByVisibleText("Concatenate");
		driver.findElement(By.xpath("//input[@id='calculateButton']")).click();
		postcondition();
			
	}
	
	          //Addition operation
	@Test
	public void add() throws Throwable {
		precondition();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 1000).perform();
		WebElement build = driver.findElement(By.xpath("//select[@onchange='buildChanged(this.preset)']"));
		Select concatebuild = new Select(build);
		concatebuild.selectByValue("5");
		WebElement firstnumber = driver.findElement(By.xpath("//input[@name='number1']"));
		firstnumber.sendKeys("10");
		WebElement secondnumber = driver.findElement(By.xpath("//input[@name='number2']"));
		secondnumber.sendKeys("5");
		WebElement operation = driver.findElement(By.xpath("//select[@onchange='operationChanged(this.preset)']"));
		Select concatinationbuild = new Select(operation);
		concatinationbuild.selectByVisibleText("Add");
		driver.findElement(By.xpath("//input[@id='calculateButton']")).click();	
		postcondition();
	}

}
