package net.optionfactory;


import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {
    @Test
    public void correctlyComposesHello() {
        Assert.assertEquals("Hello, pippo!", Greeter.sayHello("pippo"));
    }
}
