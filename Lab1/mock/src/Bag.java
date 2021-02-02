package Lab1.mock.src;

import java.util.Iterator;

/**
 * @param <T>
 */

public interface Bag<T> extends Iterable<T> {

    // Adds an element to the bag
    public void add(T elm);

    // Removes a desired element from the bag
    public boolean remove(T elm);

    // Removes an element from the bag
    public void remove();

    // Removes all desired elements Elements from the bag
    public int removeAll(T elm);

    // Clears the bag, leaving it empty
    public void clear();

    // Outputs a bag of the elements with greater duplicates than the one input
    public Bag<T> moreFrequentThan(T obj);

    // Counts the number of a certain element in bag
    public int count(T elm);

    // Checks if element exist in bag
    public boolean isMember(T elm);

    // Return bag Maxsize
    public int size();

    // Checks if bag is empty
    public boolean isEmpty();

    // returns an Array of the bag
    public T[] toArray();

    // Iterator for the bag
    public Iterator<T> iterator();

    //
    public boolean equals(Bag<T> b2);

    //
    void bagAdjuster(int i);
}