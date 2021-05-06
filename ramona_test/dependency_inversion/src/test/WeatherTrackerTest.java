package test;

import org.junit.Test;

import dependency_inversion.Notifier;
import dependency_inversion.WeatherTracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


class MockNotifier implements Notifier {
    public void alertWeatherConditions(String weatherDescription) {
        System.out.print("foo");
    }
}

public class WeatherTrackerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testSetsCurrentWeatherConditions() {
        WeatherTracker tracker = new WeatherTracker();
        tracker.setCurrentConditions("cloudy");

        assertEquals("cloudy", tracker.getCurrentConditions());
    }

    @Test
    public void testNotifiesWhenWeatherChanges() {
        WeatherTracker tracker = new WeatherTracker();
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("cloudy");
        MockNotifier mockNotifier = new MockNotifier();
        tracker.notify(mockNotifier);

        assertEquals("foo", outContent.toString());
    }
}
