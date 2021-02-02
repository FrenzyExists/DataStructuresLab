package Lab1.mock.src;

import javax.naming.SizeLimitExceededException;
import java.util.Iterator;

public class Baggy<T> implements Bag<T> {
    private final static Integer DEFAULT_SIZE = 32;
    private Integer currentSize;
    private Integer size;
    private T[] bagArray;

    @Override
    public void add(T newElm) throws SizeLimitExceededException {
        if(currentSize == size()) {
            throw new SizeLimitExceededException("Bag reached maximum size");
        }
        bagArray[currentSize++] = newElm;
    }

    @Override
    public boolean remove(T elm) {
        for (int i=0; i<size(); i++) {
            if(bagArray[i].equals(elm)) {
                bagArray[i] = bagArray[--currentSize];
                bagArray[currentSize] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove() {

    }

    @Override
    public int removeAll(T elm) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public Bag<T> moreFrequentThan(T obj) {
        return null;
    }

    @Override
    public int count(T elm) {
        return 0;
    }

    @Override
    public boolean isMember(T elm) {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public boolean equals(Bag<T> b2) {
        return false;
    }

    @Override
    public void bagAdjuster(int i) {

    }

    /**
     * This method receives a Bag<T> as parameter and removes all duplicates from it.
     * The method returns the amount of duplicates removed from the bag.
     * @param targetBag
     * @param <T>
     * @return number of duplicates removed
     */
    public static <T> int removeDuplicate(Bag<T> targetBag) {
        int counter = 0;
        for (T entry:targetBag) {
            while(targetBag.count(entry) > 1) {
                targetBag.remove(entry);
                counter++;
            }
        }
        return counter; //Dummy Return
    }
}
