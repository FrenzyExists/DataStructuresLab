package MockTest.App.Implementations.Stack;

import MockTest.App.Exceptions.EmptyStackException;
import MockTest.App.Interfases.Stack;

import java.util.Iterator;

public class VectorStack<T> implements Stack<T> {
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
     * value of this function. It is not good that this method returns null if
     * a node is not found. For example, there's a chance that a program may require
     * to store null values, and if the stack is empty and it returns null it could cause
     * many complications, and one could not tell if the null value is due of the stack
     * being empty or that the node retrieved is holding a null value. Therefore, an
     * exception must be utilized to evade such complications
     *
     * @return The node at the top of this stack
     * @throws EmptyStackException
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
     * @throws EmptyStackException
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
    public boolean isEmpty() {
        return false;
    }

    /**
     * Clears Stack. That's it
     */
    @Override
    public void clear() {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
