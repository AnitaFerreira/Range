import java.util.Iterator;

public class RangeIterator implements Iterator <Integer> {

    private Range element;
    private int current = element.min; //current number in the range

    @Override
    public Integer next() {

        if(hasNext() == true) {
            return current + 1; //return the next number
        } else {
            return 0; //return 0 if no more numbers are available
        }
    }

    @Override
    public boolean hasNext() {
        int next;

        if (element != null) {  //if a range is defined
            if (current < element.max) {
                current++;
                return true; //indicate more numbers are available
            }
        }


        return false; //no more numbers in the range
    }
}
