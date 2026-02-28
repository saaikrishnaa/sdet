package com.rcta.handson.designpatterns.sdet.pages;

import com.rcta.handson.designpatterns.sdet.utils.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class LoginPage extends PageUtils {

    private static final By EMAILADDRESS_LOCATOR = By.xpath("//input[@id=\"email\"]");
    private static final By PASSWORD_LOCATOR = By.xpath("//input[@id= \"passwd\"]");
    private static final By SUBMIT_LOCATOR = By.xpath("//button[@id=\"SubmitLogin\"]");


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public MyAccountPage loginWithCredentails(String emailAddress, String password){
        inputValue(EMAILADDRESS_LOCATOR,emailAddress);
        inputValue(PASSWORD_LOCATOR,password);
        click(SUBMIT_LOCATOR);
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        return myAccountPage;
    }




}
