package com.rcta.handson.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class LoginTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        By signInLinkLocator = By.xpath("//a[contains(text(),\"Sign in\")]");
        driver.findElement(signInLinkLocator).click();

        //find the email address, input the email address
        By emailAddressIdLocator = By.xpath("//input[@id=\"email\"]");
        driver.findElement(emailAddressIdLocator).sendKeys("wiromej146@mekuron.com");

        //find the password, input the password
        By passwordLocator = By.xpath("//input[@id= \"passwd\"]");
        driver.findElement(passwordLocator).sendKeys("abc123");

        //find the sign in button, click on the sign in button
        By submitButtonLocator = By.xpath("//button[@type=\"submit\"]");
        driver.findElement(submitButtonLocator).click();

//        Thread.sleep(2000);
//
//        driver.close();
    }
}
