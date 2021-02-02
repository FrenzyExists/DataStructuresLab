package Lab1.practice.src.bag;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Implementation of a Static Sized Bag
 * using an array of a generic type E
 *
 * @author Fernando J. Bermudez
 *
 * @param <E>
 */
public class ArrayBag<E> implements Bag<E> {

    private int currentSize;
    private E[] elements;

    private final static int DEFAULT_SIZE = 25;

    public ArrayBag() {
        this(DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    public ArrayBag(int maxCapacity) {
        if(maxCapacity < 1) {
            elements = (E[]) new Object[DEFAULT_SIZE];
        } else {
            elements = (E[]) new Object[maxCapacity];
        }

        currentSize = 0;
    }


    private class BagIterator<T> implements Iterator<T>{

        int currentPosition;


        public boolean hasNext() {
            return currentPosition < size();
        }


        @SuppressWarnings("unchecked")
        public T next() {
            if(this.hasNext()) {
                return (T) elements[currentPosition++];
            } else {
                throw new NoSuchElementException();
            }
        }
    }

    public void add(E elm) {
        if(size() == elements.length)
            throw new IllegalArgumentException("Bag is Full!");


        elements[currentSize++] = elm;

    }

    public void remove() {
        if(!this.isEmpty()){
            elements[currentSize] = null;
            currentSize--;
        }
    }

    public boolean remove(E elm) {
        for (int i = 0; i < size(); i++) {
            if(elements[i].equals(elm)) {
                elements[i] = elements[--currentSize];
                elements[currentSize] = null;
                return true;
            }
        }
        return false;
    }

    public int removeAll(E elm) {
        int copiesRemoved = 0;

        while(remove(elm))
            copiesRemoved++;


        return copiesRemoved;
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++)
            elements[i] = null;

        currentSize = 0;
    }

    public int count(E elm) {
        int copies = 0;

        for (int i = 0; i < size(); i++)
            if(elements[i].equals(elm)) copies++;

        return copies;
    }

    public boolean isMember(E elm) {
        return count(elm) > 0;
    }

    public int size() {
        return currentSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @SuppressWarnings("unchecked")
    public E[] toArray() {
        Object[] arr = new Object[size()];

        for (int i = 0; i < size(); i++) {
            arr[i] = (Object) elements[i];
        }
        return (E[]) arr;
    }

    public Iterator<E> iterator() {
        return new BagIterator<E>();
    }

    @Override
    public boolean equals(Bag<E> b2) {
        E[] B = b2.toArray();
        E[] A = toArray();
        return Arrays.equals(B, A);
    }

    /**
     * Consider a member method for the Bag ADT called bagAdjuster(). This method receives an
     * integer n as parameter and modifies the target bag such that there is exactly n copies of each
     * element in the bag. Notice that this method is void and modifies the target bag, it does
     * not create a new instance of the target bag.
     * @param i
     */
    @Override
    public void bagAdjuster(int i) {
        for(E entry:this.toArray()) {
            while(this.count(entry) > i) {
                this.remove(entry);
            }
            while ((this.count(entry) < i)) {
                this.add(entry);
            }
        }
    }

    /**
     * ADD YOUR CODE HERE
     *
     * Add your method implementations
     * of the prototypes you added in the interface
     *
     */


}
