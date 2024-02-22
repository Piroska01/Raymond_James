package com.Raymond_James.pages;

import com.Raymond_James.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSearchPage extends BasePage{
    public JobSearchPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='KEYWORD']")
    public WebElement keywordBox;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement magnifier;

    @FindBy(xpath = "//a[@title='Senior Quality Assurance Engineer']")
    public WebElement jobLink;
}
