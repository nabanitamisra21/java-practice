package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.GooglePage;
import org.testng.annotations.Test;

public class TestRun extends BaseTest {

    @Test
    public void testGoogleSearch() {
        setup();

        GooglePage google = new GooglePage(driver);
        google.openGoogle();
        google.enterSearchText("SDET interview");
        google.pressEnter();

        teardown();
    }
}