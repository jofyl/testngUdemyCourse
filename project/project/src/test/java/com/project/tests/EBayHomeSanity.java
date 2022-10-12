package com.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EBayHomeSanity {

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
