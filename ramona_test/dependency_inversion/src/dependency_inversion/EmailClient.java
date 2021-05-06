package dependency_inversion;

/**
 * EmailClient class implementation of notifier
 * 
 * @author mona
 * @since 05-06-2021
 * @version 0.1
 *
 */
public class EmailClient implements Notifier {

	/**
	 * alertWeatherConditions method is to print sunny weather
	 * 
	 * @param weatherConditions
	 */
	public void alertWeatherConditions(String weatherConditions) {
		if (("sunny").equals(weatherConditions))
			System.out.print("It is sunny");
	}
}
