package MockTest.App.Implementations.Queue;

import MockTest.App.Exceptions.EmptyQueueException;
import MockTest.App.Implementations.Nody;
import MockTest.App.Interfases.Queue;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T> {
    private Integer size = 0;

    // reference to the first node in the linked list;
    // reference to the last node in the linked list;
    private Nody<T> first, last;


    /**
     * @return
     */
    @Override
    public Integer size() {
        return this.size;
    }

    /**
     * Inserts the specified element into this queue if it is possible to do so
     * immediately without violating capacity restrictions
     *
     * @param node - The node to be enqueued
     */
    @Override
    public void enqueue(T node) {
         Nody<T> newNode = new Nody<T>(node, null);
         if (size == 0) {
             first = last = newNode;
         } else {
             last.setNextNode(newNode);
             last = newNode;
         }
        size++;
    }

    /**
     * Removes and returns the node at the top of this queue.
     *
     * @return the node at the top of this queue
     * @throws EmptyQueueException if the queue is empty before the operation.
     */
    @Override
    public T dequeue() {
        System.out.println(size);
        if(isEmpty()) {
            throw new EmptyQueueException("Bitch your queue is empty");
        }
        Nody<T> nodyMody = first;
        if(size == 1){
            last = null;
        }
        first = (Nody<T>) first.getNextNode();
        size--;
        return nodyMody.clear();
    }

    /**
     * enqueues an element if possible
     *
     * @param node - a new node to the queue
     * @return true -> if it successfully enqueues the node | false -> if it violates capacity
     */
    @Override
    public boolean offer(T node) {
        //fix
        if (size == 0) {
            enqueue(node);
            return true;
        }
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
        return size == 0;
    }

    @Override
    public void clear() {
        Nody<T> ntd = first;
        while (first != null) {
            ntd.clear();
            first = (Nody<T>) first.getNextNode();
            ntd = first;
        }

        last = null;
        size = 0;
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return null;
    }




}

