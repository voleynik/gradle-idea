package com.gradle.helloworld;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {

    @Test
    public void test(){
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        HelloWorld.print(new PrintStream(os));
        Assert.assertEquals("Hello World!", os.toString().trim());
    }
}
