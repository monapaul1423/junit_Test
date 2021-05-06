package test;

import org.junit.Test;

import open_closed.CasualPersonality;

import static org.junit.Assert.assertEquals;


public class CasualPersonalityTest {
    @Test
    public void testGreetsSomeoneCasually() {
        CasualPersonality cp = new CasualPersonality();
        assertEquals("Hi bro", cp.greet());
    }
}
