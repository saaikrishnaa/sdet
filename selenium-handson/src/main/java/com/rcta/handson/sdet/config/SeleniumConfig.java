package com.rcta.handson.sdet.config;

import com.rcta.handson.sdet.utils.PageUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeleniumConfig {

    @Bean
    public WebDriver webDriver() {
        return new ChromeDriver();
    }

    @Bean
    public PageUtils pageUtils(WebDriver webDriver) {
        return new PageUtils(webDriver);
    }

}
