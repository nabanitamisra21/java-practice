package com.qa.tests.validation;

import com.qa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleTitleTest extends BaseTest {

    @BeforeMethod
    public void setupTest() {
        setup();
    }

    @Test
    public void verifyGoogleTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
    }

    @AfterMethod
    public void tearDownTest() {
        teardown();
    }
}