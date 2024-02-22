package com.Raymond_James.step_definition;

import com.Raymond_James.pages.*;
import com.Raymond_James.utilities.BrowserUtil;
import com.Raymond_James.utilities.ConfigurationReader;
import com.Raymond_James.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class test01_step_definition {

    BasePage basePage =new BasePage() {
    };
    CarriersPage carriersPage = new CarriersPage();
    JobSearchPage jobSearchPage =new JobSearchPage();
    JobDescription jobDescription = new JobDescription();
    LoginPage loginPage =new LoginPage();
    @Given("user is on the home page")
    public void user_is_on_the_home_page() {


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user verify that title contains {string}")
    public void user_verify_that_title_contains(String expectedTitle) {

        BrowserUtil.verifyTitleContains(expectedTitle);
    }

    @When("user scroll down to Carriers tab and clicks on it")
    public void user_scroll_down_to_carriers_tab_and_clicks_on_it() {
        //BrowserUtil.waitFor(20);

        basePage.cookie.click();

        BrowserUtil.scrollToElement(basePage.CarriersTab);

        basePage.CarriersTab.click();



    }

    @When("user navigates to carriers page and clicks on Search Open Positions")
    public void user_navigates_to_carriers_page_and_clicks_on_search_open_positions() {
            carriersPage.positionTab.click();
    }

    @When("user types Senior Quality Assurance Engineer in the keyword box")
    public void user_types_senior_quality_assurance_engineer_in_the_keyword_box() {

        BrowserUtil.waitForVisibility(jobSearchPage.keywordBox,20);
        jobSearchPage.keywordBox.sendKeys("Senior Quality Assurance Engineer");

    }

    @When("user clicks on the magnifier search")
    public void user_clicks_on_the_magnifier_search() {

       jobSearchPage.magnifier.click();

    }

    @When("user clicks on Senior Quality Assurance Engineer link")
    public void user_clicks_on_senior_quality_assurance_engineer_link() {

        jobSearchPage.jobLink.click();
    }

    @When("user clicks on Apply Online button")
    public void user_clicks_on_apply_online_button() {

        jobDescription.applyButton.click();

    }

    @When("user is on the log in page type {string} and {string}")
    public void user_is_on_the_log_in_page_type_and(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }

    @When("user clicks Login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();

    }

    @Then("user verify Job Search text")
    public void user_verify_job_search_text() {
        Assert.assertTrue(loginPage.jobSearchText.isDisplayed());

    }


}
