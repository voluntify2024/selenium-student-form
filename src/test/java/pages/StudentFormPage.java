package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.io.File;

public class StudentFormPage {

    WebDriver driver;

    public StudentFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    public void enterName(String name) {
        driver.findElement(By.id("name")).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void enterMobile(String mobile) {
        driver.findElement(By.id("mobile")).sendKeys(mobile);
    }

    public void selectGender() {
        driver.findElement(By.cssSelector("input[name='gender']")).click();
    }

    public void enterDOB(String date) {
        driver.findElement(By.id("dob")).sendKeys(date);
    }

    public void enterSubject(String subject) {
        WebElement el = driver.findElement(By.id("subjects"));
        el.click();
        el.sendKeys(subject);
    }

    public void selectHobby() {
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
    }

    public void uploadFile() {

        File file = new File("src/test/resources/files/picture.jpg");

        driver.findElement(By.id("picture"))
                .sendKeys(file.getAbsolutePath());
    }

    public void enterAddress(String address) {
        driver.findElement(By.tagName("textarea")).sendKeys(address);
    }

    public void selectStateCity(String state, String city) {
        new Select(driver.findElement(By.id("state"))).selectByVisibleText(state);
        new Select(driver.findElement(By.id("city"))).selectByVisibleText(city);
    }

    public void submit() {
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
}