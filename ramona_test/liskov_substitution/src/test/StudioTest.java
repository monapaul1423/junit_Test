package test;

import org.junit.Test;

import liskov_substitution.Studio;

import static org.junit.Assert.assertEquals;

public class StudioTest {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        assertEquals(0, studio.getNumberOfRooms());
    }

    @Test
    public void testSetsSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);

        assertEquals(550, studio.getSquareFootage());
    }
}
