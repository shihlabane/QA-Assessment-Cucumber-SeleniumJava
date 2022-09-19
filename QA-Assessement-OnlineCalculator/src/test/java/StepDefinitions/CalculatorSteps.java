package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalculatorSteps {
	
	Date currentdate = new Date();
	String screenshot = currentdate.toString().replace(" ", "-").replace(":", "-");
	WebDriver driver =null;
	
	@Given("User Launch ChromeBrowser")
	public void user_launch_chrome_browser() {
	 
        System.out.println("Inside - User Launch Browser");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath +"/src/test/resources/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	@When("User Open URL {string}")
	public void user_open_url(String string) {
		
        System.out.println("Inside - User open URL");		
		driver.navigate().to(string);
	}

	@Then("The displayer should show  zero.")
	public void the_displayer_should_show_zero() throws IOException {
		 
	    System.out.print("Inside - displa show zero");
				
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@And("user click One divide by x button")
	public void user_click_one_divide_by_x_button() throws IOException {
		  
		    System.out.print("Inside - user click 1/x button");
			
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@Then("The displayer should show Error .")
	public void the_displayer_should_show_error() throws IOException {
		
		System.out.print("Inside - Display show error");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	    
	}
	
	@Then("The displayer should shows zero")
	public void the_displayer_should_shows_zero() throws IOException {


		System.out.print("Inside - displaye shows zero");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@And("User click three buttton")
	public void user_click_three_buttton() throws IOException {
		
		System.out.print("Inside - user click  button");
		
		var canvas = driver.findElement(By.id("fullframe"));
		
		//clicking on 3
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,(255/6)*3).click().build().perform();
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@And("User click CE button")
	public void user_click_ce_button() throws IOException {
	    
		System.out.print("Inside - user click CE button");
	    var canvas = driver.findElement(By.id("fullframe"));
			
	     //clicking on +
	     new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((93/5)*4,(12/6)*3).click().build().perform();
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}
	@And("User click three button")
	public void user_click_three_button() throws IOException {
	    
		System.out.print("Inside - user click 3 button");
		
        var canvas = driver.findElement(By.id("fullframe"));
		
		//clicking on 3
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,(255/6)*3).click().build().perform();
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@And("User click addition button")
	public void user_click_addition_button() throws IOException {
		
		
		System.out.print("Inside - user click + button");
		
        var canvas = driver.findElement(By.id("fullframe"));
		
		//clicking on +
        new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*2,(255/6)*5).click().build().perform();
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@And("User click one button")
	public void user_click_one_button() throws IOException {
	    
		System.out.print("Inside - user click 1 button");
        var canvas = driver.findElement(By.id("fullframe"));
		
		//clicking on 1
        new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-(174/5)*4,(255/6)*3).click().build().perform();
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@And("User click equal button")
	public void user_click_equal_button() throws IOException {
		
		System.out.print("Inside - user click = button");
		var canvas = driver.findElement(By.id("fullframe"));
		
		//clicking on equals to sign (=)
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*4,(255/6)*5).click().build().perform();
		
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@Then("The displayer should shown four")
	public void the_displayer_should_shown_four() throws IOException {
	    
		System.out.print("Inside - the Display show 4");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@And("User click substraction button")
	public void user_click_substraction_button() throws IOException {
		
		System.out.print("Inside - user click - button");
		
		var canvas = driver.findElement(By.id("fullframe"));
		
		//clicking on the substract sign (-)
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*2,(255/6)*3).click().build().perform();
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	@Then("The displayer should shown two")
	public void the_displayer_should_shown_one() throws IOException {
	  
		System.out.print("Inside - The display show 2");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+ screenshot+".png"));
	}

	
	
	
	
	

}
