package Lab1.practice.src.bag;

import java.util.Iterator;

/**
 *
 * @author Fernando J. Bermudez
 *
 * @param <E>
 */

public interface Bag<E> extends Iterable<E> {

    public void add(E elm);
    public boolean remove(E elm);
    public void remove();
    public int removeAll(E elm);
    public void clear();
    public int count(E elm);
    public boolean isMember(E elm);
    public int size();
    public boolean isEmpty();
    public E[] toArray();
    public Iterator<E> iterator();
    public boolean equals(Bag<E> b2);

    /**
     *	ADD YOUR CODE HERE
     *
     *	What two method prototypes
     *	do you need to add here?
     *
     */
    void bagAdjuster(int i);




}
