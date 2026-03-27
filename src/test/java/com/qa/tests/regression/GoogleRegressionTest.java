package com.qa.tests.regression;

import com.qa.base.BaseTest;
import com.qa.pages.GooglePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleRegressionTest extends BaseTest {

    GooglePage google;

    @BeforeMethod
    public void setupTest() {
        setup();
        google = new GooglePage(driver);
    }

    @Test
    public void verifySearchAndTitle() {
        google.search("Automation testing");

        String title = google.getTitle();
        Assert.assertTrue(title.contains("Automation"));
    }

    @AfterMethod
    public void tearDownTest() {
        teardown();
    }
}