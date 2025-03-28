package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class computerdb {
    WebDriver driver=new ChromeDriver();
    @Given("I enter the url of ComputerDatabase")
public void i_enter_the_url_of_computer_database() {
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://computer-database.gatling.io/computers?f=mas");
    driver.getTitle();
}
@When("I enter the ComputerDatabase Details")
public void i_enter_the_computer_database_details() {
    // Write code here that turns the phrase above into concrete actions
    WebElement addnewComputer=driver.findElement(By.id("add"));
    addnewComputer.click();
    WebElement compname=driver.findElement(By.id("name"));
    compname.sendKeys("AcerIndia202526");
    WebElement addnewComputers=driver.findElement(By.xpath("//input[@class='btn primary']"));
    addnewComputers.click();
   
}
@Then("I can able to add the new ComputerDatabase")
public void i_can_able_to_add_the_new_computer_database() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Computer Databased Added Successfully");
    
}
    
}
