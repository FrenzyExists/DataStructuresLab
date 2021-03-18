package MockTest.App.Implementations.Stack;

import MockTest.App.Exceptions.EmptyStackException;
import MockTest.App.Implementations.Nody;
import MockTest.App.Interfases.Stack;

import java.util.Iterator;

public class LinkedStack<T> implements Stack<T> {
    Nody<T> head;
    Integer size = 0;

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param node - The node to be pushed onto this stack
     */
    @Override
    public void push(T node) {
        Nody<T> newNode = new Nody<T>(node, head);
        head = newNode;
        size++;
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
        T oldNode = head.get();
        Nody<T> killMe = head;
        head = (Nody<T>) head.getNextNode();
        size --;
        killMe.clear();
        return oldNode;
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
        return head.get();
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
        return null;
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

    @Override
    public Iterator iterator() {
        return null;
    }
}
