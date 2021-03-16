package MockTest.App.Implementations.Stack;

import MockTest.App.Interfases.Stack;

import java.util.Iterator;

public class ArrayStack<T> implements Stack<T> {
    private static final Integer INITIALSIZE = 16; // Start size, picked 16 cuz of 2^n
    private T[] ArrUnderHood; //The Array Under the Hood
    Integer size = 0;

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param node - The node to be pushed onto this stack
     */
    @Override
    public void push(T node) {

    }

    /**
     * Removes the node at the top of this stack and returns that node as the
     * value of this function.
     *
     * @return The node at the top of this stack
     */
    @Override
    public T pop() {
        return null;
    }

    /**
     * Looks at the node at the top of this stack without removing it from the
     * stack.
     *
     * @return The node at the top of this stack
     */
    @Override
    public T peek() {
        return null;
    }

    /**
     * How many nodes are in this stack
     *
     * @return number of nodes in stack
     */
    @Override
    public Integer size() {
        return null;
    }

    /**
     * Returns the position of the node on this stack. The top of the stack is 1,
     * while the bottom is size()
     *
     * @param node - the desired node.
     * @return the position of the desired node
     */
    @Override
    public Integer search(T node) {
        return null;
    }

    /**
     * Is this stack empty?
     *
     * @return true -> Yup is empty | false -> we have nodes over here!
     */
    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
