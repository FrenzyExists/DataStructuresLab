package MockTest.App.Interfases;

public interface Queue<T> {

    /**
     *
     * @return
     */
    int size();

    /**
     *
     */
    void enqueue();

    /**
     *
     * @return
     */
    T dequeue();

    /**
     *
     * @return
     */
    T element();

    /**
     *
     * @param node
     * @return
     */
    boolean offer(T node);

    /**
     *
     * @return
     */
    T peek();
}
