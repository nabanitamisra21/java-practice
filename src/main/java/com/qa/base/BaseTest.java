package com.qa.base;

import com.qa.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;
    ConfigReader config;

    public void setup() {
        config = new ConfigReader();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(config.getUrl());
    }

    public void teardown() {
        driver.quit();
    }
}