package com.rcta.handson.sdet;

import com.rcta.handson.sdet.config.SeleniumConfig;
import com.rcta.handson.sdet.utils.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = SeleniumConfig.class)
public class LoginTests extends AbstractTestNGSpringContextTests {

    @Autowired
    private WebDriver driver;

    @Autowired
    private PageUtils utils;

    @Test
    public void run() throws InterruptedException {

        utils.maximizeWindow().goToUrl("http://www.automationpractice.pl");

        //locate sign in and click it
        By signInLinkLocator = By.xpath("//a[contains(text(),\"Sign in\")]");
        utils.click(signInLinkLocator);

        //find the email address, input the email address
        By emailAddressIdLocator = By.xpath("//input[@id=\"email\"]");
        utils.inputValue(emailAddressIdLocator, "wiromej146@mekuron.com");

        //find the password, input the password
        By passwordLocator = By.xpath("//input[@id= \"passwd\"]");
        utils.inputValue(passwordLocator, "abc123");

        //find the sign in button, click on the sign in button
        By submitButtonLocator = By.xpath("//button[@type=\"submit\"]");
        utils.click(submitButtonLocator);
    }
}
