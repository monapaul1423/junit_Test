package liskov_substitution;

/**
 * Created by mrk on 4/8/14.
 */
public class Studio {
     private int squareFootage;
     private int numberOfRooms;

    public Studio() {
        this.setNumberOfRooms(0);
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getSquareFootage() {
		return squareFootage;
	}
}