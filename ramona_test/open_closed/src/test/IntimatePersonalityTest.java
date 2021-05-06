package test;


import org.junit.Test;

import open_closed.IntimatePersonality;

import static org.junit.Assert.assertEquals;

public class IntimatePersonalityTest {
    @Test
    public void testGreetsSomeoneIntimately() {
        IntimatePersonality ip = new IntimatePersonality();
        assertEquals("Hi dude", ip.greet());
    }
}