package com.rcta.handson.sdet;

import com.rcta.handson.sdet.pages.HomePage;
import com.rcta.handson.sdet.pages.LoginPage;
import org.junit.jupiter.api.Assertions;


public class LoginTests {
    public static void main(String[] args) throws InterruptedException {
        HomePage homePage = new HomePage("edge");
        LoginPage loginPage = homePage.goToLoginPage();

        String loggedInUserName = loginPage.loginWithCredentails("rokam11637@mekuron.com", "ska123").getLoggedinUsername();
        Assertions.assertEquals("Sk A", loggedInUserName);
        System.out.println(loggedInUserName);
    }
}
