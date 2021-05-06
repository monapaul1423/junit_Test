package liskov_substitution;

public class BedroomAdder {

	public void addBedroom(PenthouseSuite penthouseSuite) {
		penthouseSuite.setNumberOfBedrooms(penthouseSuite.getNumberOfBedrooms() + 1);
	}
}
