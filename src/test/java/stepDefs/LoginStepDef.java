package stepDefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	WebDriver driver;
	
		@Given("User is already on login page")
		public void user_is_already_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/login");
			
		}
		   
	//	@When("User enters login credentials")
	//	public void user_enters_login_credentials() {
	//		
	//		driver.findElement(By.name("username")).sendKeys("tomsmith");
	//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	//		driver.findElement(By.cssSelector(".radius")).click();
	//	
		
	//	}
			
		
		
		//	@When("User enters {string} and {string}")
		//	public void user_enters_and(String strUser, String strPwd) {
		//		driver.findElement(By.name("username")).sendKeys(strUser);
		//		driver.findElement(By.name("password")).sendKeys(strPwd);
		//		driver.findElement(By.cssSelector(".radius")).click();
			
		//	}


		
		//data as lists
		//	@When("User enters login credentials")
		//		public void user_enters_login_credentials(DataTable userCred) {
		//			List<List<String>> data = userCred.asLists();
		
		//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
				
		//			driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		//		driver.findElement(By.cssSelector(".radius")).click();
			
				
		//		}

			//datatable as Maps
			@When("User enters login credentials")
				public void user_enters_login_credentials(DataTable userCred) {
					
				List<Map<String, String>> data = userCred.asMaps();
		
				driver.findElement(By.name("username")).sendKeys(data.get(0).get("username"));
				driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
				driver.findElement(By.cssSelector(".radius")).click();
			
				
				}
		    
		@Then("User us is on Home Page")
		public void user_us_is_on_home_page() {
			boolean isValidUser = driver.findElement(By.cssSelector("div.success")).isDisplayed();
			Assert.assertTrue(isValidUser);  
		}




}
