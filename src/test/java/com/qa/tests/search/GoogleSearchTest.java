package com.qa.tests.search;

import com.qa.base.BaseTest;
import com.qa.pages.GooglePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleSearchTest extends BaseTest {

    GooglePage google;

    @BeforeMethod
    public void setupTest() {
        setup();
        google = new GooglePage(driver);
    }

    @Test
    public void verifySearchResults() {
        google.search("SDET jobs");

        String title = google.getTitle();
        Assert.assertTrue(title.toLowerCase().contains("sdet"));
    }

    @AfterMethod
    public void tearDownTest() {
        teardown();
    }
}