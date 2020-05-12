package com.heiio.book.controller;

import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = { "unit" })
public class DefaultControllerTest {

    @Mock
    private DefaultController defaultController;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testHelloWorld() {
        when(defaultController.helloWorld()).thenReturn("Hello spring boot");
        Assert.assertTrue(defaultController.helloWorld() == "Hello spring boot");
    }

    @Test
    public void testTest() {
        when(defaultController.helloWorld()).thenReturn("Hello spring boot");
        Assert.assertTrue(defaultController.helloWorld() == "Hello spring boot");
    }
}