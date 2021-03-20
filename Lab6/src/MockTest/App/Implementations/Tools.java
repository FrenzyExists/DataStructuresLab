package MockTest.App.Implementations;

import MockTest.App.Implementations.IndexList.ArrayIndexList;
import MockTest.App.Implementations.Queue.LinkedQueue;
import MockTest.App.Interfases.IndexList;
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

    /**
     *
     * @param brackets
     * @return
     */
    public static boolean checkBalanced(String brackets) {

        return false;
    }

    /**
     *
     * @param thing
     * @return
     */
    public static String convertToPostfix(String thing) {

        return thing;
    }

    /**
     *
     * @param posfix
     * @return
     */
    public static double evaluatePostfix(String posfix) {
        double res = 0.0;

        return res;
    }

    /**
     *
     * @param infix
     * @return
     */
    public static double evaluateInfix(String infix) {
        double res = 0.0;

        return res;
    }

    /**
     *
     * @param palindrome
     * @return
     */
    public static boolean isPalindrome(String palindrome) {

        return true;
    }

    /**
     *
     * @param list
     * @param node
     * @param <T>
     * @return
     */
    public static <T> IndexList<Integer> indexesOf(IndexList<T> list, T node){
        IndexList<Integer> x = new ArrayIndexList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(node)) {
                x.add(i);
            }
        }
        return x;

    }
}
