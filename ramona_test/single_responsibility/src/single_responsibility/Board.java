package single_responsibility;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Board {
	
	 private int size;
	 private ArrayList<String> spots;
	
	public Board(int size) {
		this.setSize(size);
		this.setSpots(new ArrayList<String>());
		IntStream.range(0, size).forEach(index ->{
			this.getSpots().add(String.valueOf(3*index));
			this.getSpots().add(String.valueOf(3*index+1));
			this.getSpots().add(String.valueOf(3*index+2));
		});
	}

	 public ArrayList<String> valuesAt(ArrayList<Integer> indexes) {
	        ArrayList<String> values = new ArrayList<String>();
	        for (int index : indexes) {
	            values.add(this.getSpots().get(index));
	        }
	        return values;
	    }

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ArrayList<String> getSpots() {
		return spots;
	}

	public void setSpots(ArrayList<String> spots) {
		this.spots = spots;
	}

	

}
