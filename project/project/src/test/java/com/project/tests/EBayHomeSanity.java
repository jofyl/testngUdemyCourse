package com.project.tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class EBayHomeSanity {

    @BeforeClass
    public void beforeClassSetup() {
        System.out.println("setUp Before Class");
    }

    @AfterClass
    public void afterClassTearDown() {
        System.out.println("tearDown After Class");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("setUp");
    }

    @AfterMethod void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    public void emptySearchTest() {
        Assert.assertEquals(1, 2, "hello assert 1");
        Assert.assertEquals(1, 1, "hello assert 2");
    }

    @Test
    public void emptySearchTest2() {
        Assert.assertEquals(1, 2, "hello asset 3");
    }
}
