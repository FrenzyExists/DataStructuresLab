package MockTest.App.Abstraction;

/**
 * Abstraction of Node, in case it could much more than just data and a
 * pointer
 * @param <T> -> Generics
 */
public abstract class Node<T> {
    private T node;
    private Node<T> newNodeA;
    private Node<T> newNodeB;

    /**
     *  Single Node with data, super simple
     * @param node
     */
    public Node(T node) {
        this.node = node;
        this.newNodeA = null;
    }

    /**
     *  Single Node with data and pointer
     * @param node
     * @param newNodeA
     */
    public Node(T node, Node<T> newNodeA) {
        this.node = node;
        this.newNodeA = newNodeA;
    }

    /**
     * Single Node with data and two Pointers
     * @param node
     * @param newNodeA
     * @param newNodeB
     */
    public Node(T node, Node<T> newNodeA, Node<T> newNodeB) {
        this.node = node;
        this.newNodeA = newNodeA;
        this.newNodeB = newNodeB;
    }
}
