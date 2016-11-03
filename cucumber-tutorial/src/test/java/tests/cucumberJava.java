package cucumberJava;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

import pages.Home;
import pages.RegisterPage;

public class cucumberJava {
    WebDriver driver = null;
    Home home;
    RegisterPage registerPage;

    @Given("^I have open the browser$")
    public void i_have_open_the_browser() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^I open QA Test website$")
    public void i_open_qa_test_website() {
        driver.navigate().to("http://qa-test.avenuecode.com/");
        home = new Home(driver);
        registerPage = new RegisterPage(driver);
    }

    @Given("^Register button should exist$")
    public void register_button_should_exist() {
        assertTrue("Register button is not visible!", home.btnRegisterIsVisible());
    }

    @When("^I click on the register button$")
    public void i_click_on_the_register_button() {
        home.btnRegisterClick();
    }

    @Then("^Register page should be displayed$")
    public void register_page_should_be_displayed(){
        assertTrue("I'm not able to load the register page!", home.formSignUpIsVisible());
    }

    @When("^Fill all the inputs$")
    public void fill_all_the_inputs() {
        registerPage.fillTheInputs();
    }

    @When("^Submit the register$")
    public void submit_the_register() {
        registerPage.submit();
    }

    @Then("^Success Message should be displayed$")
    public void success_Message_should_be_displayed() {
        assertTrue("There is a error on the signup!", home.successMessageShouldBeDisplayed());
    }

    @Then("^Close browser$")
    public void close_browser() {
        home.closeBrowser();
    }
}
