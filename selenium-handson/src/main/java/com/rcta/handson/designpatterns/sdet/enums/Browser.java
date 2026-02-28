package com.rcta.handson.designpatterns.sdet.enums;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.net.URL;

public enum Browser {

    CHROME("chrome", () -> {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }),
    EDGE("edge", () -> {
        URL edgeDriverUrl = Browser.class.getClassLoader().getResource("drivers/msedgedriver.exe");
        if (edgeDriverUrl == null) {
            throw new IllegalStateException("msedgedriver.exe missing");
        }
        String edgeDriverPath = new File(edgeDriverUrl.getFile()).getAbsolutePath();
        System.setProperty("webdriver.edge.driver", edgeDriverPath);
        return new EdgeDriver();
    }),
    FIREFOX("firefox", () -> {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    });

    private final String browserName;
    private final DriverSupplier driverSupplier;

    Browser(String name, DriverSupplier supplier) {
        this.browserName = name;
        this.driverSupplier = supplier;
    }

    public WebDriver createDriver() {
        return driverSupplier.get();
    }


    @FunctionalInterface
    private interface DriverSupplier {
        WebDriver get();
    }

    public static Browser fromString(String browserName) {
        if (browserName == null || browserName.trim().isEmpty()) {
            browserName = System.getProperty("browser", "chrome");
        }
        try {
            return valueOf(browserName.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid browser:" + browserName);
        }
    }

}
