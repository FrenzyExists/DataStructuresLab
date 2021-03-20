package MockTest.App.Implementations.Queue;

import MockTest.App.Exceptions.EmptyQueueException;
import MockTest.App.Interfases.Queue;

import java.util.Iterator;

public class ArrayQueue<T> implements Queue<T> {
    private static final Integer INITIAL_SIZE = 16; // Start size, picked 16 cuz of 2^n
    private T[] ArrUnderHood = (T[]) new Object[INITIAL_SIZE]; //The Array Under the Hood
    Integer size = 0;

    /**
     * @return
     */
    @Override
    public Integer size() {
        return size;
    }

    /**
     * Inserts the specified element into this queue if it is possible to do so
     * immediately without violating capacity restrictions
     *
     * @param node - The node to be enqueued
     */
    @Override
    public void enqueue(T node) {

    }

    /**
     * Removes and returns the node at the top of this queue.
     *
     * @return the node at the top of this queue
     * @throws EmptyQueueException if the queue is empty before the operation.
     */
    @Override
    public T dequeue() {
        return null;
    }

    /**
     * enqueues an element if possible
     *
     * @param node - a new node to the queue
     * @return true -> if it successfully enqueues the node | false -> if it violates capacity
     */
    @Override
    public boolean offer(T node) {
        return false;
    }

    /**
     * Retrieves, but does not dequeue the node that is at the top of the queue
     *
     * @return The node at the top of the queue
     * @throws EmptyQueueException
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyQueueException("Bitch your queue is empty");
        }

        return null;



    }

    /**
     * Returns true if this queue contains no nodes
     *
     * @return true -> no nodes in here | false -> there's nodes in here
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<T> iterator() {
        // I have no idea what to with this...
        return null;
    }
}
