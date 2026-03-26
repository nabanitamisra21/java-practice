package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class GooglePage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public GooglePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By searchBox = By.name("q");

    // Actions

    public void openGoogle() {
        driver.get("https://www.google.com");
    }

    public void enterSearchText(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        driver.findElement(searchBox).sendKeys(text);
    }

    public void pressEnter() {
        driver.findElement(searchBox).submit();
    }
}