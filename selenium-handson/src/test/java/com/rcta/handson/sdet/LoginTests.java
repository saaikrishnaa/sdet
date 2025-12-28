package com.rcta.handson.sdet;

import com.rcta.handson.sdet.pages.HomePage;
import com.rcta.handson.sdet.pages.LoginPage;
import com.rcta.handson.sdet.utils.PageUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.goToLoginPage();

        String loggedInUserName = loginPage.loginWithCredentails("rokam11637@mekuron.com", "ska123").getLoggedinUsername();
        Assertions.assertEquals("Sk A", loggedInUserName);
        driver.close();
    }
}
