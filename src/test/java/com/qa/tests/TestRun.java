package com.qa.tests;

import com.qa.base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRun extends BaseTest {

    @BeforeMethod
    public void start() {
        setup();
    }

    @Test
    public void testGoogle() {
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void end() {
        teardown();
    }
}