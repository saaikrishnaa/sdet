package com.rcta.handson.designpatterns.sdet.pages;

import com.rcta.handson.designpatterns.sdet.enums.Browser;
import com.rcta.handson.designpatterns.sdet.utils.PageUtils;
import org.openqa.selenium.By;

public final class HomePage extends PageUtils {

    private static final By SIGNIN_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]");

//    public HomePage(String browserName){
//        super(browserName);
//        goToUrl("http://www.automationpractice.pl").maximizeWindow();
//    }

    public HomePage(Browser browserName){
        super(browserName);
        goToUrl("http://www.automationpractice.pl").maximizeWindow();
    }

    //In Page Object Design pattern, void return type cannot be used, hence changing the return type from void
    public LoginPage goToLoginPage(){
        click(SIGNIN_LOCATOR);
        LoginPage loginPage = new LoginPage(getDriver());
        return loginPage;
    }
}
