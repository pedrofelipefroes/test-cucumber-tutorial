package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Credentials;

public class RegisterPage {
    private WebDriver driver;
    By inputName,
        inputEmail,
        inputPass,
        inputCheckPass,
        btnSignUp;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;

        inputName = By.id("user_name");
        inputEmail = By.id("user_email");
        inputPass = By.id("user_password");
        inputCheckPass = By.id("user_password_confirmation");
        btnSignUp = By.xpath("//input[@type=\"submit\"]");
    }

    public void fillTheInputs() {
        driver.findElement(inputName).sendKeys(Credentials.name);
        driver.findElement(inputEmail).sendKeys(Credentials.email);
        driver.findElement(inputPass).sendKeys(Credentials.pass);
        driver.findElement(inputCheckPass).sendKeys(Credentials.pass);
    }

    public void submit() {
        driver.findElement(btnSignUp).click();
    }
}