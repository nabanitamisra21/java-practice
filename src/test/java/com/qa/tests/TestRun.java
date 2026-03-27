package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.GooglePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRun extends BaseTest {

    GooglePage google;

    @BeforeMethod
    public void start() {
        setup();
        google = new GooglePage(driver);
    }

    @Test
    public void testGoogleSearch() {
        google.search("SDET");

        String title = google.getTitle();
        Assert.assertTrue(title.contains("SDET"));
    }

    @AfterMethod
    public void end() {
        teardown();
    }
}