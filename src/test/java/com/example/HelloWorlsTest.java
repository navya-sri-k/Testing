package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello, Jenkins!", HelloWorld.getMessage());
    }
}
