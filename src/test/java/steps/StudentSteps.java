package steps;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.StudentFormPage;

public class StudentSteps {

    WebDriver driver;
    StudentFormPage page;

    @Given("user opens the registration page")
    public void openPage() {
        driver = DriverFactory.createDriver();
        page = new StudentFormPage(driver);
        page.open();
    }

    @When("user enters all required details")
    public void fillForm() {

        page.enterName("John Doe");
        page.enterEmail("john@test.com");
        page.enterMobile("1234567890");

        page.selectGender();
        page.enterDOB("10/10/2000");

        page.enterSubject("Math");
        page.selectHobby();

        page.enterAddress("New York");
        page.selectStateCity("NCR", "Agra");

        page.uploadFile();
    }

    @And("user submits the form")
    public void submit() {
        page.submit();
    }

    @Then("form should be submitted successfully")
    public void success() {
        System.out.println("SUCCESS");
        driver.quit();
    }
}