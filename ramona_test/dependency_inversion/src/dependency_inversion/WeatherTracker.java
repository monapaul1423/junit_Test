package dependency_inversion;

/**
 * WeatherTracker class which hold the implementation of weather information
 * 
 * @author mona
 * @since 05-06-2021
 * @version 0.1
 *
 */
public class WeatherTracker {

	private String currentConditions;

	/** setter */
	public void setCurrentConditions(String weatherDescription) {
		this.currentConditions = weatherDescription;
	}

	/** getter */
	public String getCurrentConditions() {
		return currentConditions;
	}

	/**
	 * notify method is to alert the weather conditions
	 * @param notifier
	 */
	public void notify(Notifier notifier) {
		notifier.alertWeatherConditions(getCurrentConditions());
	}
}
