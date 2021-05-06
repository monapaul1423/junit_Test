package test;

import org.junit.Test;

import open_closed.Greeter;
import open_closed.Personality;

import static org.junit.Assert.assertEquals;

class MockPersonality implements Personality {
    public String greet() {
        return "foo";
    }
}

public class GreeterTest {
    @Test
    public void testGreetsSomeone() {
        MockPersonality mockPersonality = new MockPersonality();
        Greeter greeter = new Greeter(mockPersonality);

        assertEquals("foo", greeter.greet());
    }
}