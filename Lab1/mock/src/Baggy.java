package Lab1.mock.src;

import java.util.Iterator;

public class Baggy<T> implements Bag<T> {

    @Override
    public void add(T elm) {

    }

    @Override
    public boolean remove(T elm) {
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
        return 0;
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
