package com.Raymond_James.pages;

import com.Raymond_James.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobDescription extends BasePage{

    public JobDescription(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='topNavInterface.answerConfirmBeaconReset']")
    public WebElement applyButton;
}
