package net.optionfactory;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void correctlyComposesHello() {
        Assert.assertEquals("Hello, pippo!", Main.sayHello("pippo"));
    }
}
