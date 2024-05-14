package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testJoin() throws Exception {
        Thread.currentThread().sleep(3000);
        assertEquals("Joined string didn't match", "1 2 3", Example.join("1", "2", "3"));
    }

}
