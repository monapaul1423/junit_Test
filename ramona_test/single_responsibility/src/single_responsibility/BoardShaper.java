package single_responsibility;

import java.util.ArrayList;

public class BoardShaper {
    int size;

    public BoardShaper(int size) {
        this.size = size;
    }

    public ArrayList<ArrayList<Integer>> rowIndexes() {
        ArrayList<ArrayList<Integer>> rowIndexes = new ArrayList<ArrayList<Integer>>();
        for (int index = 0; index < this.size; index++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int innerIndex = 0; innerIndex < this.size; innerIndex++) {
                row.add((index*size)+(innerIndex));
            }
            rowIndexes.add(row);
        }
        return rowIndexes;
    }
}