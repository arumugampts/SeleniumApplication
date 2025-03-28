package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginDemo {
    WebDriver driver = new ChromeDriver();
@Given("I enter the url of domain")
public void i_enter_the_url_of_domain() {
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://demowebshop.tricentis.com/Login");
    driver.getTitle();
   }
@When("I enter customer credentials")
public void i_enter_customer_credentials() {
    // Write code here that turns the phrase above into concrete actions
    
        WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
        Email.sendKeys("Sixface12@gmail.com");
        WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
        Password.sendKeys("Password@12345");
        WebElement Login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Login.click();
        
  
}
@Then("I can login domain successfully")
public void i_can_login_domain_successfully() {
    // Write code here that turns the phrase above into concrete actions
    //WebElement message = driver.findElement(By.id("message"));
       // message.getText();
       boolean isLoginSuccessful=driver.findElement(By.linkText("Log out")).isDisplayed();
       if(isLoginSuccessful)
       {
        System.out.println("Login successful!");
       }
       else
       {
        System.out.println("Login failed!");
       }
        driver.quit();
   
}
}
