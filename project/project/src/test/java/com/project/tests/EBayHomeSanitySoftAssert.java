package com.project.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EBayHomeSanitySoftAssert {

    private SoftAssert sa = new SoftAssert();

    @Test
    public void emptySearchTest() {
        sa.assertEquals(1, 2, "hello assert 1");
        sa.assertEquals(1, 1, "hello assert 2");

        sa.assertAll();
    }

    @Test
    public void emptySearchTest2() {
        sa.assertEquals(1, 2, "hello asset 3");

        sa.assertAll();
    }

}
