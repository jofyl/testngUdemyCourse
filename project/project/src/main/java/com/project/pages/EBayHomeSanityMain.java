package com.project.pages;

import org.testng.Assert;
import org.testng.annotations.*;

public class EBayHomeSanityMain {

    @BeforeClass
    public void beforeClassSetup() {
        System.out.println("setUp Before Class Main");
    }

    @AfterClass
    public void afterClassTearDown() {
        System.out.println("tearDown After Class Main");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("setUp Main");
    }

    @AfterMethod
    void tearDown() {
        System.out.println("tearDown Main");
    }

    @Test
    public void emptySearchTest() {
        Assert.assertEquals(1, 2, "hello assert 1 Main");
        Assert.assertEquals(1, 1, "hello assert 2 Main");
    }

    @Test
    public void emptySearchTest2() {
        Assert.assertEquals(1, 2, "hello asset 3 Main");
    }
}
