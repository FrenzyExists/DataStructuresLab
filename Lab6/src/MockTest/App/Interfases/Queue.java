package MockTest.App.Interfases;

import MockTest.App.Exceptions.EmptyQueueException;

public interface Queue<T> extends Iterable<T> {

    /**
     *
     * @return
     */
    Integer size();

    /**
     * Inserts the specified element into this queue if it is possible to do so
     * immediately without violating capacity restrictions
     * @param node - The node to be enqueued
     */
    void enqueue(T node);


    /**
     * Removes and returns the node at the top of this queue.
     * @return the node at the top of this queue
     * @throws EmptyQueueException if the queue is empty before the operation.
     */
    T dequeue();

    /**
     * enqueues an element if possible
     * @param node - a new node to the queue
     * @return true -> if it successfully enqueues the node | false -> if it violates capacity
     */
    boolean offer(T node);

    /**
     * Retrieves, but does not dequeue the node that is at the top of the queue
     * @return The node at the top of the queue
     */
    T peek();

    /**
     * Returns true if this queue contains no nodes
     * @return true -> no nodes in here | false -> there's nodes in here
     */
    boolean isEmpty();

}
