package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private WebDriver driver;
    By btnSignIn,
            btnSignUp,
            btnSignOut,
            btnMyTasksHeader,
            registerForm,
            successMessage;

    public Home(WebDriver driver) {
        this.driver = driver;

        this.btnSignIn = By.xpath("//a[@href=\"/users/sign_in\"]");
        this.btnSignUp = By.xpath("//a[contains(@href,\"/users/sign_up\")]");
        this.btnSignOut = By.xpath("//a[contains(@href, \"/users/sign_out\")]");
        this.btnMyTasksHeader = By.xpath("//a[@href=\"/tasks\"]");
        this.registerForm = By.id("new_user");
        this.successMessage = By.xpath("//div[@class='alert alert-info']");

        driver.get("http://qa-test.avenuecode.com");
    }

    public void closeBrowser() {
        driver.close();
    }
    public boolean btnRegisterIsVisible() {
        return driver.findElement(btnSignUp).isEnabled() ? true : false;
    }

    public void btnRegisterClick() {
        driver.findElement(btnSignUp).click();
    }

    public boolean formSignUpIsVisible() {
        return driver.findElement(registerForm).isDisplayed() ? true : false;
    }

    public boolean successMessageShouldBeDisplayed() {
        return driver.findElement(successMessage).isDisplayed() ? true : false;
    }
}