package MockTest.App.Implementations.Stack;

import MockTest.App.Exceptions.EmptyStackException;
import MockTest.App.Interfases.Stack;

import java.util.Iterator;

public class ArrayStack<T> implements Stack<T> {
    private static final Integer INITIAL_SIZE = 16; // Start size, picked 16 cuz of 2^n
    private T[] ArrUnderHood = (T[]) new Object[INITIAL_SIZE]; //The Array Under the Hood
    Integer size = 0;
    /**
     * Pushes an item onto the top of this stack.
     *
     * @param node - The node to be pushed onto this stack
     */
    @Override
    public void push(T node) {
        if (ArrUnderHood.length/2 == size) {
            doubleSize();
        }
        ArrUnderHood[size++] = node;
    }

    /**
     * Removes the node at the top of this stack and returns that node as the
     * value of this function.
     *
     * @return The node at the top of this stack
     * @throws EmptyStackException
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException("Dude, your stack is empty");
        }
        T Bobby = ArrUnderHood[size-1];
        ArrUnderHood[size--] = null;
        return Bobby;

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
        if (isEmpty()) {
            throw new EmptyStackException("Dude, your stack is empty");
        }
        return ArrUnderHood[size-1];
    }

    /**
     * How many nodes are in this stack
     *
     * @return number of nodes in stack
     */
    @Override
    public Integer size() {
        return size;
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
        for (int i=0 ; i<size ; i++ ) {
            if (ArrUnderHood[i].equals(node)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Is this stack empty?
     *
     * @return true -> Yup is empty | false -> we have nodes over here!
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Clears Stack. That's it
     */
    @Override
    public void clear() {
        ArrUnderHood = (T[]) new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        // Ni puta idea lo que va aqui :v

        return null;
    }

    private void doubleSize() {
        T[] newArrUnderTheHood = (T[]) new Object[ArrUnderHood.length * 2];
        System.arraycopy(ArrUnderHood, 0, newArrUnderTheHood, 0, ArrUnderHood.length);
        ArrUnderHood = newArrUnderTheHood;
    }
}

