import java.util.Iterator;
import java.lang.Iterable;

public class Range implements Iterable <Integer> {

    public int min;
    public int max;

    public Range(int min, int max) {
        this.min = min; //constructor to set the range's minimum and maximum values
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(); //creates and returns an iterator for the range
    }


}
