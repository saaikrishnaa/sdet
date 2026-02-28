package com.rcta.handson.designpatterns.sdet;

import com.rcta.handson.designpatterns.sdet.enums.Browser;
import com.rcta.handson.designpatterns.sdet.pages.HomePage;
import com.rcta.handson.designpatterns.sdet.pages.LoginPage;
import org.junit.jupiter.api.Assertions;


public class LoginTests {
    public static void main(String[] args) throws InterruptedException {
        HomePage homePage = new HomePage(Browser.EDGE);
        LoginPage loginPage = homePage.goToLoginPage();

        String loggedInUserName = loginPage.loginWithCredentails("rokam11637@mekuron.com", "ska123").getLoggedinUsername();
        Assertions.assertEquals("Sk A", loggedInUserName);
        System.out.println(loggedInUserName);
    }
}
