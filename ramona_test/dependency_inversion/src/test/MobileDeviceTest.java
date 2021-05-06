package test;

import org.junit.Test;

import dependency_inversion.MobileDevice;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MobileDeviceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenRainy() {
        MobileDevice iPhone = new MobileDevice();
        System.setOut(new PrintStream(outContent));
        iPhone.alertWeatherConditions("rainy");

        assertEquals("It is rainy", outContent.toString());
    }
    
    @Test
    public void testAlertsWhenNotRainy() {
        MobileDevice iPhone = new MobileDevice();
        System.setOut(new PrintStream(outContent));
        iPhone.alertWeatherConditions("sunny");

        assertEquals("", outContent.toString());
    }
}
