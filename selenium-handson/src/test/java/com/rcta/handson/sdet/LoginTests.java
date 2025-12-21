package com.rcta.handson.sdet;

import com.rcta.handson.sdet.utils.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        PageUtils utils = new PageUtils(driver);
        utils.maximizeWindow().goToUrl("http://www.automationpractice.pl");

        //locate sign in and click it
        By signInLinkLocator = By.xpath("//a[contains(text(),\"Sign in\")]");
        utils.click(signInLinkLocator);

        //find the email address, input the email address
        By emailAddressIdLocator = By.xpath("//input[@id=\"email\"]");
        utils.inputValue(emailAddressIdLocator,"wiromej146@mekuron.com");

        //find the password, input the password
        By passwordLocator = By.xpath("//input[@id= \"passwd\"]");
        utils.inputValue(passwordLocator,"abc123");

        //find the sign in button, click on the sign in button
        By submitButtonLocator = By.xpath("//button[@type=\"submit\"]");
        utils.click(submitButtonLocator);

//        Thread.sleep(2000);
//
//        driver.close();
    }
}
