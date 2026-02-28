package com.rcta.handson.designpatterns.sdet.utils;

import com.rcta.handson.designpatterns.sdet.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public abstract class PageUtils {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public PageUtils(WebDriver driver) {
        this.driver = driver;
    }

//    public PageUtils(String browserName) {
//        switch (browserName.toLowerCase()) {
//
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                this.driver = new ChromeDriver();
//                break;
//            case "edge":
//                URL edgeDriverURL =  getClass().getClassLoader().getResource("drivers/msedgedriver.exe");
//                if(edgeDriverURL == null){
//                    throw new IllegalStateException("msedgedriver.exe not found in selenium-handson/src/test/resources/drivers/");
//                }
//                String edgeDriverPath = new File(edgeDriverURL.getFile()).getAbsolutePath();
//                System.setProperty("webdriver.edge.driver",edgeDriverPath);
//                this.driver = new EdgeDriver();
//                break;
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                this.driver = new FirefoxDriver();
//                break;
//            default:
//                throw new IllegalArgumentException("Unsupported browser provided -> "+browserName);
//        }
//    }

    public PageUtils(Browser browser){
        this.driver = browser.createDriver();
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