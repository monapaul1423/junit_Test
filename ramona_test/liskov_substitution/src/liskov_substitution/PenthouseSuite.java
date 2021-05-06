package liskov_substitution;

/**
 * Created by mrk on 4/8/14.
 */
public class PenthouseSuite {
     private int squareFootage;
     private int numberOfBedrooms;

    public PenthouseSuite() {
        this.setNumberOfBedrooms(4);
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getSquareFootage() {
		return squareFootage;
	}
}
