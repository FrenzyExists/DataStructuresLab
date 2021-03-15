package MockTest.App.Interfases;

/**
 * Stack Interfase, StackedQueue, ArrayStack and Linked Stack uses this
 * @param <T>
 */
public interface Stack<T> {

    /**
     * Pushes an item onto the top of this stack.
     * @param node - The node to be pushed onto this stack
     */
    void push(T node);

    /**
     * Removes the node at the top of this stack and returns that node as the
     * value of this function.
     * @return The node at the top of this stack
     */
    T pop();

    /**
     * Looks at the node at the top of this stack without removing it from the
     * stack.
     * @return The node at the top of this stack
     */
    T peek();

    /**
     * How many nodes are in this stack
     * @return number of nodes in stack
     */
    Integer size();

    /**
     * Returns the position of the node on this stack. The top of the stack is 1,
     * while the bottom is size()
     * @param node - the desired node.
     * @return the position of the desired node
     */
    Integer search(T node);

    /**
     * Is this stack empty?
     * @return true -> Yup is empty | false -> we have nodes over here!
     */
    boolean empty();

}
