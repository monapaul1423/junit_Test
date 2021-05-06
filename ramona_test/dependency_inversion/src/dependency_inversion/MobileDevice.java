package dependency_inversion;

/**
 * MobileDevice class implementation of notifier
 * 
 * @author mona
 * @since 05-06-2021
 * @version 0.1
 *
 */
public class MobileDevice implements Notifier {

	/**
	 * alertWeatherConditions method prints if weather is rainy
	 * 
	 * @param weatherConditions
	 */
	public void alertWeatherConditions(String weatherConditions) {
		if (("rainy").equals(weatherConditions))
			System.out.print("It is rainy");
	}
}
