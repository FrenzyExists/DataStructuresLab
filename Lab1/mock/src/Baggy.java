package Lab1.mock.src;

import javax.naming.SizeLimitExceededException;
import java.util.*;

public class Baggy<T> implements Bag<T> {
    private final static Integer DEFAULT_SIZE = 32;
    private Integer currentSize;
    private Integer size;
    private T[] bagArray;

    @SuppressWarnings("unchecked")
    public Baggy() {
        bagArray = (T[]) new Object[DEFAULT_SIZE];
    }

    @SuppressWarnings("unchecked")
    public Baggy(int maxCapacity) {
        if (maxCapacity < 1) {
            throw new IllegalArgumentException("Bag size must be equal or larger than 1");
        } else {
            bagArray = (T[]) new Object[maxCapacity];    
        }
    }

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
        if(!this.isEmpty()){
            bagArray[currentSize-1] = null;
            currentSize--;
        }
    }

    @Override
    public int removeAll(T elm) {
        int copiesRemoved = 0;
        while(remove(elm))
            copiesRemoved++;
        return copiesRemoved;
    }

    @Override
    public void clear() {
        Arrays.fill(bagArray, null);
        currentSize = 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Bag<T> moreFrequentThan(T obj) throws SizeLimitExceededException {
        Bag frequentObjects = new Baggy(size());
        int repetitions = this.count(obj);
        if(isEmpty()) {
            return frequentObjects;
        }
        for(T entry : bagArray) {
            if(this.count(entry) > repetitions && !frequentObjects.isMember(entry)) {
                frequentObjects.add(entry);
            }
        }
        return frequentObjects;

    }

    @Override
    public int count(T elm) {
        int counter = 0;
        for (T entry : bagArray) {
            if (entry.equals(elm)) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean isMember(T elm) {
        for (T entry : bagArray ) {
            if (entry.equals(elm)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public T[] toArray() {
        List<Object> baggyArray = new ArrayList<Object>(size());
        for (T entry : bagArray) {
            baggyArray.add(entry);
        }
        return (T[]) baggyArray.toArray();
    }

    @Override
    public Iterator<T> iterator() {
        return new BagIterator<T>();
    }

    @Override
    public boolean equals(Bag<T> b2) {
        return false;
    }

    /**
     * This method receives an integer n as parameter and modifies the target bag such that
     * there is exactly n copies of each element in the bag. Notice that this method is
     * void and modifies the target bag, it does not create a new instance of the target bag.
     * @param i
     */
    @Override
    public void bagAdjuster(int i) throws SizeLimitExceededException {
        for(T entry:this.toArray()) {
            while(this.count(entry) > i) {
                this.remove(entry);
            }
            while ((this.count(entry) < i)) {
                this.add(entry);
            }
        }
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
        return counter;
    }

    private class BagIterator<T> implements Iterator<T> {
        int currentPosition;
        public boolean hasNext() {
            return currentPosition < size();
        }
        @SuppressWarnings("unchecked")
        public T next() {
            if(this.hasNext()) {
                return (T) bagArray[currentPosition++];
            } else {
                throw new NoSuchElementException();
            }
        }
    }


}
