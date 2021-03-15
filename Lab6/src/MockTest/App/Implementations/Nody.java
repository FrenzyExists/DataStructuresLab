package MockTest.App.Implementations;

import MockTest.App.Abstraction.Node;

public class Nody<T> extends Node<T> {

    public Nody(T node) {
        super(node);
    }

    public Nody(T node, Node<T> nextNode) {
        super(node, nextNode);
    }
}
