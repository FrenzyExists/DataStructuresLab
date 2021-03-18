package MockTest.App.Implementations;

import MockTest.App.Abstraction.Node;

public class Nody<T> extends Node<T> {

    public Nody(T node) {
        super(node);
    }

    public Nody(T node, Node<T> nextNode) {
        super(node, nextNode);
    }

    public void setNewNode(T node) {
        this.node = node;
    }

    public void setNextNode(Nody<T> nextNode) {
        this.newNodeA = nextNode;
    }

    public Node<T> getNextNode() {
        return this.newNodeA;
    }

}
