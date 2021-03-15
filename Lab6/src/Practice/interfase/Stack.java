package Practice.interfase;

/**
 * Stack Interfase, StackedQueue, ArrayStack and Linked Stack uses this
 * @param <T>
 */
public interface Stack<T> {

    /**
     * Pushes an item onto the top of this stack.
     * @param node
     */
    void push(T node);

    /**
     *
     * @return
     */
    T pop();

    /**
     *
     * @return
     */
    T peek();

    /**
     *
     * @return
     */
    Integer size();

    Integer search(T node);

    boolean empty();

}
