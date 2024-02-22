package com.Raymond_James.pages;

import com.Raymond_James.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarriersPage extends BasePage {

    public CarriersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Search Open Positions']")
    public WebElement positionTab;
}
