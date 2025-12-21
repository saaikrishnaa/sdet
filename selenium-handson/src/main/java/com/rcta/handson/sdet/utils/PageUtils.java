package com.rcta.handson.sdet.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageUtils {

    private WebDriver driver;

    public PageUtils(WebDriver driver){
        super();
        this.driver = driver;
    }

    public PageUtils goToUrl(String url){
        driver.get(url);
        return this;
    }

    public PageUtils maximizeWindow(){
        driver.manage().window().maximize();
        return this;
    }

    public PageUtils click(By webElementLocator){
        driver.findElement(webElementLocator).click();
        return this;
    }

    public PageUtils inputValue(By webElementLocator, CharSequence input){
      driver.findElement(webElementLocator).sendKeys(input);
      return this;
    }




}
