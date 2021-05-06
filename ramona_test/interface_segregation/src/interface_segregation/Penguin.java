package interface_segregation;

import lombok.Data;

@Data
public class Penguin implements SwimmingCreature, FeatheredCreature {
    private String currentLocation;
    private int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.setNumberOfFeathers(initialFeatherCount);
    }

    public void swim() {
        this.setCurrentLocation("in the water");
    }

    public void molt() {
        this.setNumberOfFeathers(this.getNumberOfFeathers() - 4);
    }

	public int getNumberOfFeathers() {
		return numberOfFeathers;
	}

	public void setNumberOfFeathers(int numberOfFeathers) {
		this.numberOfFeathers = numberOfFeathers;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
}
