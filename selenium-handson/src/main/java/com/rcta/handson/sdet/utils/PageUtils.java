package com.rcta.handson.sdet.utils;

import com.rcta.handson.sdet.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import java.io.File;
import java.net.URL;

public abstract class PageUtils {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public PageUtils(WebDriver driver) {
        this.driver = driver;
    }

    public PageUtils(String browserName) {
        switch (browserName.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();
                break;
            case "edge":
                URL edgeDriverURL =  getClass().getClassLoader().getResource("drivers/msedgedriver.exe");
                if(edgeDriverURL == null){
                    throw new IllegalStateException("msedgedriver.exe not found in selenium-handson/src/test/resources/drivers/");
                }
                String edgeDriverPath = new File(edgeDriverURL.getFile()).getAbsolutePath();
                System.setProperty("webdriver.edge.driver",edgeDriverPath);
                this.driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                this.driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser provided -> "+browserName);
        }
    }

    public PageUtils(Browser browser){
        switch(browser){
            case CHROME:
                WebDriverManager.chromedriver().setup();;
                this.driver = new ChromeDriver();
                break;
            case EDGE:
                URL edgeDriverUrl = getClass().getClassLoader().getResource("drivers/msedgedriver.exe");
                if(edgeDriverUrl == null){
                    throw new IllegalStateException("Edge driver is missing in the framework's context path");
                }
                String edgeDriverPath = new File(edgeDriverUrl.getFile()).getAbsolutePath();
                System.setProperty("webdriver.edge.driver",edgeDriverPath);
                this.driver = new EdgeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                this.driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Running the test in this browser is not supported as of now");
        }
    }

    public PageUtils goToUrl(String url) {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized.");
        }
        driver.get(url);
        return this;
    }

    public PageUtils maximizeWindow() {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized.");
        }
        driver.manage().window().maximize();
        return this;
    }

    public PageUtils click(By webElementLocator) {
        driver.findElement(webElementLocator).click();
        return this;
    }

    public PageUtils inputValue(By webElementLocator, CharSequence input) {
        driver.findElement(webElementLocator).sendKeys(input);
        return this;
    }

    public String getVisibleText(By webElementLocator) {
        return driver.findElement(webElementLocator).getText();
    }
}