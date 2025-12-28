package com.rcta.handson.sdet.pages;

import com.rcta.handson.sdet.utils.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class MyAccountPage extends PageUtils {

    private static final By LOGGEDIN_USERNAME = By.xpath("//a[@title='View my customer account']/span");

    public MyAccountPage(WebDriver driver){
        super(driver);
    }

    public String getLoggedinUsername() {
        return getVisibleText(LOGGEDIN_USERNAME);
    }
}
