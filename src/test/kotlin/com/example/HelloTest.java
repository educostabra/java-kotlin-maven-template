package com.example;

import org.junit.Test;

import static com.example.Hello.hello;
import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void helloWorldTest() {
        assertEquals("Hello, World!", hello());
    }
}
