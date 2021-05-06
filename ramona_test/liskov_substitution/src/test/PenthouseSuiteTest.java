package test;

import org.junit.Test;

import liskov_substitution.PenthouseSuite;

import static org.junit.Assert.assertEquals;

public class PenthouseSuiteTest {
    @Test
    public void testInitializedWithFourBedrooms() {
        PenthouseSuite penthouse = new PenthouseSuite();
        assertEquals(4, penthouse.getNumberOfBedrooms());
    }

    @Test
    public void testSetsSquareFootage() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1600);

        assertEquals(1600, penthouse.getSquareFootage());
    }
}