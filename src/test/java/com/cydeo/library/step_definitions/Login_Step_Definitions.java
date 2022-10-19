package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Login_Page;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Login_Step_Definitions {

    Login_Page loginPage = new Login_Page();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get("https://library2.cydeo.com/login.html");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("librarian1.username"));
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("librarian1.password"));
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        loginPage.loginButton.click();
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        loginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("student2.username"));
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("student2.password"));
    }
}
