package StepDefinition;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcase {
	WebDriver driver;

	@Given("^I have firefox browser running$")
	public void i_have_firefox_browser_running()  {
		System.setProperty("webdriver.gecko.driver","/Users/pravin/Documents/driver/geckodriver");
		 driver = new FirefoxDriver();
	   
	}

	@When("^I go the website$")
	public void i_go_the_website()  {
		driver.get("http://opensource.demo.orangehrmlive.com/");
	    
	}
	
	    
	@When("^I have enter the valid username$")
	public void i_have_enter_the_valid_username()  {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	   
	}
	@When("^I have enter the valid password$")
	public void i_have_enter_the_valid_password() {
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	
	}
	@When("^I click the login button$")
	public void i_click_the_login_button()  {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    
	}

	@Then("^I should see a logout button$")
	public void i_should_see_a_logout_button()  {
		System.out.println("logout is present");
	   
	}


@Given("^I have chrome browser running$")
public void i_have_chrome_browser_running()  {
	System.setProperty("webdriver.chrome.driver","/Users/pravin/Documents/driver/chromedriver");
	 driver = new ChromeDriver();
    
}

@Given("^I have a Firefox browser running$")
public void i_have_a_Firefox_browser_running()  {
   
}

@Given("^i go to orangehrmlive Website$")
public void i_go_to_orangehrmlive_Website()  {
   
}

@When("^I enter the username and valid password$")
public void i_enter_the_username_and_valid_password(DataTable username)  {  
	
	List<List<String>>name =username.raw();
	driver.findElement(By.xpath("")).sendKeys(name.get(0).get(0));
	driver.findElement(By.xpath("")).sendKeys(name.get(0).get(0));
   
}

@When("^I click the login Button$")
public void i_click_the_login_Button()  {
    
}

@Then("^I should see WelcomeAdmin$") 
   public void i_should_see_WelcomeAdmin() {
}

@Then("^I click on Recruitment button$")
public void i_click_on_Recruitment_button() {
   
}

@Then("^I click on Add Button$")
public void i_click_on_Add_Button() {
   
}

@Then("^I enter Firstname,Middlename,Lastname$")
public void i_enter_Firstname_Middlename_Lastname(DataTable Fullname) {
	
	List<List<String>>dataFullname =Fullname.raw();
	driver.findElement(By.xpath("")).sendKeys(dataFullname.get(0).get(0));
	driver.findElement(By.xpath("")).sendKeys(dataFullname.get(0).get(1));
	driver.findElement(By.xpath("")).sendKeys(dataFullname.get(0).get(2));

}

@Then("^I enter Email$")
public void i_enter_Email(DataTable arg1)  {
   
   
}

@Then("^I click  on saveButton$")
public void i_click_on_saveButton()  {
   
}
// GlobalHOOKS
@Before()
public void runBrowser()  {
	System.setProperty("webdriver.gecko.driver","/Users/pravin/Documents/driver/geckodriver");
	 driver = new FirefoxDriver();
}

// Local Hook
@Before("@First")
public void gotoUrl() {
	driver.get("http://opensource.demo.orangehrmlive.com/");
}

@After("@First")
public void quitBrowser() {
	driver.quit();
}


@After()
public void closeBrowser() {
	driver.quit();
}
}

    



