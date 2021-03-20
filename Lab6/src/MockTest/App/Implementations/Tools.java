package MockTest.App.Implementations;

import MockTest.App.Implementations.Queue.LinkedQueue;
import MockTest.App.Interfases.Queue;

/**
 * A random set of tools. That's it
 */
public class Tools {


    // External method to determine the size of a given queue.
    // Assuming that the queue does not have a method to determine
    // its size.
    public static <T> int size(Queue<T> q) {
        int counter = 0;
        Queue<T> qbit = new LinkedQueue<>();
        while (!q.isEmpty()) {
            qbit.enqueue(q.dequeue());
            counter++;
        }
        while (!qbit.isEmpty()) {
            q.enqueue(qbit.dequeue());
        }
        qbit.clear();

        return counter;
    }
    /**
     * Generates a new queue containing the elements of two given queues,
     * which are assume to be sorted in non-decreasing order from first to
     * last. Elements in the queues are integer values.
     * @param q1 one of the queues of sorted numbers
     * @param q2 the other queue of sorted numbers
     * @return a sorted queue containing the elements in q1 and q2.
     */
    public static <T> Queue<T> combineQueue(Queue<T> q1, Queue<T> q2 ) {
        Queue<T> q = new LinkedQueue<>();


        return q;
    }



}
