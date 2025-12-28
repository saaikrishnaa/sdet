package com.rcta.handson.sdet.pages;

import com.rcta.handson.sdet.utils.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class HomePage extends PageUtils {

    private static final By SIGNIN_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]");

    public HomePage(WebDriver driver){
        super(driver);
        maximizeWindow().goToUrl("http://www.automationpractice.pl");

    }

    //In Page Object Design pattern, void return type cannot be used, hence changing the return type from void
    public LoginPage goToLoginPage(){
        click(SIGNIN_LOCATOR);
        LoginPage loginPage = new LoginPage(getDriver());
        return loginPage;
    }
}
