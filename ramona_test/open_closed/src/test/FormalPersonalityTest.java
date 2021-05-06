package test;

import org.junit.Test;

import open_closed.FormalPersonality;

import static org.junit.Assert.assertEquals;


public class FormalPersonalityTest {
    @Test
    public void testGreetsSomeoneFormally() {
        FormalPersonality fp = new FormalPersonality();
        assertEquals("Hello sir", fp.greet());
    }
}
