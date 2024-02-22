package com.Raymond_James.pages;

import com.Raymond_James.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "#dialogTemplate-dialogForm-login-name1")
    public WebElement username;

    @FindBy(id="#dialogTemplate-dialogForm-login-password")
    public WebElement password;

    @FindBy(id ="#dialogTemplate-dialogForm-login-defaultCmd")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[.='Job Search']")
    public WebElement jobSearchText;
}
