package MockTest.App.Implementations.Queue;

import MockTest.App.Exceptions.EmptyQueueException;
import MockTest.App.Interfases.Queue;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T> {
    /**
     * @return
     */
    @Override
    public int size() {
        return 0;
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
     */
    @Override
    public T peek() {
        return null;
    }

    /**
     * Returns true if this queue contains no nodes
     *
     * @return true -> no nodes in here | false -> there's nodes in here
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
