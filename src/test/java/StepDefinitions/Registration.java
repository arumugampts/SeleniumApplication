package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Registration {
    WebDriver driver=new ChromeDriver();
    @Given("I enter the url of Registraion domain")
public void i_enter_the_url_of_registraion_domain() {
    // Write code here that turns the phrase above into concrete actions
     driver.get("https://demowebshop.tricentis.com/register");
     driver.getTitle();
}
@When("I enter customer Registration Details")
public void i_enter_customer_registration_details() {
    // Write code here that turns the phrase above into concrete actions
        WebElement genderMale=driver.findElement(By.id("gender-male"));
        genderMale.click();
        WebElement firtsname=driver.findElement(By.xpath("//input[@id='FirstName']"));
        firtsname.sendKeys("Arumugam");
        WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
        lastname.sendKeys("Paramaisvam");
        WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
        Email.sendKeys("Sixface12@gmail.com");
        WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
        Password.sendKeys("Password@12345");
        WebElement ConPassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        ConPassword.sendKeys("Password@12345");
        WebElement RegistButton=driver.findElement(By.xpath("//input[@id='register-button']"));
        RegistButton.click();
    }       

@Then("I can able to Registration successfully")
public void i_can_able_to_registration_successfully() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Regsitration Successfull");
         driver.quit();
}
}
