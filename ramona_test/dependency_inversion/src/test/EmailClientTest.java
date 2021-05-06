package test;

import org.junit.Test;

import dependency_inversion.EmailClient;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class EmailClientTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenSunny() {
        EmailClient gmail = new EmailClient();
        System.setOut(new PrintStream(outContent));
        gmail.alertWeatherConditions("sunny");

        assertEquals("It is sunny", outContent.toString());
    }
    
    @Test
    public void testAlertsWhenNotSunny() {
        EmailClient gmail = new EmailClient();
        System.setOut(new PrintStream(outContent));
        gmail.alertWeatherConditions("rainny");

        assertEquals("", outContent.toString());
    }
}
