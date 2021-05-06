package interface_segregation;

public class Eagle implements FlyingCreature,FeatheredCreature {

	 private String currentLocation;
     private int numberOfFeathers;
    
	public Eagle(int numberOfFeathers) {
		this.setNumberOfFeathers(numberOfFeathers);
	}

	public void fly() {
        this.setCurrentLocation("in the air");
    }

    public void molt() {
        this.setNumberOfFeathers(this.getNumberOfFeathers() - 1);
    }

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public int getNumberOfFeathers() {
		return numberOfFeathers;
	}

	public void setNumberOfFeathers(int numberOfFeathers) {
		this.numberOfFeathers = numberOfFeathers;
	}

}
